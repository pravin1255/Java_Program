/**
 * 
 */
package java9Programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PUNITH
 * In this program, we are using System.out.println in 1 line. no new list is created here 	
 */
public class takeWhileExamples2 {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("A");
		l1.add("AA");
		l1.add("AAA");
		l1.add("BBB");
		l1.add("CC");
		//l1.stream().filter(x->x.length()<=2).forEach(System.out::println);
		//l1.stream().takeWhile(x->x.length()<=2).forEach(System.out::println);
		l1.stream().filter(x->x.length()>=2).forEach(s->System.out.println(s));		
	}
}