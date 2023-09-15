package setteEmezzoProve;

public class Carta {

    private String seme;
    private int valore;

    public Carta(String seme, int valore) {
        this.seme = seme;
        this.valore = valore;
    }

    public String getSeme() {
        return seme;
    }

    public int getValore() {
        return valore;
    }

    public String getCarta() {
        return seme + " " + valore;
    }


    public String stampa() {
        return "Carta{" + "seme=" + seme + ", valore=" + valore
                + '}';
    }
}

