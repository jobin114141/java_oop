package graphics;
import java.util.Scanner;
public class Graphics {

 public static void main(String[] args) {

 double l,b,b1,h,r,a;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the length and breadth of rectangle");
 l=sc.nextDouble();
 b=sc.nextDouble();

 System.out.println("Enter the base and height of triangle");
 b1=sc.nextDouble();
 h=sc.nextDouble();

 System.out.println("Enter the side square");
 a=sc.nextDouble();

 System.out.println("Enter the radius of circle");
 r=sc.nextDouble();

 Rectangle r1=new Rectangle();
 r1.area(l, b);

 Triangle t1=new Triangle();
 t1.area(b, h);

 Square s1=new Square();
 s1.area(a);

 Circle c1=new Circle();
 c1.area(r);

 }
}
