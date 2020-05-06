/**
 * 
 */
package java9Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PUNITH
 *
 */
public class takeWhileExamples {
	public static void main(String[] args) {
		List<Integer> l1=Arrays.asList(2,4,1,6,5,8);
		System.out.println(l1);
		
		List<Integer> l2=l1.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(l2);
		
		/*
		 * In takeWhile method the execution stops when the boolean condition fails.
		 * 
		 * In filter all elements of the stream are processed but in takeWhile stream
		 * will be processed till the predicate condition is true.
		 * Even if the 1st element results in false than takeWhile returns empty stream.
		 * So in takeWhile if anywhere condition fails than stop and rest of the things
		 * will not be considered but in case of filter method if anywhere condition
		 * fails than it will ignore that element and continue with remaining element
		 * 
		 * So in case of filter there is a guarantee that each and every element will be filtered
		 * but in case of takeWhile there is no guarantee that each and every element will be filtered
		 */
		List<Integer> l3=l1.stream().takeWhile(x->x%2==0).collect(Collectors.toList());
		System.out.println(l3);
	}
}
