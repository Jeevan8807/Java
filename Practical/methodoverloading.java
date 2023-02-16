package practice;

public class methodoverloading {
    
        static void foo(){
            System.out.println("Good Morning bro!");
        }
    
        static void foo(int a) {
            System.out.println("Good morning " + a +" bro!" );
        }
        static void foo(int a,int b){ // a & b are the parameters
            System.out.println("Good Moring" + a +" bro!" );
            System.out.println("Good Moring" + b +" bro!" );
        }
        static void telljoke(){
            //System.out.println("I invented a new joke");
    
        }
        public static void main(String[] args){
            foo();
            foo(200);
            foo(300,400);// Arguments are actual!
            //telljoke();
    
    
            }
        }
    
    

