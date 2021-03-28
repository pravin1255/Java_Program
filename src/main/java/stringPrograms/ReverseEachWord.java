/**
 * 
 */
package stringPrograms;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/how-to-reverse-each-word-of-a-string-in-java/
 */
public class ReverseEachWord {
	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");
	}
	
	static void reverseEachWordOfString(String inputString) {
		String[] words=inputString.split(" ");
		String reverseString="";
		
		for(int i=0;i<words.length;i++) {
			String reverseWord="";
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--) {
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
	}
}