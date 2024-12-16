import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {//화면 띄우기
    private CardLayout cardLayout = new CardLayout();
    private JPanel cardPanel = new JPanel(cardLayout);
    
    public Main() {
        setTitle("리듬 게임");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 화면 중앙에 창 띄우기

        // TitleScreen과 SongSelectionScreen 추가
        Title title = new Title(this);
        MusicList musiclist = new MusicList(this);

        cardPanel.add(title, "Title");
        cardPanel.add(musiclist, "MusicList");

        add(cardPanel);
        cardLayout.show(cardPanel, "TitleScreen"); // 초기 화면을 타이틀 화면으로 설정
    }

    public void switchToCard(String cardName) {
        cardLayout.show(cardPanel, cardName);
    }

    public void openGameScreen(String songPath) {
        Screen screen = new Screen(this, songPath);
        cardPanel.add(screen, "GameScreen");
        cardLayout.show(cardPanel, "GameScreen");
    }
}
