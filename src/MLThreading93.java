class Person extends Thread{
    public  Person(String name){
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
        }
    }
}
public class MLThreading93 {
    public static void main(String[] args){
        System.out.println("Main thread is running");
        Person P = new Person("KUMBAKARNA");
        P.start();
        
        System.out.println("Main thread is dead");
    }
    
}
