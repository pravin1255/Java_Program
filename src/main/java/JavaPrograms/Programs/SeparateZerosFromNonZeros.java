/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;

/**
 * @author PUNITH
 * Program to move zeros to the beginning or to the end of the arrays
 */
public class SeparateZerosFromNonZeros {
	public static void main(String[] args) {
		ZeroendOfArray(new int[] {14, 0, 5, 2, 0, 3, 0});
		zeroAtStart(new int[] {14, 0, 5, 2, 0, 3, 0});
	}
	
	public static void ZeroendOfArray(int[] inputArray) {
		int counter=0;
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]!=0) {
				inputArray[counter]=inputArray[i];
				counter++;
			}
		}
		while(counter<inputArray.length) {
			inputArray[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
	}
	
	public static void zeroAtStart(int[] inputArray) {
		int counter=inputArray.length-1;
		for(int i=inputArray.length-1;i>=0;i--) {
			if(inputArray[i]!=0) {
				inputArray[counter]=inputArray[i];
				counter--;
			}
		}
		
		while(counter>=0) {
			inputArray[counter]=0;
			counter--;
		}
		System.out.println(Arrays.toString(inputArray));
	}
}
