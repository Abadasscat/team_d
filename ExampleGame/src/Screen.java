import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class Screen extends Canvas implements ComponentListener, KeyListener{
	private Graphics bg;
	private Image offScreen;
	private Dimension dim;
	
	private Title title = new Title();
	private Note note=new Note();
	private DuckHome home=new DuckHome();
	private Duck duck=new Duck();
	//private GamePanel gamepanel = new GamePanel(); // 리듬 게임 추가
	
	private int countNumber=0;
	public int stage = 4;
	
	public Screen() {
		
		//duck.setPosition(540, 0, 250, 350);
		//Tile.setPosition(540, 0, 250, 350);
		//duck.setPosition(dim.width, dim.height);
		
		//duck.setPosition(540, 0, 250, 350);
		addComponentListener(this);
		
		setFocusable(true);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			public void run() {
				repaint();
				counting();
			}
		}, 0, 1);
	}

	private void initBuffer() {
		this.dim=getSize();
		this.offScreen=createImage(dim.width, dim.height);
		this.bg=this.offScreen.getGraphics();
		
		duck.setPosition(dim.width-dim.width/3, 0, dim.width/3*1, dim.height/3*2);
	}
	
	public void counting() {
		this.countNumber++;
		if (countNumber % 100 == 0) {  // 100번마다 타일 생성
            int randomX = (int) (Math.random() * dim.width / 3) * (dim.width / 3);
            note.createTile(randomX, 0, dim.width / 6, 50, 1); // 타일 생성
        }
	}
	
	public int getCount() {
		return this.countNumber;
	}
	
	@Override
	public void paint(Graphics g) {
		bg.clearRect(0, 0, dim.width, dim.height);
		
	    if (stage == 0) {
	    	title.draw(bg, this);
	    } else if (stage == 2) {
	    	//main.draw(bg, this);
	    	//main.setBounds(0, 0, dim.width, dim.height);
            //main.paint(bg);
	    } else if (stage == 3) {
	    	//renderMusicPlayer(bg);
	    } else if (stage == 4) {
	    	note.draw(bg, this);
	    	home.draw(bg, this);
	    	duck.draw(bg, this);
	    } else if (stage == 5) {
	    	//gamepanel.repaint();
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
		 if (stage == 4) {
	            int keyCode = e.getKeyCode();
	            int lane = -1;

	            // DFJK 키 처리
	            switch (keyCode) {
	                case KeyEvent.VK_D: lane = 0; break;  // 왼쪽 라인
	                case KeyEvent.VK_F: lane = 1; break;  // 왼쪽 중앙
	                case KeyEvent.VK_J: lane = 2; break;  // 오른쪽 중앙
	                case KeyEvent.VK_K: lane = 3; break;  // 오른쪽 라인
	            }

	            if (lane != -1 && note.checkHit(lane, dim.width)) {
	                System.out.println("Hit! Lane: " + lane);
	            } else if (lane != -1) {
	                System.out.println("Miss! Lane: " + lane);
	            }
	    }
		
		
		
		if(stage == 0) {
		}
		else if (stage == 4) {
			
		}
		else if (stage == 5) {
			//gamepanel.handleKeyPress(e.getKeyCode());
		}
	}
		

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		initBuffer();
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
