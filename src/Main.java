public class Main {
    public static void main(String[] args) {
        Piatto piatto = new Piatto();
        Bambino bambino = new Bambino(piatto);
        Papa papa = new Papa(piatto);

        papa.start();
        bambino.start();

        try {
            papa.join();
            bambino.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Il pasto è terminato.");
    }
}