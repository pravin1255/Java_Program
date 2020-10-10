/**
 * 
 */
package stringPrograms;

import java.text.DecimalFormat;

/**
 * @author PUNITH
 * https://javaconceptoftheday.com/how-to-find-percentage-of-uppercase-letters-lowercase-letters-digits-and-special-characters-in-string/
 */

public class StringCharCount{
	public static void main(String[] args) {
		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
	}
	
	public static void characterPercentage(String inputString) {
		int totalChars=inputString.length();
		
		int upperCaseLetter=0;
		int lowerCaseLetter=0;
		int digit=0;
		int others=0;
		
		for(int i=0;i<totalChars;i++) {
			
			char ch=inputString.charAt(i);
			if(Character.isUpperCase(ch))
				upperCaseLetter++;
			else if(Character.isLowerCase(ch))
				lowerCaseLetter++;
			else if(Character.isDigit(ch))
				digit++;
			else
				others++;
		}
		
		double upperCaseLetterPercentage=(upperCaseLetter*100.00)/totalChars;
		double lowerCaseLetterPercentage=(lowerCaseLetter*100.00)/totalChars;
		double digitPercentage=(digit*100)/digit;
		double othersPercentage=(others*100)/totalChars;
		
		DecimalFormat format=new DecimalFormat("##.##");
		
		System.out.println("Upper case letter: "+format.format(upperCaseLetterPercentage));
		System.out.println("Lower case letter: "+format.format(lowerCaseLetterPercentage));
		System.out.println("Digit: "+format.format(digitPercentage));
		System.out.println("Others: "+format.format(othersPercentage));
		
	}
}