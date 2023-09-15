package setteEmezzoProve;

public class Gioco {
    private Giocatore[] giocatori;
    private int partiteGiocate;
    private Mazzo mazzo;
    
    public Gioco(String[] nomi){
        aggiungiGiocatori(nomi);
        partiteGiocate = 0;
    }
    
    private void aggiungiGiocatori(String[] nomi){
        int lung = nomi.length;
        giocatori = new Giocatore [lung];
        for (int i = 0; i<lung; i++){
            giocatori[i]= new Giocatore(nomi[i]);
        }
    }
    public double punteggioG(int g){
        return giocatori[g].getPunteggio();
    }
    
    public void giocata(int i, int giocat){// chiedo al giocatore se vuole che gli dia unaltra carta
        double punteggio = 0;
        punteggio = mazzo.valCarta(0);
        mazzo.eliminaCarta();
        if (punteggio >= 8){
            punteggio = 0.5;
        }
        
        if (i ==1){
            giocatori[giocat].setPunteggio(punteggio);
        }
    }
    
    public String vincita(int giocat){
        double punteggio = giocatori[giocat].getPunteggio();
        String t = "";
        if(punteggio > 7.5){
            t = "hai sballatto";
        }
        if (punteggio == 7.5){
            t = "hai vinto";
        }else{
            t = "non sei a sette e mezzo";
        }
        
        return t;
    }
}
