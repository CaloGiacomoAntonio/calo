package lampadina;

/**
 *
 * @author giacomoantonio.calo
 */
public class Lampadina {
    private String marca;
    private String colore;
    private int    numeroAccensioni;
    private int    numeroVolte;
    private boolean stato;
    
    public Lampadina (String marca, String colore, int numeroAcensioni,
                                                int numeroVolte, boolean stato){
        //il costruttore inizializza i valori degli attributi//
        this.marca = marca;
        this.colore = colore;
        this.numeroAccensioni = numeroAccensioni;
        this.numeroVolte = numeroVolte;
        this.stato = stato;
        
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
