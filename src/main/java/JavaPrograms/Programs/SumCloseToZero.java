/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;

/**
 * @author PUNITH
 * https://java2blog.com/find-pair-whose-sum-is-closest-to-zero-in-array/
 * Program to find pair whose sum is closest to zero in array
 */
public class SumCloseToZero {
	public static void main(String[] args) {
		int[] array={1,3,-5,7,8,20,-40,6};
		findPairWithMinSum(array);
	}
	
	static void findPairWithMinSum(int[] arr) {
		Arrays.sort(arr);
		int sum=0;
		int minimumValue=Integer.MAX_VALUE;
		int n=arr.length;
		if(n<0)
			return;
		
		int l=0,r=n-1;
		
		int  minLeft=l,minRight=r;
		while(l<r) {
			sum=arr[l]+arr[r];
			if(Math.abs(sum)<Math.abs(minimumValue)) {
				minimumValue=sum;
				minLeft=l;
				minRight=r;
			}
			
			if(sum<0)
				l++;
			else
				r--;
		}
		System.out.println("Pair is "+arr[minLeft]+" and "+arr[minRight]);
	}
}
