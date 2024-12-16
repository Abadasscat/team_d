import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MusicList extends JPanel {//음악 리스트
    private JLabel imageLabel;
    private JButton startButton;
    private String selectedSongPath = "";

    public MusicList(Main main) {
        setLayout(new BorderLayout());

        // 음악 파일 목록
        String[] songList = {
                "src/resources/Firefly.wav",
                "src/resources/Lemon.wav",
                "src/resources/Welcome to the Show.wav",
                "src/resources/BETELGEUSE.wav",
                "src/resources/MNUSS.wav",
                "src/resources/pocketmon.wav",
                "src/resources/Card Captor Cherry.wav",
                "src/resources/Again meet world.wav",
                "src/resources/sorrow.wav",
                "src/resources/Flowering.wav",
                "src/resources/Last Christmas.wav",
                "src/resources/The Drum.wav"
        };

        // 음악 제목 목록 (UI에 표시)
        String[] songTitles = {
                "1. Firefly", "2. Lemon", "3. Welcome to the Show",
                "4. BETELGEUSE", "5. MNUSS", "6. pocketmon",
                "7. Card Captor Cherry", "8. Again Meet World", "9. Sorrow",
                "10. Flowering", "11. Last Christmas", "12. The Drum"
        };

        // 각 노래에 해당하는 이미지 파일 경로
        String[] imagePaths = {
                "src/Images/firefly.jpg",
                "src/Images/lemon.jpg",
                "src/Images/welcome.jpg",
                "src/Images/BETELGEUSE.jpg",
                "src/Images/MNUSS.jpg",
                "src/Images/pocketmon.jpg",
                "src/Images/Card Captor Cherry.jpg",
                "src/Images/Again meet world.jpg",
                "src/Images/sorrow.jpg",
                "src/Images/Flowering.jpg",
                "src/Images/Last Christmas.jpg",
                "src/Images/The Drum.jpg"
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
                    selectedSongPath = songList[selectedIndex];
                    updateImage(imagePaths[selectedIndex]);
                }
            }
        });

        // Start 버튼 추가
        startButton = new JButton("Start");
        startButton.setFont(new Font("Arial", Font.BOLD, 30));
        startButton.setPreferredSize(new Dimension(150, 50));
        startButton.addActionListener(e -> {
            if (!selectedSongPath.isEmpty()) {
                main.openGameScreen(selectedSongPath); // 선택된 노래로 게임 화면 전환
            } else {
                JOptionPane.showMessageDialog(this, "Please select a song first.");
            }
        });

        // 패널 구성
        JPanel listPanel = new JPanel(new BorderLayout());
        listPanel.add(new JLabel("Select a Song:", JLabel.CENTER), BorderLayout.NORTH);
        listPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(startButton);

        add(listPanel, BorderLayout.EAST);
        add(imagePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH); // Start 버튼을 아래에 배치
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
}
