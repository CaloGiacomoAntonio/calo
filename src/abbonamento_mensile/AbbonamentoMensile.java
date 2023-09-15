package abbonamento_mensile;

public class AbbonamentoMensile {

    private String meseCorrente;

    public AbbonamentoMensile(String meseCorrente) {
        this.meseCorrente = meseCorrente;
    }

    public void setMeseCorrente(String meseCorente) {
        this.meseCorrente = meseCorrente;
    }

    public String getMeseCorrente() {
        return meseCorrente;
    }

    public String calcolaCosto(String nominativo, boolean stato, int eta) {
        double costo;
        String testo=" ";
        String genere="femmina";
        if (stato == true) {
            genere= "maschio";
            if (eta >= 11 && eta <= 30) {
                costo = 10;
                    } else {
                        costo = 18.50;
                    }
                     } else {
                        if (eta >= 15 && eta <= 30) {
                            costo = 10;
                        } else {
                             costo = 18.50;
                        }
                    }
        testo="\n"+"nominativo "+nominativo+"\n"+"eta "+eta+"\n"+"il mese corrente è "+meseCorrente+"\n"+
                "il genere è "+genere+"\n"+"il costo dell'abbonamento è "+costo+"\n";
        return testo;
    }

    public String stampa() {
        return "Mese Corrente: " + meseCorrente;
    }

}
