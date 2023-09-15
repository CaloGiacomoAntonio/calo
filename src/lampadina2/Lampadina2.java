
package lampadina2;

public class Lampadina2 {
    
     private String marca;
    private String colore;
    private int maxAcc;
    private int nAcc;
    private boolean stato;

    public Lampadina2 (String marca, String colore, int maxAcc, int nAcc) {
        this.colore = colore;
        this.maxAcc = maxAcc;
        this.nAcc = nAcc;
        this.marca = marca;
        this.stato = false;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String c) {
        colore = c;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        marca = m;
    }
    
    public int getMaxAcc() {
        return maxAcc;
    }
    public int getNAcc() {
        return nAcc;
    }

    public String accendi() {
        String s = "";
        if (stato == false && nAcc < maxAcc) {

            stato = true;
            nAcc += 1;

            if (nAcc == maxAcc - 10 || nAcc > maxAcc - 10) {
                s = "La lampadina è stata accesa. Mancano 10 o meno accensioni al numero massimo di accensioni possibili. ";
            } else if (nAcc == maxAcc){
                s= "La lampadina non può essere accesa perché ha raggiunto il limite massimo di accensioni.";
            } else {
                s = "La lampadina è stata accesa.";
            }
        }
        return s;
    }

    public void spegni() {
        if (stato == true) {
            stato = false;
	    } 
    }
    public String stampa() {
        String s;
        s = "marca: " + marca + " colore: " + colore + " maxAcc: " + maxAcc +
        " nAcc: " + nAcc + "stato: " + stato;
        return s;
    }

}
