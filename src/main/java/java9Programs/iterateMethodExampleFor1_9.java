/**
 * 
 */
package java9Programs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author PUNITH
 * This is iterate method example for java 1.9
 * In java 1.9, iterate method has 3 arguments
 * First argument is initial value
 * Second argument is Predicate i.e conditional check
 * Third argument is unary function to increment the value
 * This method is something like for loop condition means 
 * 1st is initial value, second is conditional check and 3rd is increment 
 */
public class iterateMethodExampleFor1_9 {
	public static void main(String[] args) {
		Stream.iterate(5, x->x<=100, x->x+10).forEach(System.out::println);
		Stream.iterate(1, x->x<15,x->x+2).forEach(System.out::println);
	}	
}