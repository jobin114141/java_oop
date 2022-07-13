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
public class Employee {
    int e_id;
    float salary;
    String e_name;

    public Employee(int a,float b,String c) {
        e_id=a;
        salary=b;
        e_name=c;
    }
    public void display()
    {
        System.out.println("Employee ID:"+e_id);
        System.out.println("Employee Name:"+e_name);
        System.out.println("Salary:"+salary);
    }
    public void total_salary()
    {
        System.out.println("Total Salary:"+(salary+(salary*(20/100))));
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(33,30000,"Nimisha Tony");
        e1.display();
        e1.total_salary();
        Employee e2 = new Employee(24,35000,"Nymish Tony");
        e2.display();
        e2.total_salary();
    }
}
