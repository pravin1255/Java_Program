/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;

/**
 * @author PUNITH
 * Program to find missing number in an array
 */
public class MissingNumberInArray {
	public static void main(String[] args) {
		int n=8;
		int[] a= {1,2,3,4,5,6,7};
		int sumOfNumbers=sumOfNumbers(n);
		int sumOfElements=sumOfElements(a);
		int missingNumber=sumOfNumbers-sumOfElements;
		System.out.println("Missing number is: "+missingNumber);
	}

	private static int sumOfNumbers(int n) {
		int sum=(n*(n+1)/2);
		return sum;
	}

	private static int sumOfElements(int[] a) {
		int sum=0;
		for(int n:a)
			sum=sum+n;
		
		return sum;
	}	
}