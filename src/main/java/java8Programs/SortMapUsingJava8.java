/**
 * 
 */
package java8Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author PUNITH
 * https://www.java67.com/2017/07/how-to-sort-map-by-values-in-java-8.html
 */
public class SortMapUsingJava8 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("Ravi", 1000);
		map.put("Raj", 5000);
		map.put("Rak", 5500);
		map.put("Tej", 120);
		map.put("Shiv", 1200);
		
		//map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey()).forEach(System.out::println);
		
		Map<String,Integer> map2=map
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		System.out.println(map2);
		
		Map<String,Integer> map3=map
				.entrySet()
				.stream()
				.sorted(Map.Entry.<String,Integer>comparingByValue())
				.collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		System.out.println(map3);
		
		map
		.entrySet()
		.stream()
		.sorted(Map.Entry.<String,Integer>comparingByValue()).forEach(System.out::println);
	}
}