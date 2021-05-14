/**
 * 
 */
package stringPrograms;

import java.util.Scanner;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/remove-white-spaces-from-string-in-java/
 */
public class RemoveWhiteSpaces_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input String");
		String inputString=sc.nextLine();
		//String inputString=sc.next();
		char[] charArray=inputString.toCharArray();
		String stringWithoutSpaces="";
		for(int i=0;i<charArray.length;i++) {
			if((charArray[i]!=' ')  && (charArray[i]!='\t'))
				stringWithoutSpaces=stringWithoutSpaces+charArray[i];
		}
		
		System.out.println(inputString);
		System.out.println(stringWithoutSpaces);
	}
}