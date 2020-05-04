/**
 * 
 */
package JavaPrograms.Programs;

/**
 * @author PUNITH
 * To Find Continuous Sub Array In Array Whose Sum Is Equal To Number 
 */
import java.util.Arrays;

public class SubArrayWhoseSumIsNumber {
	static void findSubArray(int[] inputArray, int inputNumber)
    {
        //Initializing 'sum' to 0
 
        int sum = 0;
 
        //Iterating through 'inputArray'
 
        for (int i = 0; i < inputArray.length; i++)
        {
            //Assigning inputArray[i] to 'sum'
 
            sum = inputArray[i];
 
            for (int j = i+1; j < inputArray.length; j++)
            {
                //Adding inputArray[j] to 'sum'
 
                sum = sum + inputArray[j];
 
                //If 'sum' is equal to 'inputNumber' then printing the sub array
 
                if(sum == inputNumber)
                {
                    System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
 
                    for (int k = i; k <= j; k++)
                    {
                        System.out.print(inputArray[k]+" ");
                    }
 
                    System.out.println();
                }
 
                //if 'sum' is smaller than 'inputNumber', continue the loop
 
                else if (sum < inputNumber)
                {
                    continue;
                }
 
                //if 'sum' is greater than 'inputNumber', then break the loop
 
                else if (sum > inputNumber)
                {
                    break;
                }
            }
        }
    }

	public static void main(String[] args) {
		findSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);		
	}
}
