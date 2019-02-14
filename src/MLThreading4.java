
import java.util.Scanner;

class Thrads{
    
    public void Banking(){
        
        
        System.out.println("Banking activity started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account number");
        int an = scan.nextInt();
        System.out.println("Enter the password");
      
        int pwd = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking activity completed");
       
   
    }
    
    
    public void Printing(){
        
        
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
    
    public void Adding(){
        
        try{
       System.out.println("Addition stared");
        int a = 5467;
        int b = 4532;
        Thread.sleep(10000);
        int c = a + b;
        System.out.println(c);
        
        System.out.println("Addition ended");
   }
   catch(Exception e){
       e.printStackTrace();
   }

        
    }
}
public class MLThreading4 {
    public static void main(String[] args){
        Thrads t = new Thrads();
        t.Banking();
        t.Printing();
        t.Adding();
    }
}
