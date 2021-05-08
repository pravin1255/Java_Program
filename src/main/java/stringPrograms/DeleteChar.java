/**
 * 
 */
package stringPrograms;

/**
 * @author PUNITH
 * https://www.tutorialspoint.com/javaexamples/string_removing_char.htm
 */
public class DeleteChar {
	public static void main(String[] args) {
		String str="This is java";
		System.out.println(deleteChar(str,0));
	}
	
	static String deleteChar(String s, int index) {
		
		return s.substring(0,index)+s.substring(index+1);
	}
}