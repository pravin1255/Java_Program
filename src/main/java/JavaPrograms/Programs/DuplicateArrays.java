/**
 * 
 */
package JavaPrograms.Programs;import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author PUNITH
 * To find duplicate elements in an arrays using  
 * 1. Brute force method
 * 2. Sorting method
 * 3. Using hashSet
 * 4. Using HashMap
 * 5. Using Java 8 Streams 
 */
public class DuplicateArrays {

	public static void main(String[] args) {
		int[] inputArray={111,333,555,777,333,444,555};
//		System.out.println("Duplicate Using Brute force");
		//findDuplicateUsingBruteForce(inputArray);
//		System.out.println("Duplicate Using Sorting");
//		findDuplicateUsingSorting(inputArray);
//		System.out.println("Duplicates using HashSet");
//		findDuplicatesUsingHashSet(inputArray);
//		System.out.println("Duplicates using HashMap");
//		findDuplicatesUsingHashMap(inputArray);
		System.out.println("Duplicates using Java 8 Streams");
		findDuplicatesUsingJava8(inputArray);
	}
	
	static void findDuplicateUsingBruteForce(int[] inputArray){
		for(int i=0;i<inputArray.length;i++){
			for(int j=i+1;j<inputArray.length;j++){
				if(inputArray[i]==inputArray[j])
					System.out.println(inputArray[i]);
			}
		}
	}
	
	static void findDuplicateUsingSorting(int[] inputArray){
		Arrays.sort(inputArray);
		for(int i=0;i<inputArray.length-1;i++){
			if(inputArray[i]==inputArray[i+1])
				System.out.println(inputArray[i]);
		}
	}
	
	static void findDuplicatesUsingHashSet(int[] inputArray){
		HashSet<Integer> set=new HashSet<>();
		for(int element:inputArray){
			if(!set.add(element))
				System.out.println(element);
		}
	}
	
	static void findDuplicatesUsingHashMap(int[] inputArray){
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int element:inputArray){
			if(map.get(element)==null)
				map.put(element, 1);
			else
				map.put(element, map.get(element)+1);
		}
		
		Set<Entry<Integer,Integer>> entrySet=map.entrySet();
		for(Entry<Integer,Integer> ent:entrySet){
			if(ent.getValue()>1)
				System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}
	
	static void findDuplicatesUsingJava8(int[] inputArray){
		Set<Integer> uniqueElements=new HashSet<>();
		Set<Integer> duplicateElements=Arrays.stream(inputArray).filter(i->!uniqueElements.add(i)).boxed().collect(Collectors.toSet());
		System.out.println(duplicateElements);
	}
}
