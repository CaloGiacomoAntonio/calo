package motorino;
/**
 *
 * @author giacomoantonio.calo
 */
public class Motorino {

    private String colore;
    private int velocità;
    private String marca;
    private String modello;
    private boolean antifurto;

    public Motorino(String colore, int velocità, String marca, String modello, boolean antifurto) {
        this.colore = colore;
        this.velocità = velocità;
        this.marca = marca;
        this.modello = modello;
        this.antifurto = antifurto;
    }

    public void setColore(String colore ){
     this.colore=colore;
    }
    
    public String getColore(){
        return colore;
    }
    
    public void setVelocità(double velcità ){
     this.velocità=velocità;
    }
    
    public double getVelocità(){
        return velocità;
    }
    
    public void setMarca(String marca ){
     this.marca=marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModello(String modello ){
     this.modello=modello;
    }
    
    public String getModello(){
        return modello;
    }
    
    public void setAntifurto(boolean antifurto){
    this.antifurto=antifurto;
    }
    
    public boolean getAntifurto(){
        return antifurto;
    }
    
   
    public void accelera(double v) {
        velocità += v;
    }

    public void decelera(double v) {
        velocità -= v;
    }

    public void frena() {
        velocità = 0;
    }

    public void inserisciAntifurto() {
        antifurto = true;
    }

    public String stampa() {
        String testo;
        testo = "colore " + colore + "velità " + velocità + " marca "
                + marca + " modello " + modello + " antifurto " + antifurto;
        return testo;
    }

}
