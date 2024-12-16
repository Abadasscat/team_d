import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class TilePatternManager {//타일 패턴 입력하는 곳
    private HashMap<String, List<TileBeat>> patterns;

    public TilePatternManager() {
        patterns = new HashMap<>();
        initializePatterns();
    }

    private void initializePatterns() {
        //패턴 추가
    	// 1. Firefly
        List<TileBeat> song1Pattern = new ArrayList<>();
        song1Pattern.add(new TileBeat(1000, 0));
        song1Pattern.add(new TileBeat(2000, 1));
        // 추가 타일 비트
        patterns.put("src/resources/Firefly.wav", song1Pattern);
        
        // 2. Lemon
        List<TileBeat> song2Pattern = new ArrayList<>();
        //  추가 타일 비트
        patterns.put("src/resources/Lemon.wav", song2Pattern);
        
        // 3. Welcome to the Show
        List<TileBeat> song3Pattern = new ArrayList<>();
        //  추가 타일 비트
        patterns.put("src/resources/Welcome to the Show.wav", song3Pattern);
        
        // 4. 베텔기우스
        List<TileBeat> song4Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/BETELGEUSE.wav", song4Pattern);
        
        // 5. 교가
        List<TileBeat> song5Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/MNUSS.wav", song5Pattern);
        
        // 6. 포켓몬
        List<TileBeat> song6Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/pocketmon.wav", song6Pattern);
        
        // 7. 카드캡터 체리
        List<TileBeat> song7Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Card Captor Cherry.wav", song7Pattern);
        
        // 8. 다시 만난 세계
        List<TileBeat> song8Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Again meet world.wav", song8Pattern);
        
        // 8. 애상
        List<TileBeat> song9Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/sorrow.wav", song9Pattern);
        
        // 9. 개화
        List<TileBeat> song10Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Flowering.wav", song10Pattern);

        // 10. 캐롤
        List<TileBeat> song11Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/Last Christmas.wav", song11Pattern);
        
        // 11. The Drum
        List<TileBeat> song12Pattern = new ArrayList<>();
        // 추가 타일 비트
        patterns.put("src/resources/The Drum.wav", song12Pattern);
        
        // 필요한 만큼 더 추가
    }

    public List<TileBeat> getPattern(String songName) {
        return patterns.getOrDefault(songName, new ArrayList<>());
    }
}

