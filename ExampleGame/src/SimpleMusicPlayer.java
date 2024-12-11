import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class SimpleMusicPlayer {

    private Clip audioClip;
    private FloatControl gainControl; // 볼륨 조정용 FloatControl 객체
    private float currentVolume = -10.0f; // 초기 볼륨 값 (dB)

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

            // FloatControl 얻기
            gainControl = (FloatControl) audioClip.getControl(FloatControl.Type.MASTER_GAIN);

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

    // 볼륨 조정 메서드
    public void setVolume(float volume) {
        if (gainControl != null) {
            // 볼륨 범위 조정
            float minGain = gainControl.getMinimum();
            float maxGain = gainControl.getMaximum();
            // 볼륨을 제한된 범위 내에서 설정
            float volumeValue = Math.max(minGain, Math.min(maxGain, volume));
            gainControl.setValue(volumeValue); // 볼륨 값 설정
            this.currentVolume = volumeValue; // 현재 볼륨 값을 업데이트
        } else {
            System.out.println("볼륨 조정이 지원되지 않습니다.");
        }
    }

    // 현재 볼륨 값을 반환하는 메서드
    public float getCurrentVolume() {
        return currentVolume;
    }
}
