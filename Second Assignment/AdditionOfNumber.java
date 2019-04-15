package secondassignment;

import java.util.Scanner;
 
public class AdditionOfNumber
{
    public static void main(String[] args)
    {
        int add = 0;
        
	System.out.println("Enter a number: ");

	Scanner myObj = new Scanner(System.in);
	
 	int number = myObj.nextInt();

        while (number > 0) 
        {
            add = add + (number % 10);
            
            number = number / 10;
        }

    System.out.println("addition= " + add);
    }
}
