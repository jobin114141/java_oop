/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nimisha.tony;

import java.util.Scanner;

/**
 *
 * @author Nimisha
 */
public class Product {
    int p_code;
    String p_name;
    int price;
    public Product() {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Product Code:");
        p_code=ob.nextInt();
        System.out.println("Enter the Product Name:");
        p_name=ob.next();
        System.out.println("Enter the Price:");
        price=ob.nextInt();
    }
    public int l_price()
    {
        return price;
    }
    public static void main(String args[])
    {
        int a,b,c;
        Product p1 = new Product();
        a = p1.l_price();
        Product p2 = new Product();
        b = p2.l_price();
        Product p3 = new Product();
        c = p3.l_price();
        if(a<b)
        {
            if(a<c)
            {
                System.out.println("Lowest Price is:"+c);
            }
            else
            {
                System.out.println("Lowest Price is:"+a);
            }
        }
        else
        {
            if(b<c)
            {
                System.out.println("Lowest Price is:"+c);
            }
            else
            {
                System.out.println("Lowest Price is:"+b);
            }
        }
    }   
}
