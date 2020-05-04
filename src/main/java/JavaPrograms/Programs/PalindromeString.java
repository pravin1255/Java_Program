/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Scanner;

/**
 * @author PUNITH
 * https://java2blog.com/java-program-to-check-palindrome/
 *
 */
public class PalindromeString {
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);){
			System.out.println("Enter a string");
			String str=sc.nextLine();
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			if(str.equals(sb.toString()))
				System.out.println("String is palindrome");
			else
				System.out.println("String is not palindrome");
		}		
	}	
}