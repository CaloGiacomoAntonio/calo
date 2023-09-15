package prodotto;

public class ProdottoTest {

    public static void main(String[] args) {
        Prodotto a1 = new Prodotto (100.0, 22.0, 8.0, 2.0, "pasta", "9788897192000");
        
        System.out.println(a1.controlloCodice());
    }    
}
