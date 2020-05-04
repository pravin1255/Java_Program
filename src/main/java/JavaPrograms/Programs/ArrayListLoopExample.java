/**
 * 
 */
package JavaPrograms.Programs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author PUNITH
 * https://javahungry.blogspot.com/2017/10/5-ways-how-to-iterate-or-loop-over-arraylist.html
 */
public class ArrayListLoopExample {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(13);
		al.add(7);
		al.add(36);
		al.add(89);
		al.add(97);
		
		/*
		 * For loop for traversing ArrayList
		 */
//		System.out.println("Suing for loop");
//		for(int i=0;i<al.size();i++)
//			System.out.println(al.get(i));
		
		/*
		 * Advanced for loop example for traversing arraylist
		 */
//		System.out.println("Using advanced for loop");
//		for(int num:al)
//			System.out.println(num);
		
		/*
		 * While loop example for iterating ArrayList
		 */
//		System.out.println("Using while loop");
//		int count=0;
//		while(al.size()>count) {
//			System.out.println(al.get(count));
//			count++;
//		}
		
		/*
		 * Iterator example for Traversing arrayList
		 */
//		System.out.println("using iterator");
//		Iterator<Integer> itr=al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		
		/*
		 * Using collection stream
		 */
		System.out.println("using java 8");
		//al.forEach(System.out::println);
		al.forEach(s->System.out.println(s));
	}
}