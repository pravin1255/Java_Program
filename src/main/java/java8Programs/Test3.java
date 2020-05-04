/**
 * 
 */
package java8Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author PUNITH
 *
 */
public class Test3{
	public static void main(String[] args) {
		List<String> lines=Arrays.asList("Spring","node","king");
		List<String> result=getFilterOutput(lines,"king");
		for(String s:result)
			System.out.println(s);
	}
	
	public static List<String> getFilterOutput(List<String> list, String str){
		List<String> newList=new ArrayList<>();
		for(String s:list) {
			if(!s.equals(str))
				newList.add(s);
		}
		return newList;
	}
}