/**
 * 
 */
package JavaPrograms.Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author PUNITH
 * https://javahungry.blogspot.com/2017/11/how-to-iterate-or-loop-over-hashmap-in-java-with-example.html
 */
public class IterateHashMap {
	
	//approach 1
//	public static void main(String[] args) {
//		HashMap<String,String> hashMap=new HashMap<>();
//		hashMap.put("Key1", "Value1");
//		hashMap.put("key2", "value2");
//		System.out.println("Iterating or looping map using foreach loop");
//		for(String key:hashMap.keySet()) {
//			System.out.println("Key: "+key+" value: "+hashMap.get(key));
//		}
//	}
	
	//approach 2
	public static void main(String[] args) {
		HashMap<String, String> hashMap=new HashMap<>();
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		
		Set<String> keySet=hashMap.keySet();
		Iterator<String> iterator=keySet.iterator();
		while(iterator.hasNext()) {
			String key=iterator.next();
			System.out.println("Key: "+key+" value: "+hashMap.get(key));
		}		
	}
	
	//approach 3
//	public static void main(String[] args) {
//		HashMap<String,String> hashmap=new HashMap<>();
//		hashmap.put("key1", "value1");
//		hashmap.put("key2", "value2");
//		
//		Set<Entry<String,String>> entrySet=hashmap.entrySet();
//		for(Entry<String,String> ent:entrySet)
//			System.out.println("key: "+ent.getKey()+" value: "+ent.getValue());
//	}
	
	//approach 4
//	public static void main(String[] args) {
//		HashMap<String,String> hashMap=new HashMap<>();
//		hashMap.put("key1", "value1");
//		hashMap.put("key2", "value2");
//		
//		Set<Entry<String,String>> entrySet=hashMap.entrySet();
//		Iterator<Map.Entry<String,String>> iterator=entrySet.iterator();
//		
//		while(iterator.hasNext()) {
//			Map.Entry<String, String> map=iterator.next();
//			System.out.println("Key: "+map.getKey()+"Value: "+map.getValue());
//		}
//		
//		
//				
//	}
}