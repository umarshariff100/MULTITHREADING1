class BRoom implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + "Has entered the Bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "Is Using the Bathroom");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + "Has exited the Bathroom");
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
        }
    }
}
public class MLThreading91 {
    public static void main(String[] args){
        BRoom b1 = new BRoom();
        BRoom b2 = new BRoom();
        BRoom b3 = new BRoom();
        
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
