package istat;

public class Istat {

    private Regioni[] regione;

    public Istat(String[] regione, double[] pane, double[] latte) {
        this.regione = new Regioni[regione.length];
        for (int i = 0; i <= regione.length - 1; i++) {
            this.regione[i] = new Regioni(regione[i], pane[i], latte[i]);
        }

    }

    public String costoPaneM() {
        int i=paneMax();
        return "Regione: " + regione[i].getRegione() + " ha il costo del pane piu' alto che e' pari a: "+regione[i].getPane() + "\n";
    }
    
    public String costoLatteM() {
        int i=latteMax();
        return "Regione: " + regione[i].getRegione() + " ha il costo del pane piu' alto che e' pari a: "+regione[i].getLatte() + "\n";
    }

    public String stampa() {
        String risult = "";
        for (int i = 0; i <= regione.length - 1; i++) {
            risult = risult + "regione[" + i + "]= " +regione[i].stampa()+"\n ";
        }
        return risult;
    }
    
        public String maxBeni(){
        String testo = "nessuna ragione ha entrambi i prezzi piu' alti";
        int indice = paneMax();
        
        if (indice == latteMax()){
            testo = "regione: "+regione[indice].getRegione()+"ha entrambi i prezzi piu alti\n"+"latte: "+regione[indice].getLatte()+"\n"+"pane: "+regione[indice].getPane();
        }
        return testo;
    }
        
    private int paneMax(){
        int indiceMax = 0;
            
        for (int i = 1; i<= regione.length-1; i++){
            if (regione[indiceMax].getPane() < regione[i].getPane()){
                    indiceMax=i;
            }
        }
        return indiceMax;
    }
    
    private int latteMax(){
        int indiceMax = 0;
            
        for (int i = 1; i<= regione.length-1; i++){
            if (regione[indiceMax].getLatte() < regione[i].getLatte()){
                    indiceMax=i;
            }
        }
        return indiceMax;
    }
}