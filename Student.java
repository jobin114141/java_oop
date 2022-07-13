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
import java.util.Scanner;
public class Student {
    String name;
    int rollno;
    int mark;
    public void insert()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter student name:");
        String ptrn;
        this.name = myObj.nextLine();
        System.err.println("Enter the Roll Number:");
        this.rollno = myObj.nextInt();
        System.err.println("Enter the total Mark:");
        this.mark = myObj.nextInt();
    }
    public void display() {
        System.err.println("___Details___");
        System.err.println("Name : " + name);
        System.err.println("Roll Number : " + rollno);
        System.err.println("Total Mark : " + mark);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insert();
        s1.display();
    }
}
