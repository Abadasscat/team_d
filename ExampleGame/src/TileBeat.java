
public class TileBeat {//타일 시간, 줄 관리
	
	public TileBeat(int time, int lane) {
		super();
		this.time = time;
		this.lane = lane;
	}
	
	private int time;
	private int lane;
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getLane() {
		return lane;
	}
	public void setLane(int lane) {
		this.lane = lane;
	}

}
