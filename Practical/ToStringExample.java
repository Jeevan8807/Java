    class My{
        int num;
        String name;

    public My(int num, String name){
        super();
        this.num = num;
        this.name = name;
    }
    public String toString(){
        return num + " " + name;
}

}

    public class ToStringExample{ 
        public static void main(String [] args) {
            My m1 = new My(12, "mango");
            My m2 = new My(13, "watermelon");

            System.out.println(m1);
            System.out.println(m2);




            
        }
        
    }

    
    
    
    
    
    
    
    
    
   
