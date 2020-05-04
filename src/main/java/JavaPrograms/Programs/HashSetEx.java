/**
 * 
 */
package JavaPrograms.Programs;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author PUNITH
 * How to use hashset in java
 */

class Student1{
	String name;
	int rollno;
	String dept;
	
	Student1(String name,int rollno, String dept){
		this.name=name;
		this.rollno=rollno;
		this.dept=dept;
	}
	
//	public int hashCode() {
//		return rollno;
//	}
//	
//	public boolean equals(Object obj) {
//		Student student=(Student)obj;
//		return (rollno==student.rollno);
//	}
	
	public int hashCode() {
		int hashCode=0;
		hashCode+=name.hashCode();
		return hashCode;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student1) {
			Student1 stu=(Student1)obj;
			return (stu.name.equals(this.name));
		}
		else
			return false;
	}
	
	public String toString() {
		return name+" "+rollno+" "+dept;
	}	
}
public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Student1> set=new HashSet<>();
		set.add(new Student1("Avinash",121,"ECE"));
		set.add(new Student1("Bharat",101,"EEE"));
		set.add(new Student1("Malini",151,"Civil"));
		set.add(new Student1("Suresh",200,"IT"));
		set.add(new Student1("Vikram",550,"CS"));
		set.add(new Student1("Bharat",301,"IT"));
		set.add(new Student1("Amit",301,"IT"));
		set.add(new Student1("Bhavya",872,"ECE"));
		set.add(new Student1("Naman",301,"CS"));
		set.add(new Student1("Samson",565,"Civil"));
		set.add(new Student1("Amit",302,"IT"));
		
		Iterator<Student1> itr=set.iterator();
		
		while(itr.hasNext()) {
			Student1 student=itr.next();
			System.out.println(student);
		}
	}
}
