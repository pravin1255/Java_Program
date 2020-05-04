/*
 * To count occurrences of each characters
 */
package JavaPrograms.Programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class charCount {
	public static void main(String[] args) {
		charCountMap("Alliswell");
	}
	
	static void charCountMap(String inputString){
		HashMap<Character,Integer> charCountMap=new HashMap<>();
		for(char ch:inputString.toCharArray()){
			if(charCountMap.containsKey(ch)){
				charCountMap.put(ch, charCountMap.get(ch)+1);
			}else
				charCountMap.put(ch, 1);
		}
		
		System.out.println(charCountMap);
		
		Set<Entry<Character,Integer>> set=charCountMap.entrySet();
		
		for(Entry<Character,Integer> ent:set){
			if(ent.getValue()>1)
				System.out.println(ent.getKey()+" "+ent.getValue());
		}		
	}
}