/**
 * 
 */
package JavaPrograms.Programs;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author PUNITH
 * Program to find number occurring odd of times in an array
 */
//public class NumberOddnoOfTimes {
//	public static void main(String[] args) {
//		int[] array= {20,40,50,40,50,20,30,30,50,20,40,40,20};
//		int result=getoddTimesElelemntHashing(array);
//		System.out.println(result);
//	}
//	static int getoddTimesElelemntHashing(int[] array) {
//		Map<Integer,Integer> elements=new LinkedHashMap<>();
//		for(int i=0;i<array.length;i++) {
//			int element=array[i];
//			if(elements.get(element)==null)
//				elements.put(element,1);
//			else
//				elements.put(element,elements.get(element)+1);
//		}
//		
//		for(Entry<Integer,Integer> entry:elements.entrySet()) {
//			if(entry.getValue()%2==1)
//				return entry.getKey();
//		}
//		return -1;
//	}
//	
//}

public class NumberOddnoOfTimes {
	public static void main(String[] args) {
		int[] array= {20,40,50,40,50,20,30,30,30,20,40,40,20};
		getoddTimesElelemntHashing(array);
	}
	
	static void getoddTimesElelemntHashing(int[] inputArray) {
		int count=1;
		
		//Using set because same number can be printed in the output 
		Set<Integer>  set=new HashSet<>();
		for(int i=0;i<(inputArray.length/2)+1;i++) {
			for(int j=0;j<inputArray.length;j++) {
				if(i==j) {}
				else if(inputArray[i]==inputArray[j]) {
					count++;
				}
			}
			if(count%2==1) {
				if(set.add(inputArray[i]))
					System.out.println(inputArray[i]);
			}				
			count=1;
		}
	}
}