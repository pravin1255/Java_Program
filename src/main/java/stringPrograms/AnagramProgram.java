/**
 * 
 */
package stringPrograms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/anagram-program-in-java/
 */
public class AnagramProgram {
	public static void main(String[] args) {
		isAnagram("Mother In Law", "Hitler Woman");
		isAnagram("ejjoy", "enjoy");
	}
	
	static void isAnagram(String str1, String str2) {
		String copyOfs1=str1.replaceAll("\\s+", "").toLowerCase();
		String copyOfs2=str2.replaceAll("\\s+", "").toLowerCase();
		
		Map<Character, Integer> map=new HashMap<>();
		boolean flag=true;
		if(copyOfs1.length()!=copyOfs2.length())
			flag=false;
		else {
			for(int i=0;i<copyOfs1.length();i++) {
				char ch=copyOfs1.charAt(i);
				int charCountValue=0;
				if(map.containsKey(ch))
					charCountValue=map.get(ch);
				map.put(ch, ++charCountValue);
				
				ch=copyOfs2.charAt(i);
				charCountValue=0;
				if(map.containsKey(ch))
					charCountValue=map.get(ch);
				map.put(ch, --charCountValue);
			}
		}
		
		for(int i:map.values())
		{
			if(i!=0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(str1+" "+str2+" is anagram string");
		else
			System.out.println(str1+" "+str2+" is not anagram string");
	}
}