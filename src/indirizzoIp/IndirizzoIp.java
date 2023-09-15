package indirizzoIp;

import java.util.regex.Pattern;
import java.lang.*;
public class IndirizzoIp {

    private NumeroBinario[] ip;
    private NumeroBinario[] sottoMaschera;

    public IndirizzoIp(String ip, String sottoMaschera) {
        String[] c = ip.split(Pattern.quote("."));
        this.ip = new NumeroBinario[c.length];
        for (int i = 0; i <= this.ip.length-1; i++) {
            this.ip[i] = new NumeroBinario(toBinario(c[i]));
        }

        c = sottoMaschera.split(Pattern.quote("."));
        this.sottoMaschera = new NumeroBinario[c.length];
        for (int i = 0; i <= this.sottoMaschera.length-1 ; i++) {
            this.sottoMaschera[i] = new NumeroBinario(toBinario(c[i]));
        }
    }

    public String stampa() {
        String t = "ip :";
        for (int i = 0; i <= this.ip.length-1; i++) {
            t += "Indirizzo Ip: "+ip[i].stampa() + ".";
        } 

        t += "\nsottomascera:";
        for (int i = 0; i <= this.sottoMaschera.length-1; i++) {
            t += "sottoMaschera: "+ sottoMaschera[i].stampa() + ".";
        }
        return t;
    }

    public String classe() {
        String risult = "A";
        if (ip[0].digit(0)==1){
            if (ip[0].digit(1)==1){
                risult = "C";
            }else{
                risult = "B";
            }
        }
        return risult;
    }

    private String toBinario(String dec){
        int v = Integer.parseInt(dec);
        String testo = "";
                   while (v > 0) {
                testo = (v % 2) + testo;
                v /= 2;
            }
        testo = aggiungiZeri(testo);
        return testo;
    }
    
    public String broadcast(){
        int j = 0;
        String broad = "";
        String ris = "";
        for (int i = 0; i<=sottoMaschera.length-1; i++){//faccio un for per prendere un puntatore all'interno dell'array che punta un oggeto
            j=0;
            while(j<=sottoMaschera[i].getNumero().length()-1){ //faccio un while per andare ad analizzare ogni singolo dato
                if (sottoMaschera[i].digit(j)==1  ){//contrololo se i bit della sottomaschera sono uguali a 1 
                    if (ip[i].digit(j)!=-1){//controllo la presenza dei bit e se sono presenti ricopio il bit dell'ip 
                        broad = broad + ip[i].digit(j);
                    }else{//altrimenti se la posizione non esiste aggiungo 0 per arrivare agli 8 bit
                        broad = broad + "0";
                    }
                }else{
                    broad = broad + 1;// se è broadcast setto i bit degli host a 1
                }   
                j++; 
            }
            ris+=decimale(broad) +".";
            broad="";
        }
        return ris;
    }
    
    public String rete (){
        int j = 0;
        String ris = "";
        String net = "";
        for (int i = 0; i<=sottoMaschera.length-1; i++){
            j=0;
            while(j<=sottoMaschera[i].getNumero().length()-1){
                if (sottoMaschera[i].digit(j)==1  ){
                    if (ip[i].digit(j)!=-1){
                        net = net + ip[i].digit(j);
                    }else{
                        net = net+ "0";// se il valore è -1 allora devo inserire uno 0 per arrivare agli 8 bit
                    }
                }else{
                    net = net + 0;// se è rete setto il bit degli host a 0
                }                   
                j++; 
            }
            ris+=decimale(net) +".";
            net="";
        }
        return ris;
    }
    
    private String aggiungiZeri(String n) {
        while (n.length() < 8) {
            n = "0" + n;
        }
        return n;
    }
    
    public int decimale(String num) {
        int dimF = num.length();
        int valore = 0;
        for (int i = 0; i < dimF; i++) {
            if (num.charAt(dimF - i - 1) == '1') {
                valore += Math.pow(2, i);
            }
        }
        return valore;
    }
}
