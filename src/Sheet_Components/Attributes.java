package Sheet_Components;
import Sheet_Components.SheetAttributes.*;

public class Attributes {
	private Clef clef;
	private Identification identification;
	private Key key;
	private Time time;
	private Transpose transpose;
	
	public Attributes()
	{
		clef = new Clef();
		identification = new Identification();
		key = new Key();
		time = new Time();
		transpose = new Transpose();
	}
	
	public Clef getClef(){
		return clef;
	}
	
	
	public void setClef(char sign, int line){
		clef.setSign(sign);
		clef.setLine(line);
	}
	
	public void setClef(char sign){
		clef.setSign(sign);
	}
	
	public void setClef(int line){
		clef.setLine(line);
	}
	
		
	public Identification getIdentification(){
		return identification;
	}
	
	public void setIdentification(String name,String creator){
		identification.setName(name);
		identification.setCreator(creator);
	}
	
	public void setIdentification(String name){
		identification.setName(name);
	}
	
	public void setIdentification(String creator, boolean null_var){
		identification.setCreator(creator);
	}
	
	
	public Key getKey(){
		return key;
	}
	
	public void setKey(int fifths, boolean mode){
		key.setFifths(fifths);
		key.setMode(mode);
	}
	
	public void setKey(int fifths){
		key.setFifths(fifths);
	}
	
	public void setKey(boolean mode){
		key.setMode(mode);
	}
	
	public Time getTime(){
		return time;
	}
	
	public void setTime(int beats, int beat_type){
		time.setBeats(beats);
		time.setBeatType(beat_type);
	}
	
	public void setTime(int beats){
		time.setBeats(beats);
	}
	
	public void setTime(int beat_type, boolean null_var){
		time.setBeatType(beat_type);
	}
	
	public Transpose getTranspose(){
		return transpose;
	}
	
	public void setTranspose(int diatonic, int chromatic){
		transpose.setDiatonic(diatonic);
		transpose.setChromatic(chromatic);
	}
	
	public void setTranspose(int diatonic){
		transpose.setDiatonic(diatonic);
	}
	
	public void setTranspose(int chromatic, boolean null_var){
		transpose.setChromatic(chromatic);
	}
	
}
