/**
 * 
 */
package java8Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author PUNITH
 *
 */
public class flatMapExample {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		for(int i=1;i<=5;i++)
			l1.add(i);
		System.out.println(l1);
		
		List<Integer> l2=l1.stream().flatMap(x->Stream.of(x*x,x*x*x)).collect(Collectors.toList());
		//l2.forEach(System.out::print);
		//System.out.println(l2);
		l2.forEach(s->System.out.print(s+" "));
	}
}