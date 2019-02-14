
class MSWord1 extends Thread{
    public MSWord1(String name){
        super(name);
    }
    
    @Override
    public void run(){

        switch (getName()) {
            case "TYPE":
                Typing();
                break;
            case "SPELL":
                SpellCheck();
                break;
            default:
                AutoSave();
                break;
        }
    }
    
    
    public void Typing(){
        try{
            
        
        for(int i = 1; i<= 5; ++i){
            System.out.println("Typing..........!");
            Thread.sleep(2500);
        }
    }
        catch(InterruptedException e){
        }
    }
    
    public void SpellCheck(){
        try{
            
        
        for(;;){
            System.out.println("SpellChecking..........!");
            Thread.sleep(2500);
        }
    }
        catch(InterruptedException e){
        }
    }
    public void AutoSave(){
        try{
            
        
        for(;;){
            System.out.println("AutoSaving..........!");
            Thread.sleep(2500);
        }
    }
        catch(InterruptedException e){
        }
    }

    
}

public class MLThreading9 {
    public static void main(String[] args){
       MSWord1 t1 = new MSWord1("TYPE");
       MSWord1 t2 = new MSWord1("SPELL");
       MSWord1 t3 = new MSWord1("SAVE");
       
       t1.setPriority(1);
       t2.setPriority(5);
       t3.setPriority(9);
       
       t2.setDaemon(true);
       t3.setDaemon(true);
       
       t1.start();
       t2.start();
       t3.start();
    }
    
}
