/**
 * 
 */
package JavaPrograms.Programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/how-to-sort-a-text-file-in-java/
 */
public class sortTextFile2 {
	public static void main(String[] args) throws IOException{
		try (BufferedReader reader = new BufferedReader(new FileReader("input2.txt"));
				PrintWriter pw = new PrintWriter("output2.txt");) {
			String currentLine=reader.readLine();
			ArrayList<Person> lists=new ArrayList<>();
			while(currentLine!=null) {
				String[] personDetail=currentLine.split(" ");
				String name=personDetail[0];
				int age=Integer.valueOf(personDetail[1]);
				lists.add(new Person(name,age));	
				currentLine=reader.readLine();
			}
			
			Collections.sort(lists, (a,b)->b.getName().compareTo(a.getName()));
			
			for(Person p:lists) {
				pw.println(p.name+" "+p.age);
			}			
		}		
	}
}