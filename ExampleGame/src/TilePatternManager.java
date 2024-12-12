import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class TilePatternManager {
    private HashMap<String, List<TileBeat>> patterns;

    public TilePatternManager() {
        patterns = new HashMap<>();
        initializePatterns();
    }

    private void initializePatterns() {
        // 예시 패턴 추가
        List<TileBeat> song1Pattern = new ArrayList<>();
        song1Pattern.add(new TileBeat(1000, 0));
        song1Pattern.add(new TileBeat(2000, 1));
        // 추가 타일 비트
        patterns.put("src/resources/Firefly.wav", song1Pattern);

        List<TileBeat> song2Pattern = new ArrayList<>();
        song2Pattern.add(new TileBeat(1500, 2));
        song2Pattern.add(new TileBeat(2500, 3));
        // 추가 타일 비트
        patterns.put("src/resources/Lemon.wav", song2Pattern);

        // 필요한 만큼 더 추가
    }

    public List<TileBeat> getPattern(String songName) {
        return patterns.getOrDefault(songName, new ArrayList<>());
    }
}

