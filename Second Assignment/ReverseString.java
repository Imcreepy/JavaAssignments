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
public class ReverseString {
    public static void main(String[] args)
    {
        String message = "I Love Java";

        System.out.print("Reverse of " + message + " is ");
        
        for(int i = message.length() - 1; i>= 0; i--)
        {
            System.out.print(message.charAt(i));
        }
    }
}
