
public class Score {
	private int score;
	
	public Score() {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int points) {
        score += points;
    }

    public void subtractScore(int points) {
        score -= points;
    }

}
