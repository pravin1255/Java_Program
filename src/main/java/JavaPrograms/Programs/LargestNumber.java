/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * To find Largest number less than given number and given digit
 */
public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getLessThanN(145,4));
	}
	
	static int getLessThanN(int number, int digit){
		char c=Integer.toString(digit).charAt(0);
		for(int i=number;i>0;i--){
			System.out.println(Integer.toString(i).indexOf(c));
			if(Integer.toString(i).indexOf(c)==-1){
				
			return i;
			}
		}
		return -1;
	}
}