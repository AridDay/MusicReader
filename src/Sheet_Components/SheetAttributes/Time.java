package Sheet_Components.SheetAttributes;

public class Time {
	private int beats,beat_type;

	public void setBeats(int beats) {
		this.beats=beats;
		
	}

	public void setBeatType(int beat_type) {
		this.beat_type=beat_type;
	}
	
	public int getBeats(){
		return beats;
	}
	
	public int getBeatType(){
		return beat_type;
	}



}
