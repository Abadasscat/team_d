import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Screen extends Canvas implements ComponentListener, KeyListener{//화면 그리기
	private Graphics bg;
	private Image offScreen;
	private Dimension dim;
	
	private Main main;
	private Title title=new Title(main);
	private MusicList musicList;
	private Note note=new Note(getWidth());
	private DuckHome home=new DuckHome();
	private Duck duck=new Duck();
	private TilePattern pattern = new TilePattern(note);
	private TilePatternManager patternManager = new TilePatternManager(); 
	private TilePatternManager2 patternManager2 = new TilePatternManager2(); 
	//private MusicList musicList = new MusicList(main);
	private SimpleMusicPlayer musicPlayer; // 선택된 노래 로드; // 음악 플레이어	
	private Score score = new Score();
	//private Cost cost = new Cost();
	
	private int countNumber=0;
	public int stage = 4;

	// 결과 표시 관련 변수 추가
	private String lastResult = "";
	private long resultDisplayTime = 0;
	private boolean[] keyPressedStates = new boolean[6];  // D, F, J, K, O, P 키 상태
	private final long RESULTSHOW = 1000;  // 1초 유지
	
	
	public Screen(Main main, String songPath, MusicList musicList) {
		this.main = main;//초기화
		this.musicList = musicList;
		
		// 노래에 맞는 패턴 가져오기
		List<TileBeat> tilePattern = patternManager.getPattern(songPath);
		pattern.setPattern(tilePattern);
		List<TileBeat> tilePattern2 = patternManager2.getPattern(songPath);
		pattern.setPattern(tilePattern2);
		

		    
		    
		

		
	    musicPlayer = new SimpleMusicPlayer(songPath);
	    
	   // 노래 종료 시 뮤직 리스트로 이동하는 콜백 등록
        musicPlayer.End(() -> {
        	 showScorePopup();  // 점수 창 표시
             stage = 1;  // MusicList 화면으로 전환
        });
	    
		addComponentListener(this);
		addKeyListener(this);
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
		
		// 일정 간격마다 오리 상태 랜덤 변경
	    if (countNumber % 10000 == 0) {
	        duck.randomizeState();
	    }
	}
	
	public int getCount() {
		return this.countNumber;
	}
	
	// 점수 팝업 창 표시 메서드
    private void showScorePopup() {
        SwingUtilities.invokeLater(() -> {//알림창이 안움직이도록 도와줌
            int finalScore = note.getScore().getScore();  // 최종 점수 가져오기
            JOptionPane.showMessageDialog(// 참고 https://hallang.tistory.com/136
                this,
                "점수: " + finalScore,
                "Game Over",
                JOptionPane.INFORMATION_MESSAGE
            );
            
            // 점수와 재화 추가 로직 
	        while (finalScore >= 10) {
                note.getScore().subtractScore(10);  // 점수 차감
                musicList.addCost(1);  // 재화 증가
                finalScore -= 10;
                //System.out.println("Currency earned! Total: " + cost.getCost());
            }

            // 화면 전환
            stage = 1;  // MusicList 화면으로 이동
        });
    }
    
	@Override
	public void paint(Graphics g) {
		bg.clearRect(0, 0, dim.width, dim.height);
		
	    if (stage == 0) {
	    	main.switchToCard("Title");
	    } else if (stage == 1) { 
	    	// musicList 화면으로 전환
	    	main.switchToCard("MusicList");
	    } else if (stage == 2) {
	    	
	    } else if (stage == 3) {
	    	
	    } else if (stage == 4) {
	    	note.draw(bg, this);
	    	home.draw(bg, this);
	    	duck.draw(bg, this);
	    	
	    	// 키 입력 시각 효과
	        int keyWidth = dim.width / 6;
	        for (int i = 0; i < 6; i++) {
	            if (keyPressedStates[i]) {
	                bg.setColor(new Color(255, 223, 186, 180));  // 반투명 노란색
	                bg.fillRect(i * keyWidth, getHeight() / 6 * 5, keyWidth, getHeight() / 6);
	            }
	        }
	        
	       // Miss 판정 수행
	        String missResult = note.checkMiss(getHeight() / 6 * 5);
	        if (!missResult.isEmpty()) {
	            lastResult = missResult;
	            resultDisplayTime = System.currentTimeMillis();
	        }
	        
	       // 결과 메시지 출력
	        if (System.currentTimeMillis() - resultDisplayTime < RESULTSHOW) {
	        	bg.setFont(new Font("Arial", Font.BOLD, 48));
	        	bg.setColor(Color.YELLOW);
	            bg.drawString(lastResult, dim.width / 24*7, dim.height / 4);
	        }
	        
	        bg.setFont(new Font("Arial", Font.BOLD, 48));
        	bg.setColor(Color.black);
        	bg.drawString("Score: " + note.getScore().getScore(), dim.width/7*5, dim.height/5*4);
        	
	        
	        // 점수가 -1500 이하로 떨어지면 stage 변경 
        	if (note.getScore().getScore() <= -1500) {
        		stage = 1; // stage를 1로 변경 
        		musicPlayer.stop(); // 음악 재생 중지 
        	}
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
		if (stage == 4) {
	        String key = KeyEvent.getKeyText(e.getKeyCode()).toLowerCase();
	        int lane = switch (key) {
	            case "d" -> 0;
	            case "f" -> 1;
	            case "j" -> 2;
	            case "k" -> 3;
	            case "o" -> 4;
	            case "p" -> 5;
	            default -> -1;
	        };

	        if (lane != -1) {
	            keyPressedStates[lane] = true;
	            int hitYStart = getHeight() / 6 * 4;  // 판정선 시작
	            int hitYEnd = getHeight() / 6 * 5;    // 판정선 끝
	            lastResult = note.checkHit(lane, hitYStart, hitYEnd);
	            resultDisplayTime = System.currentTimeMillis();
	            
	            System.out.println("Lane: " + lane + ", Result: " + lastResult);
	            System.out.println("Key pressed: " + key);
	        }
	    }
	}
		

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 String key = KeyEvent.getKeyText(e.getKeyCode()).toLowerCase();
		    int lane = switch (key) {
		        case "d" -> 0;
		        case "f" -> 1;
		        case "j" -> 2;
		        case "k" -> 3;
		        case "o" -> 4;
		        case "p" -> 5;
		        default -> -1;
		    };

		    if (lane != -1) keyPressedStates[lane] = false;
		
		
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
	
	@Override
	//없을시 키 이벤트 작동에 오류 있음
	public void addNotify() {
		// TODO Auto-generated method stub
		super.addNotify();
		requestFocusInWindow(); // 화면이 추가될 때 포커스를 요청
	}

}