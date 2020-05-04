/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * https://www.techiedelight.com/c-program-to-print-right-angled-triangle-star-pattern/
 */
public class starPattern {
	public static void main(String[] args) {
		int n=3;
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<n;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int k=1;k<i;k++) {
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}