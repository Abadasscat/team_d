import java.awt.Color;
import java.awt.Graphics;

class Tile {
    private int x, y, width, height, lane;

    public Tile(int x, int y, int width, int height, int lane) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.lane = lane;
    }

    public void moveDown(int speed) {
        y += speed;
    }

    
    public int getY() {
        return y;
    }

    public int getLane() {
        return lane;
    }
    
    
    public void draw(Graphics g) {
        g.setColor(new Color(135, 206, 235)); // 하늘색
        g.fillRect(x, y, width, height);
    }
}