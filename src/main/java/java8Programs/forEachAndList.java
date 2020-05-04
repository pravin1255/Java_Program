/**
 * 
 */
package java8Programs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PUNITH
 * https://mkyong.com/java8/java-8-foreach-examples/
 *
 */
public class forEachAndList {
	public static void main(String[] args) {
		List<String> items=new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		items.forEach(item->System.out.print(item+" "));
		
		items.forEach(item->{
			if(item.equals("C"))
				System.out.println("hello "+item);
		});
		
		items.forEach(System.out::println);
		
		items.stream().filter(s->s.equals("B")).forEach(System.out::println);	
	}
}
