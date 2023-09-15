package verifica;

public class Carta {
    private String seme;
    private int num;
    
    public Carta (String seme, int num){
        this.seme=seme;
        this.num=num;
    }
    
    public int getNum(){
        return num;
    }
    
    public String getSeme(){
        return seme;
    }
    
    public String stampa (){
        return num+" "+seme;
    }
}