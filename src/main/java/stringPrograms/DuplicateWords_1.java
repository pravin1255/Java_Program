/**
 * 
 */
package stringPrograms;

import java.util.HashMap;
import java.util.Set;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/java-interview-programs-on-strings/
 */
public class DuplicateWords_1 {
	public static void main(String[] args) {
		duplicateWords("Bread butter and bread");	
	}
	
	static void duplicateWords(String inputString) {
		String[] words=inputString.split(" ");
		HashMap<String,Integer>  wordCount=new HashMap<>();
		for(String word:words) {
			if(wordCount.containsKey(word.toLowerCase()))
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
			else
				wordCount.put(word.toLowerCase(), 1);
		}
		
		Set<String> wordInString=wordCount.keySet();
		for(String word:wordInString) {
			if(wordCount.get(word)>1)
				System.out.println(word+" "+wordCount.get(word));
		}
	}
}