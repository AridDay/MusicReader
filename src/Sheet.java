import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import Sheet_Components.Attributes;
import Sheet_Components.Note;

public class Sheet {
	private Attributes attributes;
	private ArrayList<Note>notes;
	private File file; //TODO Implement file selection
	
	public Sheet() throws IOException
	{
		FileInputStream stream = new FileInputStream(file);
		attributes = new Attributes();
		notes = new ArrayList<Note>();
		buildSheet(stream);
	}

	private void buildSheet(
		   FileInputStream fis) throws IOException
	 {
	   try( BufferedReader br =
	           new BufferedReader( new InputStreamReader(fis, "ASCII" )))
	   {
	      String line;
	      while(( line = br.readLine()) != null ) {
	         checkLine(line);
	      }
	   }
	}
	
	private void checkLine(String line)
	{
		if(line.contains("<movement-title>"))
		{
			attributes.setIdentification(
					line.substring(line.indexOf("<movement-title>")+16, line.indexOf("</")));
		}
		else if(line.contains("<creator"))
		{
			attributes.setIdentification(
					line.substring(line.indexOf(">")+1, line.indexOf("</")), null);
		}
	}
}