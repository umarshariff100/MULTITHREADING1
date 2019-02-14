class BRoom1 implements Runnable{
    @Override
    synchronized public void run(){    ///synchronized Keyword
        try{
            System.out.println(Thread.currentThread().getName() + " Has entered the Bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " Is Using the Bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " Has exited the Bathroom");
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
        }
    }
}
public class MLThreading92 {
    public static void main(String[] args){
        BRoom1 b1 = new BRoom1();
        BRoom1 b2 = new BRoom1();
        BRoom1 b3 = new BRoom1();
        
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        Thread t3 = new Thread(b1);
        
        
        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("OTHER");
        
        
        t1.start();
        t2.start();
        t3.start();
    }
}
