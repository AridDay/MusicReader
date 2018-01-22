import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import Sheet_Components.Attributes;
import Sheet_Components.Note;

/**
 * Stores the notes and the music attributes. Also manages the MusicXML file.
 */
public class Sheet {
	private Attributes attributes;
	private ArrayList<Note>notes;
	private File file; //TODO Implement file selection
	
	/**
	 * Creates the needed objects
	 */
	public Sheet() throws IOException
	{
		FileInputStream stream = new FileInputStream(file);
		attributes = new Attributes();
		notes = new ArrayList<Note>();
		buildSheet(stream);
	}

	/**
	 * Helper method that fills the Sheet variables from the MusicXML file
	 * 
	 * @param fis FileInputStream from MusicXML file
	 */
	private void buildSheet(
		   FileInputStream fis) throws IOException
	 {
	   try( BufferedReader br =
	           new BufferedReader( new InputStreamReader(fis, "ASCII" ))) 
	   {
	      String line;
	      while(( line = br.readLine()) != null ) { //Reads MusicXML line by line while checking for data.
	         checkLine(line);
	      }
	   }
	}
	
	/**
	 * Private helper method for buildSheet. This method contains all of the checks for information as buildSheet
	 * goes through the file line by line. Stores the found information in attributes.
	 *
	 * @param line A String from the MusicXML file that needs to be checked for information.
	 */
	private void checkLine(String line) //TODO Might want to add a "found" boolean for some of these so that it does not have to go through the contains check every single time.
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