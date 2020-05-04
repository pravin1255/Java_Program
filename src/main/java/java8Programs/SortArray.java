/**
 * 
 */
package java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PUNITH
 *
 */
public class SortArray{
	public static void main(String[] args) {
		int arr[] = new int[]{12,56,76,89,100,343,21,234};
		sortArray(arr);
	}

	private static void sortArray(int[] arr) {
		
		List<Integer> a2 = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
		System.out.println(a2);		
	}	
}