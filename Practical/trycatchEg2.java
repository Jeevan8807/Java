import java.util.InputMismatchException;
import java.util.Scanner;
public class trycatchEg2 {
 public static void main(String args[]) {

    try
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the value of x: ");
      int x = sc.nextInt();
      System.out.println("Enter the value of y: ");
      int y = sc.nextInt();
      int result = x/y;
      System.out.println("Result : " +result);

    }
    catch (ArithmeticException e)
    {
        System.out.println("Entered values need to be integers: ");

    }
    
 }

    
}
