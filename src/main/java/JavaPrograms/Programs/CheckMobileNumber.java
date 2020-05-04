/**
 * 
 */
package JavaPrograms.Programs;

import java.util.Scanner;

/**
 * @author PUNITH
 * Program to check whether user input is a valid 10 digit mobile number or not 
 * Here we are using Long instead of Integer.parseInt() method because if we use int and type mobile number as 
 * 9874561230 than we get not a valid number as int range is less.
 */

class Utility{
	static boolean numberOrNot(String input){
		try{
			Long.valueOf(input);
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
			System.out.println(e);
			return false;
		}
		return true;
	}
}
public class CheckMobileNumber {
	public static void main(String[] args) {
		System.out.println("Enter your mobile number");
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		if(Utility.numberOrNot(num) && num.length()==10)
			System.out.println("Good you have entered proper mobile number");
		else
			System.out.println("Please enter valid mobile number");
	}
}