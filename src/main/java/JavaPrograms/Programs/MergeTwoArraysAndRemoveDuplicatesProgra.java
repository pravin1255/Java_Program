/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/merge-two-arrays-into-single-sorted-array-without-duplicates-in-java/
 */
public class MergeTwoArraysAndRemoveDuplicatesProgra {
	
	public static void main(String[] args) {
		int[] arrayA = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
        
        int[] arrayB = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
         
        int[] mergedArray = mergeArraysAndRemoveDuplicates(arrayA, arrayB);
         
        System.out.println("Array A : "+Arrays.toString(arrayA));
         
        System.out.println("Array B : "+Arrays.toString(arrayB));
         
        System.out.println("Sorted Merged Array With No Duplicates : ");
         
        System.out.println(Arrays.toString(mergedArray));
	}

	private static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB) {
			
		return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB)).distinct().sorted().toArray();
	}

//	private static int[] mergeArraysAndRemoveDuplicates(int[] arrayA, int[] arrayB) {
//		
//		int[] mergedArray=new int[arrayA.length+arrayB.length];
//		
//		int i=0,j=0,k=0;
//		
//		while(i<arrayA.length) {
//			mergedArray[k]=arrayA[i];
//			i++;
//			k++;
//		}
//		
//		while(j<arrayB.length) {
//			mergedArray[k]=arrayB[j];
//			k++;
//			j++;
//		}
//		
//		Set<Integer> setWithoutDuplicates=new HashSet<>();
//		
//		for(int l=0;l<mergedArray.length;l++) {
//			setWithoutDuplicates.add(mergedArray[l]);
//		}
//		
//		Iterator<Integer> itr=setWithoutDuplicates.iterator();
//		
//		int[] arrayWithoutDuplicate=new int[setWithoutDuplicates.size()];
//		
//		int m=0;
//		
//		while(itr.hasNext()) {
//			arrayWithoutDuplicate[m]=itr.next();
//			m++;
//		}
//		
//		Arrays.sort(arrayWithoutDuplicate);
//		
//		return arrayWithoutDuplicate;
//	}
}
