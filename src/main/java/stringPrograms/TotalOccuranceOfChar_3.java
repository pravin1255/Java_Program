/**
 * 
 */
package stringPrograms;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/java-interview-programs-on-strings/
 */
public class TotalOccuranceOfChar_3 {
	public static void main(String[] args) {
		String s="Java is java again java";
		
//		int count=s.length();
//		
//		s=s.replace("a", "");
//		
//		int count2=s.length();
//		
//		int count3=count-count2;
		
		int count=s.length()-s.replace("a", "").length();
		
		System.out.println("The number of occurance of 'a' in "+s+" is "+count);
	}
}