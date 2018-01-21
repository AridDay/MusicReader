package Sheet_Components.SheetAttributes;

public class Key {
	
	public static final boolean major = true, minor=false;
	private boolean mode;
	private int fifths;

	public void setFifths(int fifths) {
		this.fifths = fifths;
	}

	public void setMode(boolean mode) {
		this.mode = mode;
	}
	
	public int getFifths()
	{
		return fifths;
	}
	
	public boolean getMode()
	{
		return mode;
	}

}
