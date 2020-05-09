/**
 * 
 */
package java9Programs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author PUNITH
 *
 */
public class ofNullableExample2 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", null);
		map.put("D", "Dog");
		map.put("E", null);
		
		List l1=map.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList());
		System.out.println(l1);
		
		/*
		 * Usually flatMap method is used with Stream.ofNullable method
		 * as flatMap works with 1 to any concept i.e it can be zero or more elements which
		 * can be returned in flatMap
		 */
		List<String> l2=map.entrySet().stream().flatMap(e->Stream.ofNullable(e.getValue())).collect(Collectors.toList());
		System.out.println(l2);
	}
}