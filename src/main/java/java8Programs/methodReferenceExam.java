/**
 * 
 */
package java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author PUNITH
 * https://mkyong.com/java8/java-8-method-references-double-colon-operator/
 */
public class methodReferenceExam {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("A","B","C");
//		list.forEach(new Consumer<String>() {
//			public void accept(String str) {
//				SimplePrinter.print(str);
//			}
//		});
		
		//list.forEach(str->SimplePrinter.print(str));
		list.forEach(SimplePrinter::print);
	}	
}

class SimplePrinter{
	static void print(String str) {
		System.out.println(str);
	}
}
