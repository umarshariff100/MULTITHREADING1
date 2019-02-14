class Producer extends Thread{
    Queue a;
    public Producer(Queue q){
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

class Consumer extends Thread{
    Queue b;
    public Consumer(Queue q){
        b = q;
    }
    @Override
    public void run(){
        
        while(true){
            b.get();
        }
    }
}

class Queue{
    int x;
    public void put(int j){
        x=j;
        System.out.println("I have put" + j + " into x");
    }
    
    public void get(){
        System.out.println("i have taken" + x + " from x ");
    }
}
public class MLThreading99 {
    public static void main(String[] args){
        Queue q = new Queue();
        (new Producer(q)).start();
        (new Consumer(q)).start();
    }
    
}
