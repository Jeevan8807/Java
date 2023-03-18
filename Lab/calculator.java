package lab1;
import java.util.Scanner;

public class calculator {  //create a class 

    public static void main(String[] args) {    //create a main method
        Scanner sc = new Scanner(System.in);      // create a scanner object
        System.out.println("Enter Employee Name:");  // print the statement
        String empName = sc.nextLine();  // read the line & assign in to empName
        System.out.println("Enter Employee Salary:");
        double empSal = sc.nextDouble();     // read the line and assign in to empsal
        sc.nextLine();       //read the line
        System.out.println("Is Indian? (true/false):");  //print the asking question
        boolean isIndian = sc.nextBoolean();   //read the line and assign Indian (true/false)
        sc.close();  //close the sc object
        
        try {      //use try catch method
            double taxAmount = TaxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is " + taxAmount);
        } catch (CountryNotValidException e) {
            System.out.println("Country not valid: " + e.getMessage());
            e.printStackTrace();
        } catch (EmployeeNameInvalidException e) {
            System.out.println("Employee name not valid: " + e.getMessage());
            e.printStackTrace();
        } catch (TaxNotEligibleException e) {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
}
