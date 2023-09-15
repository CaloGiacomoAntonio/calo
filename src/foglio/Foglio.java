
package foglio;
//import java.util.*;  Si usa per importare librerie esterne
/**
 *
 * @author giacomoantonio.calo
 */
public class Foglio {
     private double altezza; 
    private double base; 
    private String colore;
    

    public  Foglio (double altezza, double base, String colore) {
        this.altezza=altezza; 
        this.base=base; 
        this.colore=colore;
    }

    public void setAltezza(double altezza) {
        this.altezza=altezza;
    }
    public double getAltezza() {
        return altezza; 
    }

    public void setBase(double base) {
        this.base=base;
    }
    public double getBase() {
        return base;
    }

    public void setColore(String colore) {
        this.colore=colore;
    }
    public String getColore() {
        return colore;
    }

    public double calcArea() { 
        double area;
        area=base*altezza;
        return area;                                                                                                                                                 
    }

    public double calcDiagonale() { 
        double diagonale;
        diagonale=Math.sqrt(altezza*altezza+base*base);
        return diagonale;
    }
    
    public void impostaAltezza(double area) { 
    	altezza=area/base;
    }
    public void impostaBase(double area) {
        base=area/altezza;
    }
    public void impostaColore(String c) {
        colore=c;
    }

    public String stampa()  { 
        String testo;
        testo=" Base: " + base + " Altezza: " + altezza + " Colore: "+ colore;
        return testo; 
    }
//DecimalFormatSymbols format_it = new DecimalFormatSymbols(Locale.ITALIAN); per numeri decimali

}
