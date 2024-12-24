import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MusicList extends JPanel {//음악 리스트
    private JLabel imageLabel;
    private JButton startButton;
    private String selectedSongPath = "";

    private Cost cost = new Cost();
	private Map<String, Boolean> lockedSongs = new HashMap<>();  // 잠금 상태 관리
	private final int unlock= 5;  // 잠금 해제에 필요한 재화 개수
    private JLabel costLabel;  // 재화 표시 레이블
    
    public MusicList(Main main) {
    	//this.main = main; 
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
                "1. Firefly    (Normal)", "2. Lemon    (Hard)", "3. Welcome to the Show    (Hard)",
                "4. BETELGEUSE    (Normal)", "5. MNUSS    (Easy)", "6. pocketmon    (Hard)",
                "7. Card Captor Cherry    (Hard)", "8. Again Meet World    (Secret)", "9. Sorrow    (Secret)",
                "10. Flowering    (Secret)", "11. Last Christmas    (easy)", "12. The Drum    (Secret)"
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
            	
            	Boolean isLocked = lockedSongs.get(songTitles[songSelector.getSelectedIndex()]);
            	if (isLocked != null && isLocked.booleanValue()) {
                    JOptionPane.showMessageDialog(this, "해당 노래는 잠겨 있습니다!");
                } else {
                    main.openGameScreen(selectedSongPath);  // 게임 화면 전환
                }
            	
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
        
        for (String song : songTitles) {
            lockedSongs.put(song, true);  // 모든 노래 잠금
        }
        lockedSongs.put("1. Firefly", false);  // 기본 해제 상태
        
        // UI 초기화
        costLabel = new JLabel("Cost: " + cost.getCost(), JLabel.CENTER);
        costLabel.setFont(new Font("Arial", Font.BOLD, 24));
        
        // 추가 UI 구성
        add(costLabel, BorderLayout.NORTH);  // 재화 표시 추가
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
    
    // 재화 증가 메서드
    public void addCost(int amount) {
    	cost.addCost(amount); 
    	System.out.println("addCurrency called. Current cost: " + cost.getCost());
        updateCostDisplay();  // UI 업데이트
    }

    // 재화 차감 메서드
    public boolean spendCurrency(int amount) {
        if (cost.getCost() >= amount) {
        	cost.spendCost(unlock);
            updateCostDisplay();  // UI 업데이트
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Not enough cost");
            return false;
        }
    }

    // 노래 잠금 해제 메서드
    public boolean unlockSong(String songTitle) {
        if (lockedSongs.containsKey(songTitle) && lockedSongs.get(songTitle)) {
            if (spendCurrency(unlock)) {
                lockedSongs.put(songTitle, false);  // 노래 잠금 해제
                JOptionPane.showMessageDialog(this, songTitle + " unlocked!");
                return true;
            }
        } else if (!lockedSongs.containsKey(songTitle)) {
            JOptionPane.showMessageDialog(this, "Song not found.");
        } else {
            JOptionPane.showMessageDialog(this, songTitle + " is already unlocked!");
        }
        return false;
    }

    
    // 현재 재화 상태 갱신
    private void updateCostDisplay() {
    	costLabel.setText("Cost: " + cost.getCost());
    	System.out.println("updateCurrencyDisplay called. Updated cost: " + cost.getCost());
    	
    }
    

    // 변수 접근 메서드
    public boolean isSongLocked(String songTitle) {
        return lockedSongs.getOrDefault(songTitle, true);
    }
    
    /*
    // cost 값 반환 메서드 public 
    int getCost() {
    	return cost.getCost(); 
    }
    */
}
