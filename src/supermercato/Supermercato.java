package supermercato;

public class Supermercato {
    private Prodotto[] prodotti;
    
    public Supermercato (Prodotto[] prodotti){
        Prodotto[] copiaProdotti = new Prodotto[prodotti.length];
        for (int i = 0; i<prodotti.length; i++){
            copiaProdotti[i]=prodotti[i];
        }
        this.prodotti = copiaProdotti;
    }
    
    public String prezzoAlto (){
        double max =0;
        int cont = 0;
        for (int i = 0; i<prodotti.length; i++){
            if (max< prodotti[i].prezzoIvato()){
                max=prodotti[i].prezzoIvato();
                cont=i;
            }
        }
        
        return "il prodotto con il prezzo ivato piu' alto e': "+ prodotti[cont].getDesc()+" con il prezzo di: "+max;
    }
    
    public String valoreMerce(){
        double somma =0;
        for (int i = 0; i<prodotti.length; i++){
                somma+= prodotti[i].getPrezzo();
            }
        return "il valore delle merci e': " + somma;
    }
    
    public String pesoMinore (){
        double min = prodotti[0].getPeso();
        int cont = 0;
        for (int i = 0; i<prodotti.length; i++){
            if (min> prodotti[i].getPeso()){
                min=prodotti[i].getPeso();
                cont=i;
            }
        }
        
        return "il prodotto con il peso piu' basso e': "+ prodotti[cont].getDesc()+" con il preso di: "+min;
    }
    
    public String merciSopraMedia (double media){
        String t ="non ci sono prezzi sopra la media";
        for (int i = 0; i<prodotti.length; i++){
            if (media < prodotti[i].getPrezzo()){
                t="";
                t += "prodotto con prezzo maggiore alla media: "+ prodotti[i].getDesc();
            }
        }
        return t;
    }
}
