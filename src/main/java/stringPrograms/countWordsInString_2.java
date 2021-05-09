/**
 * 
 */
package stringPrograms;

import java.util.Scanner;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/java-interview-programs-on-strings/
 */
public class countWordsInString_2 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		int count=1;
//		for(int i=0;i<s.length()-1;i++) {
//			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
//				count++;
//		}
		String s1 = s.trim();
		String[] str = s1.split(" ");
		
		System.out.println("The number of words= "+str.length);
	}
}