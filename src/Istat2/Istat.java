package Istat2;
import istat.*;

public class Istat {
    private Regioni[] regioni;
    
    public Istat(String[] regioni, String[] prodotti, double[][] costi) {
        this.regioni = new Regioni[regioni.length];
        for (int iReg = 0; iReg <= regioni.length - 1; iReg++) {
            double[] cost = toMonoArray(costi,iReg);
            this.regioni[iReg]=new Regioni(regioni[iReg],prodotti,cost);
        }
    }
    
    private double[] toMonoArray(double[][] matrice,int colona){
        double[] risult=new double[matrice.length];
        for(int i=0;i<matrice.length;i++){
            risult[i]=matrice[i][colona];
        }
        return risult;
    }
    
    public String stampa(){
        String risult="";
        for(int i=0;i<regioni.length;i++){
            risult+="regione["+i+"]:"+regioni[i].stampa()+"\n";
        }
        return risult;
    }
    
    public String maxBeneRegione(int indice){
        return regioni[indice].beneMax();
    }
    
    public String costoMaxBene (String prodotto){
        double costo = 0;
        int pos = 0;
        
        for (int i = 0; i<regioni.length;i++){
            if (costo < regioni[i].getProdotto(prodotto)){
                costo = regioni[i].getProdotto(prodotto);
                pos = i;
            }
        }
        return "il "+prodotto+" più alto è nella regione " +regioni[pos].getNome()+" che è: "+ costo;
    }
    
    public String costoVitaMax(){
        double costo = 0;
        int pos = 0;
        for (int i=0;i<regioni.length;i++){
            if (costo < regioni[i].costoVita()){
                costo = regioni[i].costoVita();
                pos = i;
            }
        }
        return "la regione" +regioni[pos].getNome()+" ha il prezo di vita maggiore che è: "+ costo;
    }
}
