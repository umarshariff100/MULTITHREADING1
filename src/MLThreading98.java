
import java.util.Scanner;

class Demo101 extends Thread{
    volatile static private int count = 0; ///Volatile Keyword is used 
    public Demo101(String name){
        super (name);
    }
    
    
  
    @Override
    public void run(){
        if(Thread.currentThread().getName().equals("PRINT")){
            Printing();
        }
        else{
            Adding();
        }
    }
    
    public void Printing(){
        try{
            
            for(int i =1; i<=10; ++i){
                
                System.out.println(++count);
                Thread.sleep(5000);
                
            }
        }
        catch(InterruptedException e){
        }
    }
    
    public void Adding(){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            int temp = scan.nextInt();
            Thread.sleep(5000);
            int ans = temp + count;
            System.out.println(ans);
        }
        catch(InterruptedException e){
        }
    }
}
public class MLThreading98 {
    public static void main(String[] args) throws InterruptedException{
        Demo101 pr = new Demo101("PRINT");
        Demo101 ad = new Demo101("ADD");
        pr.start();
        pr.join();
        ad.start();
    }
    
}


