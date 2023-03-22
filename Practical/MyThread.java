package Thread;



public class MyThread extends Thread{

    MyThread(String name)
    {
        super(name);
    }

    public void run(){

        for(int i=0; i<=10; i++){
        System.out.print(i+ " ");
        try{
              Thread.sleep(1000);
        } catch (InterruptedException e){
          e.printStackTrace();
         }
        }
    }


    public static void main(String args[]) {

        Thread t1 = new MyThread("First Therad");
        System.out.println(t1.getName());
        Thread t2 = new MyThread("Second Thread");
        System.out.println(t2.getName());
        t1.start();
        t2.start();
        
        // t1.setName("Jeevan");
        // t2.setName("Shubham");
        
        //System.out.println(Thread.currentThread());
        
    }
    
}
