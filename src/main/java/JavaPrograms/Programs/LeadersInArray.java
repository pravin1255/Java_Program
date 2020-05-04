/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;

/**
 * @author PUNITH
 * To find the leaders in an integer array. An element is said to be leader if all the elements on it’s 
 * right side are smaller than it. Rightmost element is always a leader. For example, if {14, 9, 11, 7, 8, 5, 3} 
 * is the given array then {14, 11, 8, 5, 3} are the leaders in this array.
 */
public class LeadersInArray {
	public static void main(String[] args) {
		//leadersInArray(new int[] {14, 9, 11, 7, 8, 5, 3});
		//leadersInArray(new int[] {1, 6,2,7, 8, 5, 3});
		findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23});
	}
	
	static void leadersInArray(int[] inputArray) {
		int max=inputArray[inputArray.length-1];
		
		System.out.println("The leaders in "+Arrays.toString(inputArray));
		
		System.out.println(max);
		for(int i=inputArray.length-2;i>=0;i--) {
			if(inputArray[i]>max) {
				System.out.println(inputArray[i]);
				max=inputArray[i];
			}
		}
	}
	
	static void findTheLeaders(int[] inputArray) {
		for(int i=0;i<inputArray.length;i++) {
			boolean flag=true;
			for(int j=i+1;j<inputArray.length;j++) {
				if(inputArray[j]>inputArray[i]) {
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(inputArray[i]);
		}
	}
}