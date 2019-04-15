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
public class Fibonacci {

    public static void main(String[] args) {

        int n, a = 0, b = 0, c = 1;
        System.out.print("Fibonacci Series:");
        while(a<100)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}
