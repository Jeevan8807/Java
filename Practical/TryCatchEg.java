public class TryCatchEg {

    public static void main(String args[]) {
        try{  // may throw exception
            int num = 10/2;
            System.out.println(num);

        }
        catch(Exception e){  //handle exception
            System.out.println("cannot divde by zero");

        }
        
    }
}
