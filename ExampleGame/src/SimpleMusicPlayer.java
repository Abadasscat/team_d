import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class SimpleMusicPlayer {

    private Clip audioClip;

    public SimpleMusicPlayer(String filePath) {
        loadAudio(filePath);
    }

    public void loadAudio(String filePath) {
        try {
            // 기존 클립 정지 및 닫기
            if (audioClip != null && audioClip.isOpen()) {
                audioClip.stop();
                audioClip.close();
            }

            // 오디오 파일 로드
            File audioFile = new File(filePath);
            if (!audioFile.exists()) {
                throw new IOException("파일을 찾을 수 없습니다: " + filePath);
            }

            // 오디오 스트림과 Clip 생성
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException e) {
            e.printStackTrace();
        }
    }

    // 음악 재생
    public void play() {
        if (audioClip != null) {
            audioClip.setFramePosition(0); // 처음부터 재생
            audioClip.start();
        }
    }

    // 음악 정지
    public void stop() {
        if (audioClip != null && audioClip.isRunning()) {
            audioClip.stop();
        }
    }

    public static void main(String[] args) {
        // UI 구성
        JFrame frame = new JFrame("Music Player with Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // 음악 파일 목록
        String[] songList = {
                "src/resources/Firefly.wav",
                "src/resources/Lemon.wav",
                "src/resources/Welcome to the Show.wav",
                "src/resources/song4.wav",
                "src/resources/song5.wav",
                "src/resources/song6.wav",
                "src/resources/song7.wav",
                "src/resources/song8.wav",
                "src/resources/song9.wav",
                "src/resources/song10.wav"
        };

        // 음악 제목 목록 (UI에 표시)
        String[] songTitles = {
                "Firefly", "Lemon", "Welcome to the Show.wav", "Song 4", "Song 5",
                "Song 6", "Song 7", "Song 8", "Song 9", "Song 10"
        };

        // 콤보박스 생성
        JComboBox<String> songSelector = new JComboBox<>(songTitles);

        // 음악 플레이어 객체 생성 (기본적으로 첫 번째 노래 로드)
        SimpleMusicPlayer player = new SimpleMusicPlayer(songList[0]);

        // 노래 선택 시 이벤트 처리
        songSelector.addActionListener(e -> {
            int selectedIndex = songSelector.getSelectedIndex();
            String selectedSongPath = songList[selectedIndex];
            player.loadAudio(selectedSongPath);
        });

        // 재생 버튼
        JButton playButton = new JButton("Play Music");
        playButton.addActionListener(e -> player.play());

        // 정지 버튼
        JButton stopButton = new JButton("Stop Music");
        stopButton.addActionListener(e -> player.stop());

        // UI 요소 추가
        frame.add(new JLabel("Select a Song:"));
        frame.add(songSelector);
        frame.add(playButton);
        frame.add(stopButton);

        // UI 표시
        frame.setVisible(true);
    }
}

