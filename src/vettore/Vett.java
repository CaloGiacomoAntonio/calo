package vettore;

import java.util.Random;    //java.util è un package, util è la cartella principale di java
import java.util.Scanner;

public class Vett {

    private int[] vett;

    public Vett(int[] vett) {
        setVett(vett);
    }

    final public void setVett(int[] vett) {
        this.vett = new int[vett.length];
        for (int i = 0; i < vett.length; i++) { // lo facciamo perchè facciamo il passagio per riferimento
            this.vett[i] = vett[i];
        }
    }

    public int[] getVett() {
        int[] vett = new int[this.vett.length];
        for (int i = 0; i < vett.length; i++) {
            vett[i] = this.vett[i];
        }
        return vett;
    }

    public String stampa() {
        String testo = "";

        for (int i = 0; i < vett.length; i++) {
            testo += this.vett[i] + " ";
        }
        return testo;
    }

    public void caricamentoRandom(int min, int max) {
        Random random = new Random();
        int val = 0;
        for (int i = 0; i < vett.length; i++) {
            do {
                val = random.nextInt(max);
            } while (val < min);
            this.vett[i] = val;
        }
    }

    public boolean scambioElementi(int posOrigin, int posDest) {
        int[] copia = new int[vett.length];
        boolean a = false;
        for (int i = 0; i < copia.length; i++) {
            copia[i] = vett[i];
        }

        if ((posOrigin & posDest) >= 0 || (posOrigin & posDest) <= vett.length) {
            vett[posOrigin] = vett[posDest];
            vett[posDest] = copia[posOrigin];
            a = true;
        }
        return a;
    }

    public boolean modificaElemento(int posizione, int valore) {
        boolean risultato = false;
        if (posizione >= 0 && posizione < this.vett.length) {
            this.vett[posizione] = valore;
            risultato = true;
        }
        return risultato;
    }

    public boolean cancellaElemento(int posizione) {
        boolean risultato = false;
        if (posizione >= 0 && posizione < this.vett.length) {
            int[] vett = new int[this.vett.length - 1];
            for (int i = 0; i < vett.length; i++) {
                if (i < posizione) {
                    vett[i] = this.vett[i];
                } else {
                    vett[i] = this.vett[i + 1];
                }
            }
            this.vett = vett;
            risultato = true;
        }
        return risultato;
    }

    public int cercaElemento(int valore) {
        int elemento = 0;
        for (int i = 0; i < vett.length; i++) {
            if (this.vett[i] == valore) {
                elemento++;
            }
        }
        if (elemento == 0) {
            elemento = -1;
        }
        return elemento;
    }

    public int sommaElementi() {
        int somma = 0;

        for (int i = 0; i < this.vett.length; i++) {
            somma +=this.vett[i];
        }
        return somma;
    }

    public int sommaElementiDaVettore(int[] elementi) {
        int somma = 0;
        for (int i = 0; i < elementi.length; i++) {
            somma += this.vett[i] + elementi[i];
        }
        return somma;
    }
    
       // seconda esercitazione
    private boolean controlloPosizione(int posizione){
        boolean esiste = false;
        if (posizione>=0 && posizione<this.vett.length){
            esiste=true;
        }      
        return esiste;
    }
    
    public boolean aggiungiElemento(int posizione, int valore){
        boolean risultato = false;
        int [] vet = new int [this.vett.length+1];
        int dimL = this.vett.length;
        if (controlloPosizione(posizione)){
            for (int i = dimL;  i >posizione; i--){
                vet[i] = this.vett[i-1];
            }
            for (int i =0; i<posizione; i++){
                vet[i] = this.vett[i];
            }
            vet[posizione]=valore;
            this.vett=vet;
            risultato = true;
        }
        return risultato;
    }
    
    public int numeroElementi(int valore){
        int cont = 0;
        for (int i = 0; i<this.vett.length;i++){
            if (this.vett[i]==valore){
                cont++;
            }
        }
        return cont;
    }
    
    public void unisci (int v[]){
        int [] vet = new int [this.vett.length+v.length];
        for (int i =0; i<vet.length; i++){
            if (i<this.vett.length){
                vet[i]=this.vett[i];
            }else {
                vet[i]=v[i-this.vett.length];
            }
        }
        this.vett=vet;
    }
}

