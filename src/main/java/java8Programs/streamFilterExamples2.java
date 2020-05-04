/**
 * 
 */
package java8Programs;

import java.util.Arrays;
import java.util.List;

/**
 * @author PUNITH
 * https://mkyong.com/java8/java-8-streams-filter-examples/	
 */
public class streamFilterExamples2 {

	public static void main(String[] args) {
		List<Person> persons =Arrays.asList(new Person("king", 30),
				new Person("jack",20),
				new Person("lawrence",40));
		
		Person result1=persons.stream().filter(x->x.getName().equals("jack")).findAny().orElse(null);
		System.out.println(result1);
		
		Person person2=persons.stream().filter(x->x.getAge()==41).findAny().orElse(null);
		System.out.println(person2);
	}
}
