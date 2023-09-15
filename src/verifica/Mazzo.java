package verifica;
import java.util.Random;
// ho aggiunto un metodo private per rimuovere per eliminare codice dupilcato

public class Mazzo {
    private Carta[] carte;
    
    public Mazzo (String[]semi, int[] carte, int nCarte){
        int carteSeme = nCarte/4;
        Carta[][]matrice = new Carta [4][carteSeme];
        for (int r = 0; r<semi.length; r++){
            for (int c = 0; c<carteSeme; c++){
                matrice[r][c]=new Carta (semi[r],carte[c]);
            }
        }
        
        
        Random r  = new Random();
        Carta[]copia = new Carta [nCarte];
        boolean[][] controllo = new boolean [4][carteSeme];
        for (int ri = 0; ri<semi.length; ri++){
            for (int co = 0; co<carteSeme; co++){
                controllo[ri][co]=false;
            }
        }
        int i = 0;
        while (i<nCarte){
            int a = r.nextInt(carteSeme);
            int b = r.nextInt(4);
            if (controllo[b][a]==false){
                copia[i]=matrice[b][a];
                controllo[b][a]=true;
                i++;
            }
        }
        this.carte = copia;
    }
    
    public int cartePresenti(){
        return carte.length;
    }
    
    public String giraCarta(){
        return "la prima carta e' uguale a: "+carte[0].stampa();
    }
    
    public void eliminaCarta(){
        carte = togliCarta(0);
    }
    
    public void estraiCarta(int pos){
        carte = togliCarta(pos);
    }
    
    private Carta[] togliCarta (int pos){
        Carta [] copia= new Carta[carte.length-1];
        for(int i = 0; i<copia.length; i++){
            if (i<pos){
               copia[i]=carte[i]; 
            }else{
               copia[i]=carte[i+1]; 
            }
        }
        return copia;
    }
    public String stampaMazzo(){
        String risult = "";
        for (int i = 0; i<carte.length; i++){
            risult += carte[i].stampa()+"\n";
        }
        return risult;
    }
    
    public String cercaCarta(int num){
        int i = 0;
        int pos =0;
        while (i<carte.length){
            if (carte[i].getNum()==num){
                pos = i;
                i = carte.length;
            }
            i++;
        }
        return "il primo numero: "+num+" si trova nella posizione: "+pos;
    }
}
