package Istat2;
import istat.*;

public class Regioni {
   
    private String nome;
    private double[] costoProd;
    private String[] nomeProd;

    public Regioni(String regione, String[] nome, double[] costo) {
        this.nome = regione;
        nomeProd = new String[nome.length];
        costoProd = new double[nome.length];
        for(int i=0 ; i<nome.length ; i++){
            nomeProd[i]=nome[i].toLowerCase();
            costoProd[i]=costo[i];
        }
    }

    public String getNome() {
        return nome;
    }
    
    public double getProdotto(String nome) {
        nome = nome.toLowerCase();
        double risult=0;
        for(int i=0 ; i<nomeProd.length ; i++){
            if(nome==nomeProd[i]){
                risult=costoProd[i];
                i=nomeProd.length;
            }
        }
        return risult;
    }

    public String stampa() {
        String risult="";
        for(int i=0 ; i<nomeProd.length ; i++){
            risult+=nomeProd[i]+": "+costoProd[i]+"  ";
        }
        return risult;
    }
    
    public String beneMax(){
        double max = 0;
        int prod = 0;
        for (int i = 0; i<costoProd.length; i++){
            if (max<costoProd[i]){
                max = costoProd[i];
                prod = i;
            }
        }
        return nomeProd[prod]+" è il prodotto con il costo più alto nella regione " +nome+" che è: "+ max;
    }
    
    public double costoVita (){
        int somma = 0;
        for (int i =0; i<costoProd.length; i++){
            somma+= costoProd[i];
        }
        return somma;
    }
}