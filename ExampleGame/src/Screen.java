import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;

public class Screen extends Canvas implements ComponentListener, KeyListener {
    private Graphics bg;
    private Image offScreen;
    private Dimension dim;

    private Title title;       // 타이틀 화면
    private Note note;         // 노트 관리
    private DuckHome home;     // 배경 관리
    private Duck duck;         // 게임 오브젝트
    private SimpleMusicPlayer musicPlayer; // 음악 플레이어

    private int countNumber = 0; // 타일 카운트
    private int stage = 0;       // 현재 화면 단계 (0: 타이틀, 4: 리듬 게임)

    public Screen(String songPath) {
        title = new Title(this);  // 타이틀 화면 관리
        note = new Note();        // 노트 관리
        home = new DuckHome();    // 배경
        duck = new Duck();        // 오브젝트
        musicPlayer = new SimpleMusicPlayer(songPath); // 선택된 노래 로드

        duck.setPosition(540, 0, 250, 350); // 오브젝트 위치 설정

        // 이벤트 리스너 추가
        addComponentListener(this);
        addKeyListener(this);
        setFocusable(true);

        // 화면 갱신 및 카운트 증가
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                repaint();
                if (stage == 4) { // 리듬 게임 화면에서만 카운트 증가
                    counting();
                }
            }
        }, 0, 10);

        if (!songPath.isEmpty()) {
            musicPlayer.play(); // 노래 시작
            stage = 4; // 바로 리듬 게임 시작
        }
    }

    private void initBuffer() {
        this.dim = getSize();
        this.offScreen = createImage(dim.width, dim.height);
        this.bg = this.offScreen.getGraphics();
    }

    public void counting() {
        countNumber++;
        if (countNumber % 100 == 0) { // 주기적으로 타일 생성
            int lane = (int) (Math.random() * 3); // 0, 1, 2 중 랜덤 선택
            int tileWidth = dim.width / 6;
            note.createTile(lane * tileWidth, 0, tileWidth, 50, lane);
        }
    }

    public int getCount() {
        return countNumber;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public void paint(Graphics g) {
        if (bg == null) {
            initBuffer();
        }
        bg.clearRect(0, 0, dim.width, dim.height);

        if (stage == 0) {
            // 타이틀 화면 렌더링
            title.draw(bg, this);
        } else if (stage == 4) {
            // 리듬 게임 화면 렌더링
            note.draw(bg, this);
            home.draw(bg, this);
            duck.draw(bg, this);
        }

        g.drawImage(offScreen, 0, 0, this);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (stage == 0) {
            // 타이틀 화면에서 Enter 키로 게임 시작
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                setStage(4); // 리듬 게임 화면으로 전환
            }
        } else if (stage == 4) {
            // 리듬 게임 화면에서 키 입력 처리
            int keyCode = e.getKeyCode();
            int lane = -1;

            // DFJK 키로 노트 판정
            if (keyCode == KeyEvent.VK_D) lane = 0; // 왼쪽
            if (keyCode == KeyEvent.VK_F) lane = 1; // 왼쪽 중앙
            if (keyCode == KeyEvent.VK_J) lane = 2; // 오른쪽 중앙
            if (keyCode == KeyEvent.VK_K) lane = 3; // 오른쪽

            if (lane != -1) {
                if (note.checkHit(lane, dim.width)) {
                    System.out.println("Hit! Lane: " + lane);
                } else {
                    System.out.println("Miss! Lane: " + lane);
                }
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void componentResized(ComponentEvent e) {
        initBuffer();
    }

    @Override
    public void componentMoved(ComponentEvent e) {}

    @Override
    public void componentShown(ComponentEvent e) {}

    @Override
    public void componentHidden(ComponentEvent e) {}
}

