/**
 * 
 */
package java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PUNITH
 * Program to return odd or even number from an arrays using stream concept
 * For reference purpose refer below link
 * https://www.geeksforgeeks.org/arrays-stream-method-in-java/
 */
public class OddNumberFromArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> a1 = Arrays.stream(arr).filter(s -> s % 2 == 1).boxed().collect(Collectors.toList());
		System.out.println(a1);
	}
}