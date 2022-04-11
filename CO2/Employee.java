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
public class Employee {
    int eno,esalary;
    String ename;
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number of Employees:");
        int lmt=obj.nextInt();
        Employee emp[] = new Employee[lmt];
        for(int i=0;i<lmt;i++)
        {
            emp[i] = new Employee();
            System.out.println("Enter the Details of the Employee "+(i+1)+".");
            System.out.print("ID Number:");
            emp[i].eno = obj.nextInt();
            System.out.print("Name:");
            emp[i].ename = obj.next();
            System.out.print("Salary:");
            emp[i].esalary = obj.nextInt();
        }
        System.out.print("Enter the Employee ID to Display the details:");
        int eid=obj.nextInt();
        int f=0;
        for(int i=0;i<lmt;i++)
        {
            if(emp[i].eno==eid)
            {
                f=1;
                System.out.println("Name:"+emp[i].ename);
                System.out.println("Salary:"+emp[i].esalary);
            }
        }
        if(f==0)
        {
            System.out.println("Cannot find an Employee.");
        }
    }
}
