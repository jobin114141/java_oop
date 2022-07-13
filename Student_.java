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
class Student_ {
    int m1,m2,m3;

    Student_(int a,int b,int c) {
        m1=a;
        m2=b;
        m3=c;
    }
    public void sum()
    {
        System.out.println("Sum:" + (m1+m2+m3));
    }
    public void perc()
    {
        int p;
        p=((m1+m2+m3)*100)/300;
        System.out.println("Percentage:" + p );
    }
    public static void main(String[] args)
    {
        Student_ s1 = new Student_(23,78,91);
        s1.sum();
        s1.perc();
        Student_ s2 = new Student_(30,70,50);
        s2.sum();
        s2.perc();
    }
}
