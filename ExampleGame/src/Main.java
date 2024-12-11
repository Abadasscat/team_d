import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main extends JFrame {

    private JLabel imageLabel;
    private float currentVolume = -10.0f; // 초기 볼륨 값

    public Main() {
        // 기본 창 설정
        setTitle("리듬 게임");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 음악 파일 목록
        String[] songList = {
                "src/resources/Firefly.wav",
                "src/resources/Lemon.wav",
        };

        // 음악 제목 목록 (UI에 표시)
        String[] songTitles = {
                "1. Firefly", "2. Lemon",
        };

        // 각 노래에 해당하는 이미지 파일 경로
        String[] imagePaths = {
                "src/Images/firefly.jpg",
                "src/Images/lemon.jpg",
        };

        // 음악 리스트 (JList) 생성
        JList<String> songSelector = new JList<>(songTitles);
        songSelector.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        songSelector.setFont(new Font("Arial", Font.BOLD, 30));
        songSelector.setFixedCellHeight(130);

        // 스크롤 추가
        JScrollPane scrollPane = new JScrollPane(songSelector, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(500, 400)); // 스크롤 창 크기 설정 (크게 조정)

        // 이미지 표시를 위한 JLabel 생성
        imageLabel = new JLabel();
        updateImage(imagePaths[0]);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);

        // 노래 선택 이벤트 처리
        songSelector.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = songSelector.getSelectedIndex();
                if (selectedIndex >= 0) {
                    String selectedSongPath = songList[selectedIndex];
                    updateImage(imagePaths[selectedIndex]);
                    openGameScreen(selectedSongPath); // 선택된 노래로 게임 화면 전환
                }
            }
        });

        // 패널 구성
        JPanel listPanel = new JPanel(new BorderLayout());
        listPanel.add(new JLabel("Select a Song:", JLabel.CENTER), BorderLayout.NORTH);
        listPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        add(listPanel, BorderLayout.EAST);
        add(imagePanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void updateImage(String imagePath) {
        File imageFile = new File(imagePath);
        if (imageFile.exists()) {
            ImageIcon icon = new ImageIcon(imagePath);
            Image scaledImage = icon.getImage().getScaledInstance(400, 225, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);
            imageLabel.setIcon(icon);
            imageLabel.setText("");
        } else {
            imageLabel.setIcon(null);
            imageLabel.setText("Image not found");
        }
    }

    private void openGameScreen(String songPath) {
        dispose(); // 현재 창 닫기
        JFrame frame = new JFrame("리듬 게임");
        Screen screen = new Screen(songPath); // Screen 클래스로 노래 전달
        frame.add(screen);
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main(); // Main 창 실행
    }
}
