package frase;

public class FraseTest {
    public static void main(String[] args) {
        String testo="prova $scrittura $di $un $testo.$";
        Frase a = new Frase (testo);
        
        System.out.println(a.stampaFrase());
        
        a.inserimento("testo ", 0);
        System.out.println(a.stampaFrase());
        
        a.nCaratteri();
        System.out.println(a.nCaratteri());
        
        a.nParole();
        System.out.println(a.nParole());
        
        a.spostamento(1, 0);
        System.out.println(a.stampaFrase());
         
        a.cancellazione(0);
        System.out.println(a.stampaFrase());

    }
}
