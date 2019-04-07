public class FindEvenNumbers
{
	public static void main(String[] args)
	{
	    System.out.print("Even numbers between 1 to 100 is: ");
	    
	    for(int i = 1; i <= 100; i++)
	    {
	        if(i % 2 == 0)
	            System.out.print(i + " ");        
	    }
	}
}