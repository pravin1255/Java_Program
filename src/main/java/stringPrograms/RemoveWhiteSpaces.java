/**
 * 
 */
package stringPrograms;

import java.util.Scanner;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/remove-white-spaces-from-string-in-java/
 */
public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		
		String stringWithspace=str.replaceAll("\\s+", "");
		System.out.println(stringWithspace);
		
	}
}