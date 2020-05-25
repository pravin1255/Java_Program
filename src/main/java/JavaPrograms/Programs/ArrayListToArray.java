package JavaPrograms.Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author PUNITH
 * https://javahungry.blogspot.com/2017/11/how-to-convert-arraylist-to-string-array-java-example.html
 */
//public class ArrayListToArray {
//	public static void main(String[] args) {
//		List<String> al=new ArrayList<>();
//		al.add("A");
//		al.add("B");
//		al.add("C");
//		al.add("D");
//		
//		String[] str=new String[al.size()];
//		for(int j=0;j<str.length;j++)
//			str[j]=al.get(j);
//		
//		Arrays.stream(str).forEach(System.out::println);
//	}
//}

public class ArrayListToArray{
	public static void main(String[] args) {
		List<String> al=new LinkedList<>();
		al.add("A");
		al.add("B");
		al.add("D");
		al.add("Z");
		
		String[] str=al.toArray(new String[al.size()]);
		for(int i=0;i<al.size();i++)
			str[i]=al.get(i);
		
		Arrays.stream(str).forEach(System.out::print);
	}
}