import javax.sound.sampled.*;
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

    public void play() {
        if (audioClip != null) {
            audioClip.setFramePosition(0); // 처음부터 재생
            audioClip.start();
        }
    }

    public void stop() {
        if (audioClip != null && audioClip.isRunning()) {
            audioClip.stop();
        }
    }
}
