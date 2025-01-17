import java.util.ArrayList;


public class Piatto {
   private ArrayList<Integer>  listaBocconi = new ArrayList<Integer>();

    public synchronized void produceBoccone(){
        Integer i= 1;
        try {
            while(listaBocconi.size()>9) {
                wait();
                System.out.println("il piatto è pieno per produrre altri bocconi");
            }
            listaBocconi.add(i);
            notifyAll();
            System.out.println("Un boccone è stato inserito nel piatto: " +listaBocconi.size() + " all'interno del piatto ");
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public synchronized void consumaBoccone(){
        try{
            while(listaBocconi.isEmpty() ){
                wait();
                System.out.println("Il piatto è vuoto :<");
            }
            listaBocconi.remove(listaBocconi.size()-1);
            notifyAll();
            System.out.println("Sto prendneo un boccone dal piatto");
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
