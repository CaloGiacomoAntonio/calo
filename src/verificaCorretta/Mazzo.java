package verificaCorretta;

import java.util.Random;


public class Mazzo {

    private Carta[] carte;
    private int dimL;

    public Mazzo(String[] seme, int nCarte) {
        carte = new Carta[nCarte * seme.length];
        caricaCarte(seme.length, nCarte, seme);
    }

    private void caricaCarte(int nSemi, int nCarte, String[] desc) {
        boolean[][] controllo = new boolean[nSemi][nCarte];
        Random rand = new Random();
        int seme = 0;
        int carta = 0;
        while (dimL < nCarte * nSemi) {
            carta = 1 + rand.nextInt(nCarte);
            seme = rand.nextInt(nSemi);
            if (controllo[seme][carta - 1]==false) {
                controllo[seme][carta - 1] = true;
                carte[dimL] = new Carta(desc[seme], carta);
                dimL++;
            }
        }
    }

    public int cartePresenti() {
        return dimL;
    }

    public String giraCarta() {
        return vedi(0);
    }

    public String eliminaCarta() {
        String testo = vedi(0);
        shiftSn(0);
        dimL--;
        return testo;
    }

    private void shiftSn(int partenza) {
        for (int i = partenza; i < carte.length - 1; i++) {
            carte[i] = carte[i + 1];
        }
    }

    public String estraiCarta(int i) {
        String testo = vedi(i);
        shiftSn(i);
        dimL--;
        return testo;
    }

    private String vedi(int indice) {
        return carte[indice].getCarta();
    }

    public String stampaMazzo() {
        String testo = "";
        for (int i = 0; i < dimL; i++) {
            testo += vedi(i) + "\n";
        }
        return testo;
    }

    public String cercaCarta(int carta) {
        int i = 0;
        while (carte[i].getValore() != carta) {
            i++;
        }
        return vedi(i);

    }

    public void mescolaCarta() {
        Random rand = new Random();
        int indice = 0;
        for (int i = 0; i < dimL; i++) {
            indice = rand.nextInt(dimL);
            Carta memCarta = carte[indice];
            int in = (indice + 10) % dimL;
            carte[indice] = carte[in];
            carte[in] = memCarta;
        }
    }


    public String stampa() {
        String testo = "";
        testo += "MazzoCarte: dimL=" + dimL;
        for (int i = 0; i < carte.length; i++) {
            testo += "\n" + carte[i].toString();
        }
        return testo;
    }
}
