public class Bambino {
    private  final Piatto piatto;
    private int maxBocconi = 18;

     public Bambino(Piatto piatto){
         this.piatto = piatto;
     }

     public void run (){
         try{
             while(maxBocconi > 0){
                 piatto.consumaBoccone();
                 Thread.sleep(1200);
                 maxBocconi--;
             }
         }catch (InterruptedException e){
             throw new RuntimeException(e);
         }
     }
}
