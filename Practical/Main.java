import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int marks= Sc.nextInt();

                if(marks<35){
                    System.out.println("Failed!!!");
                }
                else if(marks>=35 && marks<40) {
                    System.out.println("E grade");
                }
                else if(marks>=40 && marks<50) {
                    System.out.println("D grade");
                }
                else if(marks>=50 && marks<60){
                    System.out.println("C grade");
                }
                else if(marks>=60 && marks<70){
                    System.out.println("B grade");
                }
                else if(marks>=70 && marks<80){
                    System.out.println("A grade");
                }
                else if(marks>=80 && marks<90){
                    System.out.println("A+ grade");
                }else if(marks>=90 && marks<100){
                    System.out.println("O grade");
                }else{
                    System.out.println("Invalid!");
                }
            }

        }
