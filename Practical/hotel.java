import java.util.Scanner;
public class hotel {

    
    public static void main(String[]args){
        System.out.println("WELCOME TO OUR RESTAURENT");

        System.out.println("Dessert: ");
        String[] Dessert={"Chocolate Cake", "Brownies & Bar Cookies","Ice Cream","Cheesecake"};
    for(int i =0; i<Dessert.length;i++){
        System.out.println(Dessert[i]);
        
    }

    Scanner sc = new Scanner(System.in);
    System.out.println("Please order your Dessert: ");
    int Input = sc.nextInt();


    switch(Input){
        case 1:
        System.out.println("Your order is booked Thank you for order: " + Dessert[0]);
        break;
        case 2:
        System.out.println("Your order is booked Thank you for order: " + Dessert[1]);
        break;
        case 3:
        System.out.println("Your order is booked Thank you for order: " + Dessert[2]);
        break;
        case 4:
        System.out.println("Your order is booked Thank you for order: " + Dessert[3]);
        break;
    }
    
   
		
    
        
    System.out.println("ColdDrinks: ");
    String[] ColdDrinks={"lemon-lime drinks", "orange soda", "cola", "grape soda", "ginger"};

    for(int j=0; j<ColdDrinks.length;j++){
        System.out.println(ColdDrinks[j]);
       

    }
    Scanner jd = new Scanner(System.in);
    System.out.println("Please order your Drinks:");
     int input = jd.nextInt();

     switch(input){
        case 1:
        System.out.println("Your order is booked Thank you for order: " + ColdDrinks[0]);
        break;
        case 2:
        System.out.println("Your order is booked Thank you for order: " + ColdDrinks[1]);
        break;
        case 3:
        System.out.println("Your order is booked Thank you for order: " + ColdDrinks[2]);
        break;
        case 4:
        System.out.println("Your order is booked Thank you for order: " + ColdDrinks[3]);
        break;
        case 5:
        System.out.println("Your order is booked Thank you for order: " + ColdDrinks[4]);
        break;
     }
     System.out.println("Selected ColdDrinks:");
			
		

     System.out.println("Soups: ");
     String[] Soup={"French onion Soup","Vegetable Soup","Chicken Soup","Tomatto Soup"};

     for(int k =0;k<Soup.length;k++){
    System.out.println(Soup[k]);
    
     }
     Scanner sc1 = new Scanner(System.in);
     System.out.println("Please order your Soups: ");
     int in= sc1.nextInt();

     switch(in){
        case 1:
        System.out.println("Your order is booked Thank you for order: " + Soup[0]);
        break;
        case 2:
        System.out.println("Your order is booked Thank you for order: " + Soup[1]);
        break;
        case 3:
        System.out.println("Your order is booked Thank you for order: " + Soup[2]);
        break;
        case 4:
        System.out.println("Your order is booked Thank you for order: " + Soup[3]);
        break;
        
     }
    


     System.out.println("Rice: ");
     String []rice ={"Biryani","Veg Pulav","Tawa Pulav","Egg Pulav","Jira Rice"};

     for(int l=0;l<rice.length;l++ ){
        System.out.println(rice[l]);
      
     }
     Scanner jd1 = new Scanner(System.in);
     System.out.println("Please order your Rices: ");
     int inn = jd1.nextInt();

     switch(inn){
        case 1:
        System.out.println("Your order is booked Thank you for order: " + rice[0]);
        break;
        case 2:
        System.out.println("Your order is booked Thank you for order: " + rice[1]);
        break;
        case 3:
        System.out.println("Your order is booked Thank you for order: " + rice[2]);
        break;
        case 4:
        System.out.println("Your order is booked Thank you for order: " + rice[3]);
        break;
        case 5:
        System.out.println("Your order is booked Thank you for order: " + rice[4]);
        break; 
     }
     



    }
    String[] Dessert={};
    String[] ColdDrinks={};
    String[] soup={};
    String[] rice={}; 


    
    } 

