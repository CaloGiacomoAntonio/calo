package frase;

import java.util.regex.Pattern;

public class Frase {
    private Parola[] arrayP;
    private int dimL;

    public Frase(String testo) {
        String[] temp = testo.split(Pattern.quote("$"));
        arrayP = new Parola[temp.length];
        for (int i = 0; i < temp.length; i++) {
            arrayP[i] = new Parola(temp[i]);//array contiene un puntatore
        }
        dimL = temp.length;
    }

    public String stampaFrase() {
        String t = "Frase: ";
        for (int i = 0; i < dimL; i++)
            t += arrayP[i].stampa();
        return t;
    }

    public int nParole() {
        return dimL;
    }

    public int nCaratteri() {
        int nChar = 0;
        for (int i = 0; i < dimL; i++) {
            nChar += arrayP[i].nCaratteri();
        }
        return nChar;
    }

    private void shiftDx(int posP, int posA) {
        for (int i = posA; i > posP; i--)
            arrayP[i] = arrayP[i - 1];
    }

    private void shiftSx(int posP, int posA) {
        for (int i = posP; i < posA; i++)
            arrayP[i] = arrayP[i + 1];
    }

    public void spostamento(int posP, int posA) {
        Parola parola = arrayP[posP];
        if (posP < posA) {
            shiftSx(posP, posA);
        } else {
            shiftDx(posA, posP);
        }
        arrayP[posA] = parola;
    }

    public void inserimento(String parola, int indice) {
        if (isPieno()) {
            ingrandisciArray();
        }
        shiftDx(indice, dimL);
        arrayP[indice] = new Parola(parola);
        dimL++;
    }

    private void ingrandisciArray() {
        Parola[] arrayIngrandito = new Parola[arrayP.length + 5];
        for (int i = 0; i < arrayP.length; i++)
            arrayIngrandito[i] = arrayP[i];
        arrayP = arrayIngrandito;
    }

    private boolean isPieno() {
        return dimL == arrayP.length;
    }
    
    public void cancellazione(int indice) {
        shiftSx(indice, dimL);
        dimL--;
    }
}
