/**
 * 
 */
package JavaPrograms.Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author PUNITH
 * https://javahungry.blogspot.com/2017/11/how-to-synchronize-arraylist-in-java-with-example.html
 */
public class SynchronizedArrayList {
	public static void main(String[] args) {
		/*
		 * Converting Arraylist to Synchronized Arraylist
		 */
		List<String> synchronizedArraylist=Collections.synchronizedList(new ArrayList<String>());
		synchronizedArraylist.add("basketball");
		synchronizedArraylist.add("basketball");
		synchronizedArraylist.add("cricket");
		
		System.out.println("Iterating synchronized list");
		synchronized (synchronizedArraylist) {
			Iterator<String> itr=synchronizedArraylist.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
		}
	}
}