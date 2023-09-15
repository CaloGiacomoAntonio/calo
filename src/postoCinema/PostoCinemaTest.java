package postoCinema;

public class PostoCinemaTest {

    public static void main(String[] args) {
        PostoCinema a1 = new PostoCinema(10,5);
        
        String testo;
        //studente = true
        
        a1.Prezzo(1, true);
        System.out.println(a1.Prezzo(1, true));
        
        a1.Prezzo(2, true);
        System.out.println(a1.Prezzo(2, true));
        
        a1.Prezzo(3, true);
        System.out.println(a1.Prezzo(3, true));
        
        a1.Prezzo(4, true);
        System.out.println(a1.Prezzo(4, true));
        
        a1.Prezzo(5, true);
        System.out.println(a1.Prezzo(5, true));
        
        a1.Prezzo(6, true);
        System.out.println(a1.Prezzo(6, true));
        
        a1.Prezzo(7, true);
        System.out.println(a1.Prezzo(7, true));
        
        testo="\n nel caso l'utente non sia uno studente \n";
        System.out.println(testo);
        //studente = false 
                
        a1.Prezzo(1, false);
        System.out.println(a1.Prezzo(1, false));
        
        a1.Prezzo(2, false);
        System.out.println(a1.Prezzo(2, false));
        
        a1.Prezzo(3, false);
        System.out.println(a1.Prezzo(3, false));
        
        a1.Prezzo(4, false);
        System.out.println(a1.Prezzo(4, false));
        
        a1.Prezzo(5, false);
        System.out.println(a1.Prezzo(5, false));
        
        a1.Prezzo(6, false);
        System.out.println(a1.Prezzo(6, false));
        
        a1.Prezzo(7, false);
        System.out.println(a1.Prezzo(7, false));
        
    }
    
}
