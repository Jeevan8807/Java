 class A{
        public int a;
        public int jeevan(){ //1st method
            return 4;
        }

        public void meth2(){ //2nd method
            System.out.println("I am method 2 of class A");
        }
    }

    class B extends A{
            @Override
            public void meth2(){ //3rd method
            System.out.println("I am method 2 of  class B");
            }
            public void meth3(){ //3rd method
                System.out.println("I am method 3 of  class B");
    
    }
}
public class methodoverriding {
public static void main(String[]args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();



    


        
    }
    }

    

