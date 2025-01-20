import java.util.Random;
public class Papa extends Thread {
    private final Piatto piatto;
    private int maxPro = 20;
    private Random random = new Random();

    public Papa(Piatto piatto){
        this.piatto = piatto;
    }


    public void run() {
        try{
            while(maxPro > 0){
                int casuale = random.nextInt(3000)+1;
                piatto.produceBoccone();
                Thread.sleep(casuale);
                maxPro--;
            }
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }








}
