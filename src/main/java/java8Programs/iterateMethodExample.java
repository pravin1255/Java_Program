/**
 * 
 */
package java8Programs;

import java.util.stream.Stream;

/**
 * @author PUNITH
 * This is java 1.8 iterate method example. In java 1.8, iterate method has 2 argument
 * First argument is initial value, second argument is Unary function in second argument
 * we can use lambda expression
 */
public class iterateMethodExample {
	public static void main(String[] args) {
		Stream.iterate(5, x->x+5).limit(4).forEach(System.out::println);
		//Stream.iterate(1, x->x+1).forEach(System.out::println);//results in infinite loop
	}
}
