/**
 * 
 */
package JavaPrograms.Programs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author PUNITH
 *
 */
public class AppendToFileExample {
	private static final String FILENAME="filename1.txt";
	
	public static void main(String[] args) throws IOException{
		File file=new File(FILENAME);
		try(FileWriter fw=new FileWriter(file.getAbsolutePath());
				BufferedWriter bw=new BufferedWriter(fw)){
			String data=" This is the content";
			if(!file.exists())
				file.createNewFile();
			bw.write(data);
			System.out.println("Done");
		}
	}	
}