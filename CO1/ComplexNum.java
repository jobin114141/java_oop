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
public class ComplexNum {
    int real,img;

    ComplexNum() {
        Scanner o = new Scanner(System.in);
        System.out.print("Enter the real Part:");
        real=o.nextInt();
        System.out.print("Enter the imaginary Part:");
        img=o.nextInt();
    }
    static void add(ComplexNum a,ComplexNum b)
    {
        int r1=a.real+b.real;
        int i1=a.img+b.img;
        System.out.println(a.real+"+"+a.img+"i  +  "+b.real+"+"+b.img+"i  =  "+r1+"+"+i1+"i");
    }
    public static void main(String[] args) {
        ComplexNum ob1 = new ComplexNum();
        ComplexNum ob2 = new ComplexNum();
        add(ob1, ob2);
    }
}
