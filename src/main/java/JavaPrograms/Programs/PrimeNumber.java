/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * Program to find the prime numbers
 */
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("23 is Prime number? "+isPrime(23));
		System.out.println("99 is Prime number? "+isPrime(99));
		System.out.println("127 is Prime number? "+isPrime(127));
	}
	
	static boolean isPrime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
}
