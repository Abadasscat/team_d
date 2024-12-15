import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Note {
	private ArrayList<Tile> tiles; // 타일 저장 리스트
	private int tileWidth;  // 타일 너비
    private int tileHeight = 50;  // 타일 높이
    private int[] lanePositions;
    private Score score = new Score();
    
    // 판정 범위 상수
    private final int EXCELLENT_RANGE = 10;
    private final int GREAT_RANGE = 30;
    private final int GOOD_RANGE = 50;
	
	public Note(int screenWidth) {
		tiles = new ArrayList<>();	
	}
	
	public void createTileAtPosition(int lane) {
	        if ( lane >= 0 && lane < lanePositions.length) {
	            int x = lanePositions[lane];
	            tiles.add(new Tile(x, 0, tileWidth, tileHeight, lane));
	        }
	 }
	    
	public void updateLanePositions(int screenWidth) {
	       lanePositions = new int[] {
	            screenWidth / 6 * 0,  // d
	            screenWidth / 6 * 1,  // f
	            screenWidth / 6 * 2,  // j
	            screenWidth / 6 * 3,  // k
	            screenWidth / 6 * 4,  // o
	            screenWidth / 6 * 5   // p
	        };
	}
    
    // 타일 판정 로직
	public String checkHit(int lane, int hitYStart, int hitYEnd) {
	    for (int i = 0; i < tiles.size(); i++) {
	        Tile tile = tiles.get(i);
	        if (tile.getLane() == lane) {
	            int y = tile.getY();
	            if (y >= hitYStart && y <= hitYEnd) {
	                int distance = Math.abs(y - (hitYStart + hitYEnd) / 2);
	                tiles.remove(i);  // 타일 제거
	                if (distance <= EXCELLENT_RANGE) {
	                	score.addScore(100);
	                	return "Excellent";
	                }
	                else if (distance <= GREAT_RANGE) {
	                	score.addScore(80);
	                	return "Great";
	                }
	                else if (distance <= GOOD_RANGE) {
	                	score.addScore(60);
	                	return "Good";
	                }
	            }
	        }
	    }
	    return "";
	}

	
	// Note 클래스 내 Miss 판정 메서드
	public String checkMiss(int missLineY) {
	    for (int i = 0; i < tiles.size(); i++) {
	        Tile tile = tiles.get(i);
	        if (tile.getY() > missLineY) {  // 타일이 판정선을 지나면
	            tiles.remove(i);  // 타일 제거
	            System.out.println("Miss! Lane: " + tile.getLane());
	            i--;  // 타일 삭제 시 인덱스 조정
	            score.subtractScore(150);
	            return "Miss";  // Miss 결과 반환
	        }
	    }
	    return "";  // Miss 타일이 없으면 빈 문자열 반환
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
            tile.draw(g, screen);      // 타일 그리기
        }
	}	
	
	public Score getScore() {
		return score;
	}
}