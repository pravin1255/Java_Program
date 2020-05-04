/**
 * 
 */
package java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author PUNITH
 * https://mkyong.com/java8/java-8-streams-filter-examples/
 */
public class streamFilterExamples4 {
	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(new Person("king", 30),
				new Person("jack", 20),
				new Person("lawrence", 40));
		
		String name=persons.stream().filter(x->x.getName().equals("jack")).map(Person::getName).findAny().orElse(null);
		System.out.println(name);
		
		List<String> collect=persons.stream().map(Person::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}
}