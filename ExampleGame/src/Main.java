import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main extends JFrame {

    private JLabel imageLabel; // 이미지를 표시할 JLabel
    private SimpleMusicPlayer player; // 음악 플레이어 객체

    public Main() {
        // 기본 창 설정
        setTitle("리듬 게임");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // BorderLayout 사용

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
                "src/resources/The Drum.wav",
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

        // 음악 플레이어 객체 생성 (첫 번째 노래를 기본으로 설정)
        player = new SimpleMusicPlayer(songList[0]);

        // 음악 리스트 (JList) 생성
        JList<String> songSelector = new JList<>(songTitles);
        songSelector.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 단일 선택 모드
        songSelector.setSelectedIndex(0); // 기본 선택은 첫 번째 노래
        songSelector.setFont(new Font("Arial", Font.BOLD, 24)); // 글씨 크기 및 스타일 크게 설정
        
        // JList 셀 높이 및 폰트 크기 설정
        songSelector.setFixedCellHeight(150); // 각 셀의 높이를 150으로 설정
        songSelector.setFont(new Font("Arial", Font.BOLD, 50)); // 글씨 크기를 50으로 설정

        // 스크롤 추가
        JScrollPane scrollPane = new JScrollPane(songSelector, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(400, 250)); // 스크롤 창 크기

        // 이미지 표시를 위한 JLabel 생성
        imageLabel = new JLabel();
        updateImage(imagePaths[0]); // 첫 번째 노래에 해당하는 이미지 표시
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);

        // 노래 선택 이벤트 처리
        songSelector.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) { // 사용자가 선택을 끝냈을 때만 동작
                int selectedIndex = songSelector.getSelectedIndex();
                if (selectedIndex >= 0) { // 유효한 선택일 경우
                    String selectedSongPath = songList[selectedIndex];
                    player.loadAudio(selectedSongPath); // 선택된 노래 로드
                    player.play(); // 노래 자동 재생
                    updateImage(imagePaths[selectedIndex]); // 선택한 노래에 맞는 이미지 업데이트
                }
            }
        });

        // 오른쪽에 리스트와 스크롤 창 추가
        JPanel listPanel = new JPanel();
        listPanel.setLayout(new BorderLayout());
        listPanel.add(new JLabel("Select a Song:", JLabel.CENTER), BorderLayout.NORTH);
        listPanel.add(scrollPane, BorderLayout.CENTER);

        // 왼쪽에 이미지 표시 추가
        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.add(imageLabel, BorderLayout.CENTER);

        // 패널 배치
        add(listPanel, BorderLayout.EAST); // 음악 리스트를 오른쪽에 배치
        add(imagePanel, BorderLayout.CENTER); // 이미지를 중앙에 배치

        setVisible(true); // 창 표시
    }

    // 선택된 이미지로 JLabel 업데이트
    private void updateImage(String imagePath) {
        File imageFile = new File(imagePath);
        System.out.println("Checking file: " + imageFile.getAbsolutePath()); // 경로 확인용 출력
        if (imageFile.exists()) {
            ImageIcon icon = new ImageIcon(imagePath);
            // 이미지 크기 조정
            Image scaledImage = icon.getImage().getScaledInstance(400, 225, Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);
            imageLabel.setIcon(icon);
            imageLabel.setText(""); // 텍스트 제거
        } else {
            imageLabel.setIcon(null);
            imageLabel.setText("Image not found");
        }
    }

    public static void main(String[] args) {
        new Main(); // Main 창 실행
    }
}
