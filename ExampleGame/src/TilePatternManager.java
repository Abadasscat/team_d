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
        //패턴 추가
        List<TileBeat> song1Pattern = new ArrayList<>();
        song1Pattern.add(new TileBeat(1000, 0));
        song1Pattern.add(new TileBeat(2000, 1));
        // 추가 타일 비트
        patterns.put("src/resources/Firefly.wav", song1Pattern);

        List<TileBeat> song2Pattern = new ArrayList<>();
        //  추가 타일 비트
        patterns.put("src/resources/Lemon.wav", song2Pattern);
        
        List<TileBeat> song3Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Welcome to the Show.wav", song3Pattern);
        
        List<TileBeat> song4Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/BETELGEUSE.wav", song4Pattern);
        
        List<TileBeat> song5Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/MNUSS.wav", song5Pattern);
        
        List<TileBeat> song6Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/pocketmon.wav", song6Pattern);
        
        List<TileBeat> song7Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Card Captor Cherry.wav", song7Pattern);
        
        List<TileBeat> song8Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Again meet world.wav", song8Pattern);
        
        List<TileBeat> song9Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/sorrow.wav", song9Pattern);
        
        List<TileBeat> song10Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Flowering.wav", song10Pattern);

        List<TileBeat> song11Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Last Christmas.wav", song11Pattern);
        
        List<TileBeat> song12Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/The Drum.wav", song12Pattern);
        
        // 필요한 만큼 더 추가
    }

    public List<TileBeat> getPattern(String songName) {
        return patterns.getOrDefault(songName, new ArrayList<>());
    }
}

