/**
 * 
 */
package java9Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author PUNITH
 *
 */
public class dropWhile {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(2,4,1,3,6,5);
		System.out.println(l1);
		
		List<Integer> l2=l1.stream().takeWhile(s->s%2==0).collect(Collectors.toList());
		System.out.println("takeWhile: "+l2);
		
		/*
		 * dropWhile is exactly opposite of takeWhile. in dropWhile it will drop the element
		 * until condition is true. Once condition becomes false  than stop and 
		 * consider reset of the element
		 * 
		 * dropeWhile drops elements instead of taking them as long as predicate returns true. Once predicate
		 * returns false then rest of the stream will be considered.
		 */
		List<Integer> l3=l1.stream().dropWhile(x->x%2==0).collect(Collectors.toList());
		System.out.println("dropWhile: "+l3);
		
		Stream.of("A","AA","BBB","CC","D").dropWhile(s->s.length()<=2).forEach(System.out::println);
	}
}