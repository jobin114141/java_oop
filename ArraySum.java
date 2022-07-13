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
public class ArraySum {
    public static void main(String[] args) {
        int[] a = null;
        int l,i,s;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        l=obj.nextInt();
        System.out.println("Enter the Elements");
        for(i=0;i<l;i++)
        {
            a[i]=obj.nextInt();
        }
        s = 0;
        for (i= 0; i < l; i++) {
            s=s+a[i];
        }
        System.out.println("Sum of Array Elements is " + s);
    }
}
