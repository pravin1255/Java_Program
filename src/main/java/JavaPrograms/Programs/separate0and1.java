/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;

/**
 * @author PUNITH
 * https://java2blog.com/separate-0s-and-1s-in-array/
 * Program to separate 0 and 1
 */
/*public class separate0and1 {
	public static void main(String[] args) {
		int arr[] = {0,1,0,0,1,1,1,0,1};
		int[] result=separatezeroandone(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] separatezeroandone(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				count++;
		}
		
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		for(int i=count;i<arr.length;i++) {
			arr[i]=1;
		}
		return arr;
	}
}*/

public class separate0and1{
	public static void main(String[] args) {
		int arr[] = {0,1,1,0,1,0,0,0,1};
		int[] result=separatezeroand1(arr);
		System.out.println(Arrays.toString(result));
	}

	private static int[] separatezeroand1(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int left=0;
			int right=arr.length-1;
			while(arr[left]==0)
				left++;
			while(arr[right]==1)
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