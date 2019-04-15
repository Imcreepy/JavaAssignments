/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondassignment;

/**
 *
 * @author HP
 */
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1, number = 0;
    
        System.out.println("Enter a number: ");

        Scanner obj = new Scanner(System.in);

        number = obj.nextInt();

        for(int i = number; i>=1; i--)
        {
            fact = fact * i;
        }
    
        System.out.println(number + "! = " + fact);
    }
}
