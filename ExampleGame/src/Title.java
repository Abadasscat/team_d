import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Title extends JPanel {
    private BufferedImage image;
    private JButton button;
    private Screen screen;
    private Main main;
    
    public Title(Main main) {
    	this.main = main;
    	
        try {
            // 이미지 로드
            image = ImageIO.read(new File("src/Images/main.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setLayout(null);  // 레이아웃을 null로 설정하여 직접 배치

        // "Start" 버튼 생성
        button = new JButton("Start");
        button.setFont(new Font("Arial", Font.BOLD, 24));  // 버튼 텍스트 폰트 설정
        button.setForeground(Color.WHITE);  // 텍스트 색상을 흰색으로 설정
        button.setBackground(new Color(36, 234, 247));  // 버튼 배경 색상 설정 (파란색)
        button.setOpaque(true);  // 버튼 배경 색상이 보이도록 설정
        button.setBorderPainted(false);  // 버튼 테두리 없애기
        button.setBounds(450, 400, 100, 50);  // 버튼 크기 설정 (100x50) 및 위치 조정

        // 버튼을 JPanel에 추가
        add(button);

        // 버튼 클릭 이벤트 처리
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				//screen.stage=1;
                main.switchToCard("MusicList");
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 창 크기에 맞게 이미지 크기 조정
        Image scaledImage = image.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        // 이미지를 화면에 그리기
        g.drawImage(scaledImage, 0, 0, this);
    }
}
