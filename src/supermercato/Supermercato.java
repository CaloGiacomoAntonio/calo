package supermercato;

public class Supermercato {

    private Prodotto[] prodotti;
    private int dml;
    private String nome;
    private String indirizzo;

    public Supermercato(Prodotto[] prodotti, String nome, String indirizzo) {
        Prodotto[] copiaProdotti = new Prodotto[prodotti.length];
        for (int i = 0; i < prodotti.length; i++) {
            copiaProdotti[i] = prodotti[i];
        }
        this.prodotti = copiaProdotti;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.dml = this.prodotti.length;
    }

    public String getNome() {
        return nome;
    }

    public String getProdotti() {
        String s = "";
        for (int i = 0; i < prodotti.length; i++) {
            s += " il prodotto in posizione " + i + " e' " + prodotti[i].getDesc() + "\n";
        }
        return s;
    }

    public void addProdotto(Prodotto prodotto) {
        if (dml == prodotti.length) {
               prodotti = resize(prodotti);
        }
        prodotti[dml] = prodotto;
    }

    public void addProdotto2(double prezzo, double iva, double peso, double tara, String descrizione, String codiceBarre) {
        Prodotto[] copiaProdotti = new Prodotto[prodotti.length + 1];
        Prodotto prod = new Prodotto(prezzo, iva, peso, tara, descrizione, codiceBarre);
        for (int i = 0; i < copiaProdotti.length; i++) {
            copiaProdotti[i] = prodotti[i];
            }
        copiaProdotti[dml] = prod;
        prodotti = copiaProdotti;
    }
    
    private Prodotto[] resize(Prodotto[]array){
        Prodotto[] copiaProdotti = new Prodotto[(array.length*20)/100];
        for (int i = 0; i < array.length; i++) {
            copiaProdotti[i] = array[i];
        }
        return copiaProdotti;
    }

    public void removeProdotto1(int pos) {
        Prodotto[] copiaProdotti = new Prodotto[prodotti.length - 1];
        for (int i = 0; i < copiaProdotti.length; i++) {
            if (i >= pos) {
                copiaProdotti[i] = prodotti[i + 1];
            } else {
                copiaProdotti[i] = prodotti[i];
            }
        }
        prodotti = copiaProdotti;
    }

    public String prezzoAlto() {
        double max = 0;
        int cont = 0;
        for (int i = 0; i < prodotti.length; i++) {
            if (max < prodotti[i].prezzoIvato()) {
                max = prodotti[i].prezzoIvato();
                cont = i;
            }
        }

        return "il prodotto con il prezzo ivato piu' alto e': " + prodotti[cont].getDesc() + " con il prezzo di: " + max;
    }

    public String valoreMerce() {
        double somma = 0;
        for (int i = 0; i < prodotti.length; i++) {
            somma += prodotti[i].getPrezzo();
        }
        return "il valore delle merci e': " + somma;
    }

    public String pesoMinore() {
        double min = prodotti[0].getPeso();
        int cont = 0;
        for (int i = 0; i < prodotti.length; i++) {
            if (min > prodotti[i].getPeso()) {
                min = prodotti[i].getPeso();
                cont = i;
            }
        }

        return "il prodotto con il peso piu' basso e': " + prodotti[cont].getDesc() + " con il preso di: " + min;
    }

    public String merciSopraMedia(double media) {
        String t = "non ci sono prezzi sopra la media";
        for (int i = 0; i < prodotti.length; i++) {
            if (media < prodotti[i].getPrezzo()) {
                t = "";
                t += "prodotto con prezzo maggiore alla media: " + prodotti[i].getDesc();
            }
        }
        return t;
    }
}
