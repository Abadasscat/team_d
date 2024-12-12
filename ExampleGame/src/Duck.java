import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Duck {
	private BufferedImage duck;
	private BufferedImage[] duckes1 = new BufferedImage[12];
	private BufferedImage[] duckes2 = new BufferedImage[16];
	private BufferedImage[] duckes3 = new BufferedImage[4];
	private BufferedImage[] duckes4 = new BufferedImage[2];
	private BufferedImage[] duckes5 = new BufferedImage[5];
	private BufferedImage[] duckes6 = new BufferedImage[9];
	private BufferedImage[] duckes7 = new BufferedImage[13];
	private BufferedImage[] duckes8 = new BufferedImage[11];
	
	private int x=0;
	private int y=0;
	private int w=200;
	private int h=350;
	
	private int state = 7;
	
	
	public Duck() {
		loadImage();
	}
	
	private void loadImage() {
		// TODO Auto-generated method stub
		try {
			Color color =new Color(255, 255, 255);
			this.duck=ImageIO.read(new File("res/박수거위1.png"));
			this.duck= TransformColorToTransparency(duck, color);
			
			for(int i=0; i<duckes1.length; i++) {
				String filename = "res/팝콘거위"+(i+1)+".png";
				this.duckes1[i] = ImageIO.read(new File(filename));
				this.duckes1[i] = TransformColorToTransparency(duckes1[i], color);
			}
			for(int i=0; i<duckes2.length; i++) {
				String filename = "res/BJ거위"+(i+1)+".png";
				this.duckes2[i] = ImageIO.read(new File(filename));
				this.duckes2[i] = TransformColorToTransparency(duckes2[i], color);
			}
			for(int i=0; i<duckes3.length; i++) {
				String filename = "res/걸음거위"+(i+1)+".png";
				this.duckes3[i] = ImageIO.read(new File(filename));
				this.duckes3[i] = TransformColorToTransparency(duckes3[i], color);
			}
			for(int i=0; i<duckes4.length; i++) {
				String filename = "res/놀란거위"+(i+1)+".png";
				this.duckes4[i] = ImageIO.read(new File(filename));
				this.duckes4[i] = TransformColorToTransparency(duckes4[i], color);
			}
			for(int i=0; i<duckes5.length; i++) {
				String filename = "res/박수거위"+(i+1)+".png";
				this.duckes5[i] = ImageIO.read(new File(filename));
				this.duckes5[i] = TransformColorToTransparency(duckes5[i], color);
			}
			for(int i=0; i<duckes6.length; i++) {
				String filename = "res/안경거위"+(i+1)+".png";
				this.duckes6[i] = ImageIO.read(new File(filename));
				this.duckes6[i] = TransformColorToTransparency(duckes6[i], color);
			}
			for(int i=0; i<duckes7.length; i++) {
				String filename = "res/의문거위"+(i+1)+".png";
				this.duckes7[i] = ImageIO.read(new File(filename));
				this.duckes7[i] = TransformColorToTransparency(duckes7[i], color);
			}
			for(int i=0; i<duckes8.length; i++) {
				String filename = "res/춤거위"+(i+1)+".png";
				this.duckes8[i] = ImageIO.read(new File(filename));
				this.duckes8[i] = TransformColorToTransparency(duckes8[i], color);
			}
		}	
		catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected BufferedImage TransformColorToTransparency(BufferedImage image, Color c1) {
		   final int r1 = c1.getRed();
		   final int g1 = c1.getGreen();
		   final int b1 = c1.getBlue();
		  
		   ImageFilter filter = new RGBImageFilter() {
			   public int filterRGB(int x, int y, int rgb) {
				   int r = ( rgb & 0xFF0000 ) >> 16;
				   int g = ( rgb & 0xFF00 ) >> 8;
				   int b = ( rgb & 0xFF );
				   if( r == r1 && g == g1 && b == b1) {
					   return rgb & 0xFFFFFF;
				   }
				   return rgb;
			   }
		   };
		  
		  ImageProducer ip = new FilteredImageSource( image.getSource(), filter );
		  Image img = Toolkit.getDefaultToolkit().createImage(ip);
		  BufferedImage dest = new BufferedImage(img.getWidth(null), 
		    img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		  Graphics2D g = dest.createGraphics();
		  g.drawImage(img, 0, 0, null);
		  g.dispose();
		  return dest;
	}

	public void setPosition(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
	
	
	private int time_step = 300;
	private int duck_index = 0;
	
	public void draw(Graphics g, Screen screen) {
		// TODO Auto-generated method stub
		if(state == 0) {
			g.drawImage(duck, x, y, w, h, screen);
		}
		else if(state == 1){
			g.drawImage(this.duckes1[duck_index], x, y, w, h, screen);
			
			if(screen.getCount()% time_step == 0) {
				if (duck_index < 3) {
					duck_index++;
				} else {
					duck_index++;
					if (duck_index > 11) {
						duck_index =4;
					}
				}
			}
		}
		else if(state == 2){
			g.drawImage(this.duckes2[duck_index], x, y, w, h, screen);
			
			if(screen.getCount()% time_step == 0) {
				if (duck_index < 13) {
					duck_index++;
				} else {
					duck_index++;
					if (duck_index > 15) {
						duck_index =14;
					}
				}
			}
		}
		else if(state == 3){
			g.drawImage(this.duckes3[duck_index], x, y, w, h, screen);
			if(screen.getCount()% time_step == 0) {
				duck_index = (duck_index + 1) % duckes3.length; 
			}
			
		}
		else if(state == 4){
			g.drawImage(this.duckes4[duck_index], x, y, w, h, screen);
			if(screen.getCount()% time_step == 0) {
				duck_index = (duck_index + 1) % duckes4.length;
			}
		}
		else if(state == 5){
			g.drawImage(this.duckes5[duck_index], x, y, w, h, screen);
			if(screen.getCount()% time_step == 0) {
				if (duck_index < 4) {
					duck_index++;
				} else {
					duck_index++;
					if (duck_index > 5) {
						duck_index =4;
					}
				}
			}
		}
		else if(state == 6){
			g.drawImage(this.duckes6[duck_index], x, y, w, h, screen);
			if(screen.getCount()% time_step == 0) {
				duck_index = (duck_index + 1) % duckes6.length;
			}
		}
		else if(state == 7){
			g.drawImage(this.duckes7[duck_index], x, y, w, h, screen);
			if(screen.getCount()% time_step == 0) {
				duck_index = (duck_index + 1) % duckes7.length;
			}
		}
		else if(state == 8){
			g.drawImage(this.duckes8[duck_index], x, y, w, h, screen);
			if(screen.getCount()% time_step == 0) {
				if (duck_index < 9) {
					duck_index++;
				} else {
					duck_index++;
					if (duck_index > 10) {
						duck_index =9;
					}
				}
			}
		}
	}
}
