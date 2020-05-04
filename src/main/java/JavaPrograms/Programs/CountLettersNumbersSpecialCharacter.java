/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 *
 */
public class CountLettersNumbersSpecialCharacter {
	public static void main(String[] args) {
		String str="Capgemini@2020 Airoli";
		int upperLetter=0;
		int num=0;
		int space=0;
		int others=0;
		int lowerCase=0;
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(ch[i]))
				upperLetter++;
			else if(Character.isDigit(ch[i]))
				num++;
			else if(Character.isSpaceChar(ch[i]))
				space++;
			else if(Character.isLowerCase(ch[i]))
				lowerCase++;
			else
				others++;
		}
		
		System.out.println("upperLetters: "+upperLetter);
		System.out.println("lowerCase: "+lowerCase);
		System.out.println("Num: "+num);
		System.out.println("Space: "+space);
		System.out.println("others: "+others);
	}
}