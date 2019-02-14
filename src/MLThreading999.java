class Producer1 extends Thread{
    Queue1 a;
    public Producer1(Queue1 q){
        a = q;
    }
    @Override
    public void run(){
        int i = 1;
        while(true){
            a.put(i++);
        }
    }
}

class Consumer1 extends Thread{
    Queue1 b;
    public Consumer1(Queue1 q){
        b = q;
    }
    @Override
    public void run(){
        
        while(true){
            b.get();
        }
    }
}

class Queue1{
    int x;
    boolean value_is_present_in_x = false;
    
    synchronized public void put(int j){
        try{
            if(value_is_present_in_x == true){
                wait();
            }
             x=j;
        System.out.println("I have put" + j + " into x");
        value_is_present_in_x = true;
        notify();
        }
        catch(InterruptedException e){
        }
       
    }
    
    synchronized public void get(){
        
        try{
            if(value_is_present_in_x == false){
                wait();
            }
             
        System.out.println("i have taken" + x + " from x ");
        value_is_present_in_x = false;
        notify();
        }
        catch(InterruptedException e){
        }
        /*System.out.println("i have taken" + x + " from x ");*/
    }
}
public class MLThreading999 {
    public static void main(String[] args){
        Queue1 q = new Queue1();
        (new Producer1(q)).start();
        (new Consumer1(q)).start();
    }
    
}


