import java.util.Scanner;

class Summ{
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter 2 Numbers:");

    int num1 = myObj.nextInt();
    int num2 = myObj.nextInt();
    System.out.println("Sum is: " + (num1+num2));
  }
}
