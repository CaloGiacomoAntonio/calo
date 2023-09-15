package frase;

public class Parola {
    private String testo;
    
    public Parola (String testo){
        this.testo=testo;
    }
    public String stampa(){
        return "Parola-testo: " + testo;
    }
    
    public String getTesto(){
        return testo;
    }
    
    public int nCaratteri(){
        return testo.length();
    }
}
