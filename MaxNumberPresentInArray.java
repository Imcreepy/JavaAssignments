public class MaxNumberPresentInArray
{
	public static void main(String[] args)
	{
	    int[] numbers = {1, 3, 9, 5, 7};
	    int biggestNumber = 0;
	    
	    for(int i = 0; i < 1; i++)
	    {
	        for(int j = i + 1; j < numbers.length; j++)
	        {
	            if(numbers[j] > numbers[i])
	                numbers[0] = numbers[j];
	        }
	        
	    }
	    
	    System.out.println("Biggest Number is: " + numbers[0]);
	}
}