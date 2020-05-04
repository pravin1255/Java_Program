/**
 * 
 */
package JavaPrograms.Programs;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author PUNITH
 * To check whether the given number is binary or not
 */
public class BinaryNumber {
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		while(true){
//				int num;
//				System.out.println("Enter a number");
//				try {
//					num=sc.nextInt();
//					binaryOrNot(num);
//				} catch (NoSuchElementException e) {
//					e.printStackTrace();
//				}
//				
//				System.out.println("Do you want to check other number(y/n):");
//				String option=sc.next();
//				if(option.equalsIgnoreCase("n")){
//					System.out.println("So we are exiting the programs");
//					break;
//				}
//			
//		}
		
			do{
			try(Scanner sc=new Scanner(System.in);){
				System.out.println("Enter a number");
				try {
					int num=sc.nextInt();
					binaryOrNot(num);
				} catch (NoSuchElementException e) {
					e.printStackTrace();
				}
				
				System.out.println("Do you want to check other number(y/n):");
				String option=sc.next();
				if(option.equalsIgnoreCase("n")){
					break;
				}
			}			
		}while(true);
		
	}

	private static void binaryOrNot(int num) {
		boolean flag=true;
		int num1=num;
		while(num!=0){
			int copyofnum=num%10;
			if(copyofnum>1)
			{
				flag=false;
				break;
			}
			num=num/10;
		}
		if(flag)
			System.out.println(num1+" is binary number");
		else
			System.out.println(num1+" is not binary");
	}
}
