import java.util.Random;

public class Papa extends Thread {
    private final Piatto piatto;
    private int maxPro = 20;

    public Papa(Piatto piatto){
        this.piatto = piatto;
    }


    public void run() {
        try{
            while(maxPro > 0){
                piatto.produceBoccone();
                Thread.sleep(1200);
                maxPro--;
            }
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }








}
