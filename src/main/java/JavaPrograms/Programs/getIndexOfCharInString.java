/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Scanner;

/**
 * @author PUNITH
 * Program to get the index of character in the specified string
 */
public class getIndexOfCharInString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter char");
		String ch=sc.nextLine();
		int c=getCharIndex(str,ch);
		System.out.println("index is "+c);
	}
	static int getCharIndex(String str, String ch) {
		char c=ch.toLowerCase().charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.toLowerCase().charAt(i)==c)
				return i;
		}
		return -1;
	}
}