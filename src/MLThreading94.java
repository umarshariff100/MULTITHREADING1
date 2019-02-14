class Person1 extends Thread{
    public  Person1(String name){
        super(name);
    }
    @Override
    public void run(){
        try{
            for(int i = 1; i<=5; ++i){
            System.out.println(Thread.currentThread().getName() + " is sleeping");
            Thread.sleep(5000);
        }
            System.out.println(Thread.currentThread().getName() + " is dead");
        }
        catch(InterruptedException e){
            System.out.println("Kumbakarna has been forcefully sent to dead state");
        }
    }
}
public class MLThreading94 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main thread is running");
        Person1 P;
        P = new Person1("KUMBAKARNA");
        P.start();
        Thread.sleep(10000);
        P.interrupt();
        
       // Thread.sleep(5000);
        
        System.out.println(P.isAlive());
        
        System.out.println("Main thread is dead");
    }
    
}

