/**
 * 
 */
package stringPrograms;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/java-program-to-reverse-a-string/
 */
public class ReverseString {
	public static void main(String[] args) {
		String str="a";
		String reverse=reverseString(str);
		System.out.println(reverse);
	}
	
	static String reverseString(String str) {
		if(str==null || str.length()<=1)
			return str;
		return reverseString(str.substring(1))+str.charAt(0);
	}
}