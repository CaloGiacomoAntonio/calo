package postoCinema;

public class PostoCinema {

    private int posti;
    private int postiP;

    public PostoCinema(int posti, int postiP) {
        this.posti = posti;
        this.postiP = postiP;
    }

    public String Prezzo(int giorno, boolean stato) {
        String testo;
        int costo;

        if (stato == true) {
            if (giorno == 1 || giorno == 2 || giorno == 3) {
                costo = 5;
            } else {
                if (giorno == 5 || giorno == 6 || giorno == 7) {
                    costo = 7;
                } else {
                    costo = 0;
                }
            }
        } else {
            if (giorno == 1 || giorno == 2 || giorno == 3) {
                costo = 7;
            } else {
                if (giorno == 5 || giorno == 6 || giorno == 7) {
                    costo = 10;
                } else {
                    costo = 3;
                }
            }
        }

        testo = "il giorno numero " + giorno + " il prezzo del cinema e' " + costo;
        return testo;
    }

}
