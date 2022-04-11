/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nimisha.tony;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nimisha
 */
public class StingSort {
    public static void main(String[] args) {
        Scanner ob =  new Scanner(System.in);
        System.out.print("Enter the Number of Strings:");
        int lmt=ob.nextInt();
        String arr[] = new String[lmt];
        System.out.println("Enter the Strings in array:");
        for(int i=0;i<lmt;i++)
        {
            arr[i]=ob.next();
        }
        /**
        for(int i=0;i<lmt;i++)
        {
            for(int j=i+1;j<lmt;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        **/
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for(int i=0;i<lmt;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
