/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Scanner;

/**
 * @author PUNITH
 * https://javatutoring.com/java-find-vowels-in-a-string/
 */
public class VowelsInString {
	//approach 1
//	public static void main(String[] args) {
//		String s;
//		char ch;
//		int i=0;
//		Scanner sc=new Scanner(System.in);
//		s=sc.nextLine();
//		for(int j=0;j<s.length();j++) {
//			ch=s.charAt(j);
//			switch(ch) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//			case 'A':
//			case 'E':
//			case 'I':
//			case 'O':
//			case 'U':
//			i=1;
//			System.out.println(ch);
//			}
//			if(i==0)
//				System.out.println("No vowels in string");
//		}
//	}
	
	//approach 2
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		vowels(str);
	}
	
	static void vowels(String str) {
		char ch;
		int j=0;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch=='a' || ch=='e'||ch=='i'||ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				System.out.println(ch);
				j=1;
			}
		}
		if(j==0)
			System.out.println("No vowels in string");
	}
}	