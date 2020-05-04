/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * Program to check whether string are anagram
 * https://java2blog.com/check-if-two-strings-are-anagrams-in-java-example-program/
 */
public class AnagramString{
	public static void main(String[] args) {
		String word = "java2blog";
		String anagram = "aj2vabgol";
		
		System.out.println("java2blog & aj2vabgol are anagrams: "+isAnagramUsingStringMethods(word,anagram));
	}
	
	public static boolean isAnagramUsingStringMethods(String word,String anagram) {
		if(word.length()!=anagram.length())
			return false;
		for(int i=0;i<word.length();i++) {
			char c=word.charAt(i);
			int index=anagram.indexOf(c);
			
			/*
			 * If the index is -1 than string are not anagram
			 * If index is not -1 than remove the char from anagram
			 */
			if(index!=-1)
			{
				anagram=anagram.substring(0, index)+anagram.subSequence(index+1, anagram.length());
			}
			else
				return false;			
		}
		return anagram.isEmpty();
	}
}