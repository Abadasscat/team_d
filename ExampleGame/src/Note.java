import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Note {
	private ArrayList<Tile> tiles; // 타일 저장 리스트
	
	public Note() {
		tiles = new ArrayList<>();	
	}
	
	 // 타일 생성 메서드
    public void createTile(int x, int y, int width, int height, int lane) {
        tiles.add(new Tile(x, y, width, height, lane));
    }
    
    // 타일 판정 로직
    public boolean checkHit(int lane, int screenWidth) {
        int hitZoneStart = 400;  // 판정 시작
        int hitZoneEnd = 450;    // 판정 끝

        for (int i = 0; i < tiles.size(); i++) {
            Tile tile = tiles.get(i);
            if (tile.getLane() == lane && tile.getY() >= hitZoneStart && tile.getY() <= hitZoneEnd) {
                tiles.remove(i);  // 타일 제거
                return true;      // 성공
            }
        }
        return false;  // 실패
    }


	public void draw(Graphics g, Screen screen) { 
		g.setColor(Color.black); 
		g.fillRect(0, 0, screen.getWidth(), screen.getHeight()); 
		
		int segmentWidth = screen.getWidth() / 3;
		    
		for (int i = 1; i < 4; i++) { 
		     int x = segmentWidth * i; 
		     int segmentHeight = screen.getHeight() / 6;
		     g.setColor(Color.white);
		     
		     for (int j = 6; j > 4; j--) {
		         int y = segmentHeight * j;
		         g.fillRect(x - segmentWidth, y, segmentWidth, 3);  // 두께가 3인 흰색 선 그리기
		      }
		  }
		
		int segmentWidth2 = screen.getWidth() / 6; 
			
		for (int j = 1; j < 6; j++) { 
			int z = segmentWidth2 * j; 
			g.setColor(Color.white); 
			g.drawLine(z, 0, z, screen.getHeight());
		}
		
		// 타일 이동 및 그리기
        for (Tile tile : tiles) {
            tile.moveDown(2);  // 속도 2로 이동
            tile.draw(g);      // 타일 그리기
        }
	}	
}