package numeroBinario;
public class NumeroBinario {

    private String num;

    public NumeroBinario(String n) {
        this.num = n;
    }

    public String getNumero() {
        return num;
    }

    public int digit(int posizione) {
        int risultato = -1; // assegno il valore -1 perché la posizione richiesta non esiste
        if (posizione >= 0 && posizione < num.length()) {
            if (num.charAt(posizione) == '1') {
                risultato = 1;
            } else {
                risultato = 0;
            }
        }
        return risultato;
    }

    public int decimale() {
        int dimF = num.length();
        int valore = 0;
        for (int i = 0; i < dimF; i++) {
            if (num.charAt(dimF - i - 1) == '1') {
                valore += Math.pow(2, i);
            }
        }
        return valore;
    }

    public String sommaBinario(String numero) {
        String risultato = "";
        int rip=0;
        while(num.length()>numero.length()){
            numero="0"+numero;
        }
        
        for (int i = num.length()-1; i>=0; i--){
            int val1 = (int) num.charAt(i);
            int val2 = (int) numero.charAt(i);
            val1 = val1- 48;
            val2 = val2 - 48;

            int somma = val1+val2+rip;
            
            if (somma>1){
                rip = 1;
                somma-=2;
            }else{
                rip = 0;
            }
            risultato = somma+risultato;
        }
        int cont=0;
        for (int j = risultato.length()-1; j>=0; j--){
            int val = risultato.charAt(j);
            val=val-48;
            if (val == 0){
                cont++;
                }
        }
        if (cont == risultato.length()){
            risultato = rip+risultato;
        }
        return risultato;
    }

    public String sottrazione(String valore) {
        int i = 0;
        int rip = 0;
        String risultato = "";
        while (num.length() > valore.length()) {
            valore = "0" + valore;
            i++;
        }

        for (int a = valore.length() - 1; a >= 0; a--) {
            int v1 = Character.getNumericValue(num.charAt(a));
            int v2 = Character.getNumericValue(valore.charAt(a));
            int sott = v1 - v2 - rip;
            rip = 0;
            if (sott <0) {
                rip = 1;
                sott+=2;                
            }
            risultato = sott + risultato;
        }
        return risultato;
    }

    public String stampa() {
        return "num: " + decimale();
    }
}