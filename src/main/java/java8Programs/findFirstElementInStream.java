/**
 * 
 */
package java8Programs;

import java.util.stream.Stream;

/**
 * @author PUNITH
 * https://www.geeksforgeeks.org/find-the-first-element-of-a-stream-in-java/
 */
public class findFirstElementInStream {
	public static <T> T findFirstElement(Stream<T> stream) {
		return stream.findFirst().orElse(null);
	}
	
//	public static <T> T findFirstElement(Stream<T> stream) {
//		return stream.reduce((a,b)->b).orElse(null);//to find last element just put 'b' instead of 'a'
//	}
	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,2,3,4,5);
		System.out.println(findFirstElement(stream));
	}
}