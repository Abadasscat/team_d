import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class TilePattern {//타일 패턴 관리
    private List<TileBeat> pattern; // 타일 비트 리스트
    private Note note; // Note 객체 참조
    private Timer timer;

    public TilePattern(Note note) {
        this.note = note;
        this.pattern = new ArrayList<>();
    }

    public void addTileBeat(int time, int lane) {
        pattern.add(new TileBeat(time, lane));
    }

    public void startPattern() {
        timer = new Timer();
        for (TileBeat tileBeat : pattern) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    note.createTileAtPosition(tileBeat.getLane());
                }
            }, tileBeat.getTime());
        }
    }

    public void stopPattern() {
        if (timer != null) {
            timer.cancel();
        }
    }
    
    // 패턴 설정 메서드 추가 
    public void setPattern(List<TileBeat> newPattern) {
    	this.pattern = newPattern; 
    }
}
