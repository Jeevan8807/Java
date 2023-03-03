import java.util.*;

public class CalculatorLab { //create a class 
    
    public static void main(String args[]) { //create a main method 
        Scanner sc = new Scanner(System.in); // add class and create a class of object 
        int option;. // Add a variable 
        do{
            System.out.println("Enter a value:\n +"+"1-Add\n"+"2-Substract\n"+ //print all the menu   
            "3-Multiply\n"+
            "4-Even/Odd number\n"
            +"5-Quit");
    
option=sc.nextInt(); // to take a input from user
switch(option) { //to select a menu in different case
case 1:
    System.out.println("Enter two numbers to be added"); //print add
    double num1=sc.nextInt(); //add two num and read 
    double num2=sc.nextInt();
    double result= num1+num2;. //this line will give the result.
    System.out.println("The result is "+ result); //print result
    
case 2:
    System.out.println("Enter two numbers to be substracted");
    num1=sc.nextInt();
    num2=sc.nextInt();
    result= num1-num2;
    System.out.println("The result is "+ result);
    
    
case 3:
    System.out.println("Enter two numbers to be multiplied");
    num1=sc.nextInt();
    num2=sc.nextInt();
    result= num1*num2;
    System.out.println("The result is "+ result);
    
case 4:
    System.out.println("Enter numbers to check even or add ");
    num1 =sc.nextInt();
    if (num1%2==0){
         System.out.println(num1 + " is an even number");
    }
    else {
        System.out.println(num1 + " is an odd number");
    }
    break;
case 5:
    System.out.println("Exiting the program...");
    break;
  default:
      System.out.println("Invalid option. Please enter a valid option.");   
    
    
}
}
while(option !=5);
}
}
