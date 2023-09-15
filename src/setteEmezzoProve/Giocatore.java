package setteEmezzoProve;

public class Giocatore {
    private String nome;
    private int partiteVinte;
    private double punteggio;
    
    public Giocatore (String nome){
        this.nome = nome;
        partiteVinte = 0;
        punteggio = 0;
    }
    
    public void setPunteggio(double punteggio){
        this.punteggio = punteggio;
    }
    
    public String getNome(){
        return nome;
    }
    
        public double getPunteggio(){
        return punteggio;
    }
    
    public int getPartiteVinte(){
        return partiteVinte;
    }
    
    public String stampa (){
        return "il nome del giocatore è: "+ nome+ " e ha vinto: " + partiteVinte;
    }
}
