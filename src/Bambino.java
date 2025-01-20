import java.util.Random;
public class Bambino extends  Thread{
    private  final Piatto piatto;
    private int maxBocconi = 18;
    private Random random = new Random();

     public Bambino(Piatto piatto){

         this.piatto = piatto;
     }

     public void run (){
         try{
             while(maxBocconi > 0){
                 int casuale = random.nextInt(3000)+1;
                 piatto.consumaBoccone();
                 Thread.sleep(casuale);
                 maxBocconi--;
             }
         }catch (InterruptedException e){
             throw new RuntimeException(e);
         }
     }
}
