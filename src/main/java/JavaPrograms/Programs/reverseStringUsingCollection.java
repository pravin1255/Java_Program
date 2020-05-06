/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author PUNITH
 * https://javahungry.blogspot.com/2014/12/5-ways-to-reverse-string-in-java-with-example.html
 * using LinkedList, can use ArrayList also
 * example 4
 */
public class reverseStringUsingCollection {
	public static void main(String[] args) {
		String str="Be in Present";
		char[] ch=str.toCharArray();
		List<Character> list1=new LinkedList<>();
		for(char c:ch)
			list1.add(c);
		Collections.reverse(list1);
		list1.forEach(x->System.out.print(x));
		System.out.println();
		list1.forEach(System.out::print);
	}
}