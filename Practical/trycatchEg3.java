import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatchEg3 {
    public static void main(string args[]) {

    Scanner sc = new Scanner(System.in);
        try{
        try{
            int x = new Integer(sc.nextInt());
            int y = new Integer(sc.nextInt());
            
            System.out.println(""+(x/y));
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
            
        }catch(Exception e){
            System.out.println(e);
        }
    
}
}

