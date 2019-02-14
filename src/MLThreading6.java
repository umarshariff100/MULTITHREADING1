
import java.util.Scanner;

class Thrads11 implements Runnable{
    @Override
    public void run(){
        System.out.println("Banking activity started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account number");
        int an = scan.nextInt();
        System.out.println("Enter the password");
      
        int pwd = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking activity completed");
       
    }
}
class Thrads22 implements Runnable{
    @Override
    public void run(){
        try{
   
   System.out.println("Printing activity started");
        
        for(int i=1; i<=10; ++i){
            System.out.println("ABC");
            Thread.sleep(1000);
            
        }
   }
        
   catch(InterruptedException e){
       e.printStackTrace();
   }
      System.out.println("Printing activity completed");
    }
}

class Thrads33 implements Runnable{ 
    @Override
    public void run(){
        try{
       System.out.println("Addition stared");
        int a = 5467;
        int b = 4532;
        int c = a + b;
        System.out.println(c);
        
        System.out.println("Addition ended");
   }
   catch(Exception e){
   }
    }
    
}




public class MLThreading6 {
    public static void main(String[] args){
        Thrads11 t1 = new Thrads11();
        Thrads22 t2 = new Thrads22();
        Thrads33 t3 = new Thrads33();
        
        Thread t11 = new Thread(t1);
        Thread t22 = new Thread(t2);
        Thread t33 = new Thread(t3);
        
        t11.start();
        t22.start();
        t33.start();
    }
}
