package dataCompleta;

public class DataCompletaTest {

    public static void main(String[] args) {
        int an = 1948;
        DataCompleta a = new DataCompleta (29, 2, an);       
        
        System.out.println(a.ieri());
        System.out.println(a.formattaData());
        System.out.println(a.domani());

        System.out.println(a.isBisestile());
        
        System.out.println(a.aggiungiGiorni(100));
        
        System.out.println(a.eliminaGiorni(1095));
    }
}