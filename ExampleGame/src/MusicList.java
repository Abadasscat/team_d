import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MusicList extends JPanel {//음악 리스트
    private JLabel imageLabel;
    private JLabel levelLabel;
    private JButton startButton;
    private JButton purchaseButton;
    private String selectedSongPath = "";

    private Cost cost = new Cost();
	private Map<String, Boolean> lockedSongs = new HashMap<>();  // 잠금 상태 관리
	private final int unlock= 300;  // 잠금 해제에 필요한 재화 개수
    private JLabel costLabel;  // 재화 표시 레이블
    
    public MusicList(Main main) {
        setLayout(new BorderLayout());

        // 음악 파일 목록
        String[] songList = {
                "res/Firefly.wav",
                "res/Lemon.wav",
                "res/Welcome to the Show.wav",
                "res/BETELGEUSE.wav",
                "res/MNUSS.wav",
                "res/pocketmon.wav",
                "res/Card Captor Cherry.wav",
                "res/Again meet world.wav",
                "res/sorrow.wav",
                "res/Flowering.wav",
                "res/Last Christmas.wav",
                "res/The Drum.wav"
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
                "res/firefly.jpg",
                "res/lemon.jpg",
                "res/welcome.jpg",
                "res/BETELGEUSE.jpg",
                "res/MNUSS.jpg",
                "res/pocketmon.jpg",
                "res/Card Captor Cherry.jpg",
                "res/Again meet world.jpg",
                "res/sorrow.jpg",
                "res/Flowering.jpg",
                "res/Last Christmas.jpg",
                "res/The Drum.jpg"
        };

       /// 난이도 목록 
        String[] levels = { 
        		"Normal", "Hard", "Hard", 
        		"Normal", "Easy", "Hard", 
        		"Hard", "Secret", "Secret", 
        		"Secret", "Easy", "Secret" 
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
        
        // 난이도 표시를 위한 JLabel 생성
        levelLabel = new JLabel();
        updateLevel(levels[0]);
        levelLabel.setFont(new Font("Arial", Font.BOLD, 35)); 
        levelLabel.setHorizontalAlignment(SwingConstants.CENTER);
        levelLabel.setVerticalAlignment(SwingConstants.CENTER);

        // 노래 선택 이벤트 처리
        songSelector.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = songSelector.getSelectedIndex();
                if (selectedIndex >= 0) {
                    selectedSongPath = songList[selectedIndex];
                    updateImage(imagePaths[selectedIndex]);
                    updateLevel(levels[selectedIndex]);
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
                JOptionPane.showMessageDialog(this, "곡을 선택해 주세요");
            }
        });

     // Purchase 버튼 추가 
        purchaseButton = new JButton("Purchase"); 
        purchaseButton.setFont(new Font("Arial", Font.BOLD, 30)); 
        purchaseButton.setPreferredSize(new Dimension(170, 50)); 
        purchaseButton.addActionListener(e -> {
        	if (!selectedSongPath.isEmpty()) {
        		Boolean isLocked = lockedSongs.get(songTitles[songSelector.getSelectedIndex()]); 
        		if (isLocked != null && isLocked.booleanValue()) { // 재화가 충분히 있는지 확인 
        			if (cost.getCost() >= unlock) { // 재화가 충분한 경우 잠금 해제 
        				spendCurrency(unlock); 
        				lockedSongs.put(songTitles[songSelector.getSelectedIndex()], false); 
        				JOptionPane.showMessageDialog(this, songTitles[songSelector.getSelectedIndex()] + "잠금 해제 되었습니다"); 
        			} else {
        				// 재화가 부족한 경우 메시지 표시 
        				JOptionPane.showMessageDialog(this, "곡을 잠금 해제하기에는 재화가 부족합니다"); 
        			} 
        		} else { 
        			JOptionPane.showMessageDialog(this, "이미 잠금 해제된 곡입니다."); 
        	    } 
        	} else { 
        		JOptionPane.showMessageDialog(this, "곡을 선택해 주세요"); 
        	} 
        });
        
        // 패널 구성
        JPanel listPanel = new JPanel(new BorderLayout());
        listPanel.add(new JLabel("곡 목록:", JLabel.CENTER), BorderLayout.NORTH);
        listPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.add(imageLabel, BorderLayout.CENTER);//이미지 추가
        imagePanel.add(levelLabel, BorderLayout.SOUTH); // 난이도 라벨을 이미지 아래에 추가

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(startButton);
        buttonPanel.add(purchaseButton); // Purchase 버튼 추가

        add(listPanel, BorderLayout.EAST);
        add(imagePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH); // Start 버튼을 아래에 배치
        
        for (String song : songTitles) {
            lockedSongs.put(song, true);  // 모든 노래 잠금
        }
        lockedSongs.put("6. pocketmon", false);  // 기본 해제 상태
        
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
    
    private void updateLevel(String level) {
    	levelLabel.setText("Level: " + level); 
    }
    
    // 재화 증가 메서드
    public void addCost(int amount) {
    	cost.addCost(amount); 
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

    // 현재 재화 상태 갱신
    private void updateCostDisplay() {
    	costLabel.setText("Cost: " + cost.getCost());
    	
    }
    

    // 변수 접근 메서드
    public boolean isSongLocked(String songTitle) {
        return lockedSongs.getOrDefault(songTitle, true);
    }
    
    
    // cost 값 반환 메서드 public 
    int getCost() {
    	return cost.getCost(); 
    }
    
}
