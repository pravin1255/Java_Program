/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Arrays;

/**
 * @author PUNITH
 *
 */
public class SelectionSortInJava {
	public static void main(String[] args) {
		selectionSort(new int[] {21,45,-11,18,51,32});
	}
	
	static void selectionSort(int[] inputArray) {
		System.out.println(Arrays.toString(inputArray));
		int temp,pos;
		for(int i=0;i<inputArray.length-1;i++) {
			pos=i;
			for(int j=i+1;j<inputArray.length;j++) {
				if(inputArray[j]<inputArray[pos]) {
					pos=j;
				}
			}			
			temp=inputArray[i];
			inputArray[i]=inputArray[pos];
			inputArray[pos]=temp;
		}
		
		System.out.println(Arrays.toString(inputArray));
	}
}