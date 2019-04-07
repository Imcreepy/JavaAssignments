public class FindPrimeNumbers
{
	public static void main(String[] args)
	{
	    int flag = 0;
	    System.out.print("Prime numbers between 1 to 100 is: ");
	    
	    for(int i = 1; i <= 100; i++)
	    {
	        for(int j = 2; j < i; j++)
	        {
	            if(i % j == 0)
	            {
	                flag = 0;
	                break;
	            }
	            
	            else
	                flag = 1;
	           
	        }
	        
	        if(flag == 1)
	            System.out.print(i + " ");
	    }
	}
}