class BRoom12 implements Runnable{
    @Override
    public void run(){
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
public class MLThreading911 {
    public static void main(String[] args) throws InterruptedException{
        BRoom12 b1 = new BRoom12();
        BRoom12 b2 = new BRoom12();
        BRoom12 b3 = new BRoom12();
        
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        Thread t3 = new Thread(b1);
        
        
        t1.setName("BOY");
        t2.setName("GIRL");
        t3.setName("OTHER");
        
        
        t1.start();
        t1.join();
        
        t2.start();
        t2.join();
        
        t3.start();
        t3.join();
    }
}
