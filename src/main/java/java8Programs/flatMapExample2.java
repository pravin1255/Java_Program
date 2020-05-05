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
public class flatMapExample2 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		for(int i=0;i<=5;i++)
			l1.add(i);
		System.out.println(l1);
		
		List<Integer> l2=l1.stream().flatMap(x->{
			if(x%2==0)
				return Stream.empty();
			else
				return Stream.of(x,x*10);
		}).collect(Collectors.toList());
		System.out.println(l2);
	}
}