package istat;

public class IstatInClasse {
    private String [] regione;
    private double []pane;
    private double []latte;

    public IstatInClasse(String[] regione, double[] pane, double[] latte) {
        copiaS(regione);
        this.pane = copiaVal(pane);
        this.latte = copiaVal(latte);
    }
    
    private void copiaS (String [] regione){
        this.regione = new String [regione.length];
        for (int i = 0; i < regione.length; i++){
            this.regione[i]= regione[i];
        }
    }

    private double[] copiaVal(double [] array){
        double [] temp = new double [array.length];
        for (int i = 0; i < temp.length; i++){
            temp[i]=array[i];
        }
        return temp;
    }
    
    public String maxLatte(){
        int indice = valoreMax(latte); 
        return "Regione: " + regione[indice] + " ha il costo del latte piu' alto che e' pari a: "+latte[indice] + "\n";
    }
    
    public String maxPane(){
        int indice = valoreMax(pane); 
        return "Regione: " + regione[indice] + " ha il costo del latte piu' alto che e' pari a: "+latte[indice] + "\n";
    }
    
    private int valoreMax(double []array){
        int latteMax = 0;
        String risultato = "";
        for (int i = 0; i<= array.length-1; i++){
            if (latteMax < latte[i]){
                    latteMax =i;
            }
        }
        return latteMax;
    }
    
    public String maxBeni(){
        String testo = "nessuna ragione ha entrambi i prezzi piu' alti";
        int indice = valoreMax(pane);
        
        if (indice == valoreMax(latte)){
            testo = "regione: "+regione[indice]+"ha entrambi i prezzi piu alti\n"+"latte: "+latte+"\n"+"pane"+pane;
        }
        return testo;
    }
        
    
}
