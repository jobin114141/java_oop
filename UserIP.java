/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21mca033;

import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class UserIP {
    public static void main(String[] args)
    {
        int a,b;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number:");
        a=myObj.nextInt();
        System.out.println("Enter second number:");
        b=myObj.nextInt();
        System.out.println("Sum is "+(a+b));
    }
}
