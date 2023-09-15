package verificaCorretta;


public class MazzoTest {

    public static void main(String[] args) {
        String[] desc = {"Cuori", "Quadri", "Fiori", "Picche"};
        int nCarte = 13;

        Mazzo mazzo = new Mazzo(desc, nCarte);
       
        System.out.println("Numero di carte presenti nel mazzo: " + mazzo.cartePresenti());
       
        System.out.println("Gira carta: " + mazzo.giraCarta());

        String cartaEliminata = mazzo.eliminaCarta();
        System.out.println("Carta eliminata: " + cartaEliminata);
        System.out.println("Numero di carte presenti nel mazzo dopo eliminazione: " + mazzo.cartePresenti());

        int indiceEstratta = 2;
        String cartaEstratta = mazzo.estraiCarta(indiceEstratta);
        System.out.println("Carta estratta all'indice " + indiceEstratta + ": " + cartaEstratta);
        System.out.println("Numero di carte presenti nel mazzo dopo estrazione: " + mazzo.cartePresenti());

        System.out.println("Carta cercata (valore 7): " + mazzo.cercaCarta(7));

        mazzo.mescolaCarta();
        System.out.println("Mazzo dopo mescolamento:");
        System.out.println(mazzo.stampaMazzo());
    }
    
}

