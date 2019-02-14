
import java.util.Scanner;
public class MLThreading3 {
   public static void main(String[] args) {
        System.out.println("Banking activity started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account number");
        int an = scan.nextInt();
        System.out.println("Enter the password");
      
        int pwd = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking activity completed");
       
   try{
   
   System.out.println("Printing activity started");
        
        for(int i=1; i<=50; ++i){
            System.out.println("ABC");
            Thread.sleep(1000);
            
        }
   }
        
   catch(InterruptedException e){
   }
      System.out.println("Printing activity completed");  
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

