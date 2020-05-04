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
public class streamFilterExamples3 {
	public static void main(String[] args) {
		List<Person> persons=Arrays.asList(new Person("king", 30),
				new Person("jack", 20),
				new Person("lawrence", 40));
		
		Person result1=persons.stream().filter(p->p.getName().equals("jack") && p.getAge()==20).findAny().orElse(null);
		System.out.println(result1);
		Person result2=persons.stream().filter(p->{
			if(p.getName().equals("jack") && p.getAge()==21)
				return true;
			return false;
		}).findAny().orElse(null);
		System.out.println(result2);
	}
}
