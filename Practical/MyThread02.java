package Thread;

public class MyThread02 implements Runnable {

    public void run(){
        System.out.println("This is a Thread");
    }

    public static void main(String args[]) {
        MyThread02 t1 = new MyThread02();
        Thread t =new Thread(t1);

        t.start();

        System.out.println(t.currentThread());
        System.out.println(t.getName());
        System.out.println(t.getId());
    }

     
    
}
