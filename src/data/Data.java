package data;
public class Data {
    private int giorno;
    private int mese;
    private int anno;
    private int[] gMesi = new int [12]; 
    
    public Data (int giorno, int mese, int anno) {        
        for (int i =0; i<12; i++){
            switch(i){
                case 1:
                    gMesi[i]=28;
                    break;
                case 3:
                case 5:
                case 8:
                case 10:    
                    gMesi[i]=30;
                    break;
                default:
                    gMesi[i]=31;
            }
        }
        
        this.anno = anno;
        if (isBisestile(anno)){
            gMesi[1]++;
        }
        if (mese > 0 && mese < 13){
            this.mese = mese;
        }
        if (giorno > 0 && giorno <= gMesi[mese-1]){
                this.giorno = giorno;
            }else{
                this.giorno=gMesi[1];// questa assegnazione serve per evitare si casi in cui il giorno inserito non esista quindi in quel caso il valore del giorno sarà pari all'ultimo del mese
            }
        
    }
    
    public static boolean isBisestile(int anno){
        boolean risultato= false;
        if ((anno%400==0) || ((anno%4==0) && (anno%100!=0))){
            risultato = true;
        }
        return risultato;
    }
    
    public String domani() {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
        giorno++;
        if (giorno > gMesi[mese-1]){
            giorno=1;
            mese++;
        }
        if (mese > gMesi.length){
            mese = 1;
            anno++;
        }
        return (giorno+ "/" +mese+"/"+ anno);
    }
    
    public String ieri() {
        int giorno = this.giorno;
        int mese = this.mese;
        int anno = this.anno;
        
        giorno--;
        if (giorno < 1){
            mese--;
            if (mese == 0)
                mese = 12;
            giorno = gMesi[mese-1];   
        }
        if (giorno == 31 && mese == 12)
            anno--;
        return (giorno+ "/" +mese+"/"+ anno);
    }
    
    public String formattaData() {
        String testo="";
        testo= ""+ giorno+ "/" +mese+"/"+ anno;
        return testo;
    }
}