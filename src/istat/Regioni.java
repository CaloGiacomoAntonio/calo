package istat;

public class Regioni{
    private String regione;
    private double pane;
    private double latte;

    public Regioni(String regione, double pane, double latte) {
        this.regione = regione;
        this.pane = pane;
        this.latte = latte;
    }

    public String getRegione() {
        return regione;
    }

    public double getPane() {
        return pane;
    }

    public double getLatte() {
        return latte;
    }

    public String stampa() {
        return "regione: " + regione + " pane: " + pane + "latte: " + latte + "\n";
    }

}