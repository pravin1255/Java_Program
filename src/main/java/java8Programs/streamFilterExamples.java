package java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * https://mkyong.com/java8/java-8-streams-filter-examples/
 */
public class streamFilterExamples {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("spring","node","king");
		List<String> result=list.stream().filter(s->!s.equals("king")).collect(Collectors.toList());
		//result.forEach(System.out::println);
		result.forEach(s->System.out.println(s));
	}
}
