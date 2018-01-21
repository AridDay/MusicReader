import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import Sheet_Components.Attributes;
import Sheet_Components.Note;

public class Sheet {
	private Attributes attributes;
	private String movement,creator; //move to Attributes
	private ArrayList<Note>notes;
	
	public Sheet()
	{
		notes = new ArrayList<Note>();
	}

	public void readBuildSheet(
		   FileInputStream fis,
		   String          encoding ) throws IOException
	 {
	   try( BufferedReader br =
	           new BufferedReader( new InputStreamReader(fis, encoding )))
	   {
	      StringBuilder sb = new StringBuilder();
	      String line;
	      while(( line = br.readLine()) != null ) {
	         checkLine(line);
	      }
	   }
	}
	
	private void checkLine(String line)
	{
		if(line.contains("<movement-title>"))
			movement=line.substring(line.indexOf("<movement-title>")+16, line.indexOf("</"));
		if(line.contains("<creator"))
			creator=line.substring(line.indexOf(">")+1, line.indexOf("</"));
	}
}