/**
 * 
 */
package java8Programs;

import java.util.HashMap;
import java.util.Map;

/**
 * @author PUNITH
 * https://mkyong.com/java8/java-8-foreach-examples/
 *
 */
public class forEachAndMap {
	public static void main(String[] args) {
		Map<String,Integer> items=new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		//items.forEach((k,v)->System.out.println("Item: "+k+" Count: "+v));
		
		items.forEach((k,v)->{
			System.out.println("Item: "+k+" Value: "+v);
			if(k.equals("C"))
				System.out.println("Hello "+k);
		});
	}
}