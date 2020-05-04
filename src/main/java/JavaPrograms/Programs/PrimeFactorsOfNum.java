/**
 * 
 */
package JavaPrograms.Programs;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author PUNITH
 * Program to find prime factors of a num
 * https://java2blog.com/how-to-find-prime-factors-of-number-in/
 * Conversion-Characters:
	d : decimal integer [byte, short, int, long]
	f : floating-point number [float, double]
	c : character Capital C will uppercase the letter
	s : String Capital S will uppercase all the letters in the string
	h : hashcode A hashcode is like an address. This is useful for printing a reference
	n : newline Platform specific newline character- use %n instead of \n for greater compatibility
 */
public class PrimeFactorsOfNum {
	public static void main(String[] args) {
		System.out.println("prime factors of 49 is: ");
		System.out.printf("%s %n",primeFactors(100));
		System.out.printf("%s %n",primeFactors(18));
		System.out.printf("%s %n",primeFactors(30));
		System.out.printf("%s %n",primeFactors(32));
	}
	
//	static List<Integer> primeFactors(int number){
//		int n=number;
//		List<Integer> primeFactors=new ArrayList<>();
//		for(int i=2;i<=n;i++) {
//			if(n%i==0)
//			{
//				primeFactors.add(i);
//				n=n/i;
//			}
//		}
//		return primeFactors;
//	}
	
	static Set<Integer> primeFactors(int number){
		int n=number;
		Set<Integer> primeFactor=new LinkedHashSet();
		for(int i=2;i<=n;i++) {
			while(n%i==0) {
				primeFactor.add(i);
				n=n/i;
			}
		}
		return primeFactor;
	}
}
