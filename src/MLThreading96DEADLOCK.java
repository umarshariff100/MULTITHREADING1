
class Warriors1 extends Thread{
    
    String resource1 = "Brahmastra";  /*DEAD LOCK*/
    String resource2 = "Sarpastra";
    String resource3 = "Pashupastra";

    public Warriors1(String name){
        super(name);
    }
    @Override
    public void run(){
        
        if(Thread.currentThread().getName().equals("RAMA")){
            
            ramaAccResource();
        }
        else{
            ravanaAccResource();
        }
    }
    
    
    
    public void ravanaAccResource(){
        try{
            synchronized(resource1){
                System.out.println("Ravana has accquired" + resource1);
                Thread.sleep(5000);
                synchronized(resource2){
                System.out.println("Ravana has accquired" + resource2);
                Thread.sleep(5000);
                synchronized(resource3){
                System.out.println("Ravana has accquired" + resource3);
                Thread.sleep(5000);
                }
            }
        }
    }
        catch(InterruptedException e){
        }
    
}

    private void ramaAccResource() {
        
        try{
            synchronized(resource3){
                System.out.println("Rama has accquired" + resource3);
                Thread.sleep(5000);
                synchronized(resource2){
                System.out.println("Rama has accquired" + resource2);
                Thread.sleep(5000);
                synchronized(resource1){
                System.out.println("Rama has accquired" + resource1);
                Thread.sleep(5000);
                }
            }
        }
    }
        catch(InterruptedException e){
        }
    }
}
    
public class MLThreading96DEADLOCK {
    public static void main(String[] args){
        Warriors1 rm = new Warriors1("RAMA");
        Warriors1 rv;
        rv = new Warriors1("RAVANA");
        rm.start();
        rv.start();
    }
}
    



