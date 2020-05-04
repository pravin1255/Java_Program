/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author PUNITH
 * programs to find common elements between 2 arrays
 * OR
 * Program to find intersection between 2 arrays
 */
public class CommonElementsinArrays {
	public static void main(String[] args) {
		int[] a1={1,2,3,4,5,6,7};
		int[] a2={5,5,6,7,8,9,10};
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a1.length;i++){
			for(int j=0;j<a2.length;j++){
				if(a1[i]==a2[j]){
					set.add(a1[i]);
				}
			}
		}
		System.out.println(set);
	}
	
//	public static void main(String[] args) {
//		Integer[] a1={1,2,3,4,5,6};
//		Integer[] a2={5,5,6,6,7,8,9};
//		Set<Integer> set1=new LinkedHashSet<>(Arrays.asList(a1));
//		Set<Integer> set2=new LinkedHashSet<>(Arrays.asList(a2));
//		
//		set1.retainAll(set2);
//		System.out.println(set1);
//	}
}
