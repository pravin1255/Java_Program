/**
 * 
 */
package stringPrograms;

import java.util.HashMap;
import java.util.Set;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/duplicate-characters-in-a-string-in-java/
 */
public class DuplicateChar_5 {
	public static void main(String[] args) {
		duplicateCharCount("Better Butter");
		//duplicateCharCount("Fresh Fish");
	}
	
	static void duplicateCharCount(String inputString) {
		HashMap<Character,Integer> charCountMap=new HashMap<>();
		char[] strArray=inputString.toCharArray();
		for(char c:strArray) {
			if(charCountMap.get(c)==null)
				charCountMap.put(c, 1);
			else
				charCountMap.put(c, charCountMap.get(c)+1);
		}
		
		Set<Character> set=charCountMap.keySet();
		System.out.println("Duplicate Characters In "+inputString);
		
		for(char c:set) {
			if(charCountMap.get(c)>1)
				System.out.println(c+" "+charCountMap.get(c));
		}
	}
}