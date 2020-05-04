/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * Program to reverse each word of a string
 */
public class ReverseEachWord {
	public static void main(String[] args){
		reverseEachWord("Java Concept Of The Day");
	}
	
	static void reverseEachWord(String inputString){
		String reverseString="";
		String[] words=inputString.split(" ");
		for(int i=0;i<words.length;i++){
			String reverseWord="";
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--){
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
	}
}
