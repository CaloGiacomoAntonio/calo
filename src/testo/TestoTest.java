package testo;

public class TestoTest {

     public static void main(String[] args) {

        String t = "Il cellulare di Elena e' 338-4189961";
        Testo a = new Testo(t);

        System.out.println(a.getMessaggio());
    }    
}