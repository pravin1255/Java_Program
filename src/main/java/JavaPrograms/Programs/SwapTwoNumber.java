/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * Program to swap 2 numbers without using third number
 * https://java2blog.com/how-to-swap-two-numbers-without-using-temporary-variables-in-java/
 */
public class SwapTwoNumber {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		System.out.println("a: "+a+" b: "+b);
		/*
		 * 1st method
		 */
//		a=a+b;//15
//		b=a-b;//10
//		a=a-b;//5
//		System.out.println("a: "+a+" b: "+b);
		
		/*
		 * 2nd method
		 */
//		a=a*b;//50
//		b=a/b;//10
//		a=a/b;//5
//		System.out.println("a: "+a+" b: "+b);
		
		/*
		 * 3rd method
		 */
		a=a^b;//15
		b=a^b;//10
		a=a^b;//5
		System.out.println("a: "+a+" b: "+b);
	}
}
