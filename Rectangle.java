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
public class Rectangle {
    int l,b;
    public Rectangle(int a,int c) {
        l=a;
        b=c;
    }
    public void area()
    {
        System.out.println("Area:"+(l*b));
    }
    public void pere()
    {
        System.out.println("Peremeter:"+(2*(l+b)));
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(56,9);
        r1.area();
        r1.pere();
        Rectangle r2 = new Rectangle(5,9);
        r2.area();
        r2.pere();
    }
}
