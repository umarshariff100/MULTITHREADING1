
class MSWord extends Thread{
    public MSWord(String name){  //Contructor
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
            
        
        for(int i = 1; i<= 5; ++i){
            System.out.println("SpellChecking..........!");
            Thread.sleep(2500);
        }
    }
        catch(InterruptedException e){
        }
    }
    public void AutoSave(){
        try{
            
        
        for(int i = 1; i<= 5; ++i){
            System.out.println("AutoSaving..........!");
            Thread.sleep(2500);
        }
    }
        catch(InterruptedException e){
        }
    }

    
}

public class MLThreading8 {
    public static void main(String[] args){
       MSWord t1 = new MSWord("TYPE");
       MSWord t2 = new MSWord("SPELL");
       MSWord t3 = new MSWord("SAVE");
       
       t1.start();
       t2.start();
       t3.start();
    }
    
}
