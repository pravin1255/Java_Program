/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;

/**
 * @author PUNITH
 * Program to separate odd and even numbers
 * https://java2blog.com/separate-odd-and-even-numbers-in-array/
 */
public class separateOddEvenNumbers {
	public static void main(String[] args) {
		int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
		System.out.println("Before segregating no");
		System.out.println(Arrays.toString(arr));
		
		arr=separateoddEven(arr);
		System.out.println("After segregating no");
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] separateoddEven(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int left=0;
			int right=arr.length-1;
			while(arr[left]%2==1)
				left++;
			while(arr[right]%2==0)
				right--;
			if(left<right) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		return arr;
	}
}
