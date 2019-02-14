
class Warriors extends Thread{
    
    String resource1 = "Brahmastra";
    String resource2 = "Sarpastra";
    String resource3 = "Pashupastra";

    public Warriors(String name){
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
            synchronized(resource1){
                System.out.println("Rama has accquired" + resource1);
                Thread.sleep(5000);
                synchronized(resource2){
                System.out.println("Rama has accquired" + resource2);
                Thread.sleep(5000);
                synchronized(resource3){
                System.out.println("Rama has accquired" + resource3);
                Thread.sleep(5000);
                }
            }
        }
    }
        catch(InterruptedException e){
        }
    }
}
    
public class MLThreading95 {
    public static void main(String[] args){
        Warriors rm = new Warriors("RAMA");
        Warriors rv = new Warriors("RAVANA");
        rm.start();
        rv.start();
    }
}
    

