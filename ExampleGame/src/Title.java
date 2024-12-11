import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Title implements MouseListener{
	private BufferedImage start;
	private Screen sc;
	private int x=500;
	private int y=400;
	private int w=200;
	private int h=100;
	//private Rectangle startRect; //https://exwest.tistory.com/72 여기 자료 참고
	
	public Title() {
		loadImage();
		//startRect = new Rectangle(500, 400, 200, 100);  // 이미지 클릭 영역 설정
	}
	
	private void loadImage() {
		try {
			//this.duck=ImageIO.read(new File("res/팝콘거위1.png"));
			this.start=ImageIO.read(new File("res/start.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void draw(Graphics g, Screen screen) {
		// TODO Auto-generated method stub
		 // 배경 및 이미지 그리기
        g.setColor(Color.white);
        g.fillRect(0, 0, screen.getWidth(), screen.getHeight());

        if (start != null) {
            g.drawImage(start, x, y, w, h, screen);
        }
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int clickX=e.getX();
		int clickY=e.getY();
		if (clickX >= x && clickX <= x + w && clickY >= y && clickY <= y + h) {
            System.out.println("게임 시작 클릭됨!");
            sc.setstage(4);  // Screen의 stage 변경
        }
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
