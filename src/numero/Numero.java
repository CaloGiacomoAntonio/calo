package numero;

public class Numero {

    private int num;

    public Numero(int num) {
        this.num = num;
    }

    public String somma(int n) {
        String testo;
        double addizione;
        addizione = num + n;
        testo = "la somma e' uguale a: " + addizione;
        return testo;
    }

    public String compareInt(int n) {
        String testo = "i numeri sono uguali";

        if (num > n) {
            testo = "il valore dell'attributo e' maggiore di quello del parametro";
        } else {
            if (num < n) {
                testo = "il valore dell'attributo e' minore di quello del parametro";
            }
        }
        return testo;
    }

    public String pariDispari() {
        boolean stato = false;
        String testo;
        if ((num % 2) == 0) {
            stato = true;
        }
        testo = "lo stato e': " + stato;
        return testo;
    }

    public String isNegativo() {
        boolean stato = false;
        String testo;
        if (num < 0) {
            stato = true;
        }
        testo = "il numero richiesto per vedere se è pari o dispari e'" + stato;
        return testo;
    }

    public String stampa() {
        String s;
        s = "il numero è " + num;
        // scriviamo String. e seleziono String.valueOf(0) in base a COSA MI SERVE CONVERTIRE

        return s;
    }

    public double moltiplicazionePerSomma(int molt) {
        int risult = 0;

        if (num < 0 || molt < 0) {

            if (num < molt) {
                while (num < 0) {
                    risult = risult - molt;
                    num++;
                }
            } else {
                while (molt < 0) {
                    risult = risult - num;
                    molt++;
                }
            }
        } else {
            if (num < molt) {
                while (num > 0) {
                    risult = risult + molt;
                    num--;
                }
            } else {
                while (molt > 0) {
                    risult = risult + num;
                    molt--;
                }
            }

        }
        return risult;
    }

    public String tabellina (){
        
        String t=" ";
        int somma=0;
        int i=0;
        
        while(i<10){
            somma= somma+num;
            t+=" "+somma;
            i++;     
        }
        return t;
    }
    
    private String tabellinaPi(int num,int c){
        int val=0;
        String testoTabellina="";
        int contatore = 1;
        while(contatore<=c){
            val=num*contatore;
            testoTabellina=testoTabellina+" "+val;
            contatore++;
        }
        return testoTabellina;
    }
    
    public String tabellaPitagorica(){
        String testo="";
        int val= num;
        int contatore = 1;
        while (contatore<=num){
            testo+="\n"+tabellinaPi(contatore, val);
            contatore++;
        }
        return testo;
    }
    
    public String sequenzaFibonacci(){
        String testo="";
        int a1=1;
        int a2=1;
        int a3=0;
        int c = num;
        int i = 1;
        while(c>0){
            switch(i){
                case 1:
                    a1=a2+a3;
                    testo+="\n"+a1;
                    break;
                case 2:
                    a2=a1+a3;
                    testo+="\n"+a2;
                    break;
                case 3:
                    a3=a2+a1;
                    testo+="\n"+a3;
                    i=0;
                    break;
            }
            c--;
            i++;
        }
        return testo;
    }
    
    public String binario (){
        int resto;
        int cont=num;
        String testo="";
        while (cont>0){
            resto=cont%2;
            testo = resto + testo;
            cont=cont/2;
        }
    return testo;
    }
    
    public String esadecimale2(){
        String esa="";
        String testo="";
        String bin= binario();
        int parteI=bin.length();
        int parteF=bin.length()-4;
        while (parteF>=0){
            testo =bin.substring(parteF, parteI);
            esa=convExa2(testo)+esa;
            parteI-=4;
            parteF-=4;
        }
        return esa;
    }
    
    private int convExa2(String testo){
        int numero=0;
        int contatore=0;
        int i=4;
        int valore =0;
        int somma=0;
        
        while(contatore<4){
            valore=testo.charAt(contatore);
            numero =(int) (Math.pow(2, i)); 
            numero = numero * valore;
            somma+=numero;
            contatore++;
            i--;
            numero=0;
        }
        return somma;
        
    }
    
    
    
    
    public String esadecimale(){
        String exa="";
        String bina= binario();
        int parteI=bina.length();
        String testo=" ";
        
        while (parteI%4 !=0 ){
            bina="0"+bina;
            parteI=bina.length();
        } 
        
        int parteF=bina.length()-4;
        
        while (parteF>=0){
            testo =bina.substring(parteF, parteI);
            exa= convExa(testo)+exa;
            parteI-=4;
            parteF-=4;
        }
        return exa;
    }

    public char convExa (String testo){
        
        char numero = ' ';
        switch(testo){
            case "0001":
                numero='1';
                break;
            case "0010":
                numero='2';
                break;
            case "0011":
                numero='3';
                break;
            case "0100":
                numero='4';
                break;
            case "0101":
                numero='5';
                break;
            case "0110":
                numero='6';
                break;
            case "0111":
                numero='7';
                break;
            case "1000":
                numero='8';
                break;
            case "1001":
                numero='9';
                break;
            case "1010":
                numero='A';
                break;
            case "1011":
                numero='B';
                break;
            case "1100":
                numero='C';
                break;
            case "1101":
                numero='D';
                break;
            case "1110":
                numero='E';
                break;
            case "1111":
                numero='F';
                break;
            default: 
                numero='0';
        }
        return numero;
    }
    
    
    
    
     public String basex (int base){
        int resto;
        int cont=num;
        String testo=" ";
    
        while (cont>0){
            resto=cont%base;
            testo = conv(resto)+testo;
            cont=cont/base;
        }
    return testo;
    }
    
    private String conv(int resto){
        
        String numero=""+resto;
        switch(numero){
            case "10":
                numero="A";
                break;
            case "11":
                numero="B";
                break;
            case "12":
                numero="C";
                break;
            case "13":
                numero="D";
                break;
            case "14":
                numero="E";
                break;
            case "15":
                numero="F";
                break;
            default: 
                numero=""+resto;
        }
        return numero;
    }

    
    public String sommaBinaria(String addendoBinario) {
        String sommaBinaria = "";
        String nBinario = binario();
        int riporto = 0;
        int contatore = Integer.max(addendoBinario.length(), nBinario.length());
        addendoBinario = aggiungiZeri(addendoBinario, contatore);
        nBinario = aggiungiZeri(nBinario, contatore);
        contatore--;
        while (contatore >= 0) {
            int bin2 = Character.hashCode(nBinario.charAt(contatore));
            int bin1 = Character.hashCode(addendoBinario.charAt(contatore));


            sommaBinaria = (bin1 ^ bin2 ^ riporto) + sommaBinaria;


            if ((bin1 & bin2) == 49) {
                riporto = 1;
            } else {
                riporto = 0;
            }
            contatore--;
        }


        if (riporto == 1){
            sommaBinaria = 1 + sommaBinaria;
        }
        return sommaBinaria;
    }


    private String aggiungiZeri(String binario, int contatore) {
        while (binario.length() != contatore){
            binario = 0 + binario;
        }
        return binario;
    }



}
