/**
 * 
 */
package JavaPrograms.Programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author PUNITH
 * https://javahungry.blogspot.com/2013/12/first-non-repeated-character-in-string-java-program-code-example.html
 */
public class FirstNonRepeatedCharacterInString {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter the string");
			String str=sc.nextLine();
			firstNonRepeatedChar(str);
		}
	}
	
	static void firstNonRepeatedChar(String s) {
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c:s.toCharArray())
			if(map.get(c)==null)
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		map.entrySet().stream().filter(s1->s1.getValue()==1).limit(1).forEach(a->System.out.println(a.getKey()+" "+a.getValue()));
		
		String abc=map.entrySet().stream().filter(z->z.getValue()==1).limit(1).collect(Collectors.toList()).toString();
		System.out.println(abc);
	}	
}
