/**
 * 
 */
package java9Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author PUNITH
 * The main purpose of Stream.ofNullable method is to prevent null checking
 * and also NullPointerException
 */
public class ofNullableExample {
	public static void main(String[] args) {
		
		List a1=Stream.ofNullable(null).collect(Collectors.toList());
		System.out.println(a1);
		
		a1=Stream.ofNullable("a").collect(Collectors.toList());
		System.out.println(a1);
		List<String> l1=new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add(null);
		l1.add("A");
		l1.add(null);
		System.out.println(l1);
		List<String> l2=l1.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList());
		System.out.println(l2);	
	}
}