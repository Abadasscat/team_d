import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Title implements MouseListener {
    private BufferedImage start;
    private Screen sc;
    private Rectangle startRect; // 버튼 클릭 영역
    private boolean isHovered = false; // 호버 상태 플래그

    private int x = 500;
    private int y = 400;
    private int w = 200;
    private int h = 100;

    public Title(Screen screen) {
        this.sc = screen;
        loadImage();
        startRect = new Rectangle(x, y, w, h); // 버튼 영역 설정
    }

    private void loadImage() {
        try {
            this.start = ImageIO.read(new File("res/start.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g, Screen screen) {
        // 배경 색상 설정
        g.setColor(Color.white);
        g.fillRect(0, 0, screen.getWidth(), screen.getHeight());

        // 버튼 영역에 색상 변화 적용 (호버 상태)
        if (isHovered) {
            g.setColor(Color.lightGray); // 호버 시 회색 배경
            g.fillRect(x, y, w, h);
        }

        // 버튼 이미지 그리기
        if (start != null) {
            g.drawImage(start, x, y, w, h, screen);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // 클릭 좌표가 버튼 영역에 포함되는지 확인
        if (startRect.contains(e.getPoint())) {
            System.out.println("게임 시작 클릭됨!");
            sc.setStage(4); // 게임 화면으로 전환
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {
        // 마우스가 버튼 영역에 들어오면 호버 상태로 설정
        if (startRect.contains(e.getPoint())) {
            isHovered = true;
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // 마우스가 버튼 영역에서 나가면 호버 상태 해제
        isHovered = false;
    }
}
