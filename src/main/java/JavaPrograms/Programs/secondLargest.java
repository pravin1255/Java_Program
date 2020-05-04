/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * To find the second largest element in an integer array
 */
public class secondLargest {

	public static void main(String[] args) {
		System.out.println(secondLargest(new int[]{10,20,45,87,12}));
	}
	
	static int secondLargest(int[] input){
		int firstLargest,secondLargest;
		if(input[0]>input[1]){
			firstLargest=input[0];
			secondLargest=input[1];
		}
		else{
			firstLargest=input[1];
			secondLargest=input[0];
		}
		for(int i=2;i<input.length;i++){
			if(input[i]>firstLargest){
				secondLargest=firstLargest;
				firstLargest=input[i];
			}
			else if(input[i]<firstLargest && input[i]>secondLargest)
				secondLargest=input[i];
		}
		return secondLargest;
	}
}
