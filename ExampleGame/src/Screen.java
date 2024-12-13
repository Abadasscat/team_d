import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Screen extends Canvas implements ComponentListener, KeyListener{
	private Graphics bg;
	private Image offScreen;
	private Dimension dim;
	
	//private Title title = new Title();
	private Note note=new Note(getWidth());
	private DuckHome home=new DuckHome();
	private Duck duck=new Duck();
	private TilePattern pattern = new TilePattern(note);
	private TilePatternManager patternManager = new TilePatternManager(); 
	private SimpleMusicPlayer musicPlayer; // 선택된 노래 로드; // 음악 플레이어	
	
	private int countNumber=0;
	public int stage = 4;
	
	public Screen(String songPath) {
		// 노래에 맞는 패턴 가져오기
	    List<TileBeat> tilePattern = patternManager.getPattern(songPath);
	    pattern.setPattern(tilePattern);
		
	    musicPlayer = new SimpleMusicPlayer(songPath);
		addComponentListener(this);
		
		setFocusable(true);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			public void run() {
				repaint();
				counting();
			}
		}, 0, 1);
		
		if (!songPath.isEmpty()) {
            musicPlayer.play(); // 노래 시작
            pattern.startPattern();
            stage = 4; // 바로 리듬 게임 시작
        }
	}

	private void initBuffer() {
		this.dim=getSize();
		this.offScreen=createImage(dim.width, dim.height);
		this.bg=this.offScreen.getGraphics();
		
		duck.setPosition(dim.width-dim.width/3, 0, dim.width/3*1, dim.height/3*2);
	}
	
	public void counting() {
		this.countNumber++;
	}
	
	public int getCount() {
		return this.countNumber;
	}
	
	@Override
	public void paint(Graphics g) {
		bg.clearRect(0, 0, dim.width, dim.height);
		
	    if (stage == 0) {
	    	//title.draw(bg, this);
	    } else if (stage == 2) {
	    	//main.draw(bg, this);
	    	//main.setBounds(0, 0, dim.width, dim.height);
            //main.paint(bg);
	    } else if (stage == 3) {
	    	
	    } else if (stage == 4) {
	    	note.draw(bg, this);
	    	home.draw(bg, this);
	    	duck.draw(bg, this);
	    } else if (stage == 5) {
	   
	    } 
	    g.drawImage(offScreen, 0, 0, this);
	}

	public void setstage(int stage) {
        this.stage = stage;
    }

	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		paint(g);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}
		

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		initBuffer();
		int screenWidth = getWidth();
	    note.updateLanePositions(screenWidth); // 화면 크기가 변경될 때 타일 위치 업데이트
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

}