/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * https://java2blog.com/find-length-of-string-without-using/
 * To find length of the string without using inbuilt function
 */
public class FindLengthOfString {
	public static void main(String[] args) {
		String helloWord="This is hello world";
		System.out.println("Length of hello World is: "+getLengthOfString(helloWord));
		System.out.println("Length of hello World is: "+getLengthOfStringUsingException(helloWord));
	}
	
	static int getLengthOfString(String str) {
		int i=0;
		char[] ch=str.toCharArray();
		for(char c:ch)
			i++;
		return i;
	}
	
	static int getLengthOfStringUsingException(String str) {
		int i=0;
		for(i=0;;i++)
			try {
				str.charAt(i);
			}
		catch(Exception e) {
			return i;
		}			
	}
}
