package arrayInt;

public class ArrayInt {
    private int [] vet;
    private int dimL;
    
    public ArrayInt (int dimF){
        vet = new int [dimF];
        dimL=0;
    }
    
        public String stampa() {
        String testo = "";

        for (int i = 0; i < vet.length; i++) {
            testo += this.vet[i] + " ";
        }
        return testo;
    }
    
    public boolean add(int add){
        boolean aggiungi = false;
        if (dimL < vet.length){
            vet [dimL] = add;
            dimL++;
            aggiungi = true;
        }     
        return aggiungi;
    }
    
    public boolean addAll(int[]add){
        boolean aggiunta= false;
        // faccio un if per vedere e il cntenuto del nuovo arry posso inserlo direttamete all'interno della variabile o ho bisogno di una copia di essa
        if (vet.length-dimL < add.length){
            int [] vett = new int [add.length+dimL];
            for (int i = 0; i<vett.length; i++){
                if (i<dimL){
                    vett[i]=vet[i];
                } else {
                    vett[i]=add[i-dimL];
                }
            }
            dimL+=add.length;
            vet=vett;
        } else{
            for (int i = 0; i<add.length; i++){
                vet[i+dimL]=add[i];
            }
            dimL +=add.length;
        }
        return aggiunta;
    }
}
