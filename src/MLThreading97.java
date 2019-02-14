
import java.util.Scanner;

class Demo100 extends Thread{
    private int count = 0;
    public Demo100(String name){
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
            
            for(int i =1; i<=5; ++i){
                
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
public class MLThreading97 {
    public static void main(String[] args) throws InterruptedException{
        Demo100 pr = new Demo100("PRINT");
        Demo100 ad = new Demo100("ADD");
        pr.start();
        pr.join();
        ad.start();
    }
    
}
