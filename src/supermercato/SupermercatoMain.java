package supermercato;

public class SupermercatoMain {

    public static void main(String[] args) {
        Prodotto prod1 = new Prodotto(100.0, 22.0, 8.0, 2.0, "pizza", "1234567891235");
        Prodotto prod2 = new Prodotto(10.0, 22.0, 5.0, 2.0, "pasta", "1234567891235");
        Prodotto prod3 = new Prodotto(1.0, 22.0, 3.0, 1.0, "lattuga", "1234567891235");
        
        Prodotto[] prod = new Prodotto [2];
        prod[0]=prod1;
        prod[1]=prod2;
        
        Supermercato a = new Supermercato(prod, "Lidl", "via vittorio veneto");
        
        System.out.println(a.prezzoAlto());
        System.out.println(a.valoreMerce());
        System.out.println(a.pesoMinore());
        System.out.println(a.merciSopraMedia(60));
        
        System.out.println(a.getProdotti());
        a.addProdotto(prod3);
        System.out.println(a.getProdotti());
        a.addProdotto2(14.0, 22.0, 57.0, 25.0, "yogurt", "1234567891235");
        System.out.println(a.getProdotti());
    }
    
}
