import java.awt.Color;
import java.awt.Graphics;

public class DuckHome {
	
	public DuckHome() {
		
	}
	
	public void draw(Graphics g, Screen screen) { 
		int segmentWidth = screen.getWidth() / 3;// 화면을 가로로 3등분함 
		
		for (int i = 3; i > 2; i--) { 
			int x = segmentWidth * i; 
			g.setColor(Color.white);
			g.fillRect(x - segmentWidth, 0, segmentWidth, screen.getHeight());  	
		}	
	}
}