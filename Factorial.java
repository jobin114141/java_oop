/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21mca033;

/**
 *
 * @author sjcet
 */
public class Factorial {
    static int factorial( int n ) {
        if (n != 0)
            return n * factorial(n-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
