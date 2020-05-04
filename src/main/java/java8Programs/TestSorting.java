/**
 * 
 */
package java8Programs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author PUNITH
 *
 */
public class TestSorting {
	private static List<Developer> getDevelopers(){
		List<Developer> result=new ArrayList<>();
		result.add(new Developer("mkyong", new BigDecimal("70000"),33));
		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));
		
		return result;
	}

	public static void main(String[] args) {
		List<Developer> list=getDevelopers();
		
		System.out.println("Before sort");
		list.forEach(System.out::println);
		
		//list.sort((a,b)->a.getAge()-b.getAge());
		//list.sort((a,b)->a.getName().compareTo(b.getName()));
		//list.sort((a,b)->a.getSalary().compareTo(b.getSalary()));
		
		//for reverse sorting
//		Comparator<Developer> salaryComparator=(a,b)->a.getSalary().compareTo(b.getSalary());
//		list.sort(salaryComparator.reversed());
		
//		Comparator<Developer> ageComparator=(a,b)->a.getAge()-b.getAge();
//		list.sort(ageComparator.reversed());
		
		Comparator<Developer> nameComparator=(a,b)->a.getName().compareTo(b.getName());
		list.sort(nameComparator.reversed());		
		
		System.out.println("After sort");
		list.forEach(System.out::println);
	}
}