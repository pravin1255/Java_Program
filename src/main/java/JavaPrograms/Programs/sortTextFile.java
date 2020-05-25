/**
 * 
 */
package JavaPrograms.Programs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/how-to-sort-a-text-file-in-java/
 */
public class sortTextFile {
	public static void main(String[] args) throws IOException{
		try(BufferedReader reader=new BufferedReader(new FileReader("input.txt")); PrintWriter pw=new PrintWriter("output.txt")) {
			String str=reader.readLine();
			ArrayList<String> lines=new ArrayList<>();
			while(str!=null) {
				lines.add(str);
				str=reader.readLine();
			}
			
			Collections.sort(lines);
			
			for(String s:lines)
				pw.println(s);
		} 
	}
}