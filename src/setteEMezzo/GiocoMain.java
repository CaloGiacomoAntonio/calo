package setteEMezzo;
import java.util.Scanner;

public class GiocoMain {

    public static void main(String[] args) {

        String[] desc = {"Coppe", "Bastoni", "Spade", "Denari"}; // il seme delle carte
        String[] nomi; //i nomi dei giocatori presi da terminale
        String mossa = ""; // mi dice se voglio un altra carta o sto
        String t = ""; // salva i dati presi da terminale
        int partite = 1; // quante partite vuoi fare
        MazzoCarta mazzo = new MazzoCarta(desc, 10); // mazzo con le carte
        Giocatore[] player; // array contente i nomi dei giocatori
        Mazziere mazziere; // il bot che bisogna battere
        int turno = 0; // determina il turno tra i giocatori

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero giocatori: ");
        int giocatori = Integer.parseInt(scanner.nextLine());
        nomi = new String[giocatori];
        scanner.reset(); // resetta lo scanner
        for (int i = 0; i < giocatori; i++) {
            System.out.println("Inserisci nome giocatore " + (i + 1) + " : ");
            scanner.reset();
            nomi[i] = scanner.nextLine();
        }
        System.out.println("Quante partite si vogliono giocare: ");
        partite = Integer.parseInt(scanner.nextLine());
        while (partite > 0) {
            if (mazzo.getQuantitaCarte()<5){
                mazzo = new MazzoCarta(desc, 10);
            }
            mazziere =new Mazziere();
            player = new Giocatore[nomi.length];
            for (int i = 0; i < player.length; i++) {
                player[i] = new Giocatore(nomi[i]);
            }
            for (int i = 0; i < player.length; i++) {
                player[turno].setMano(mazzo.estraiCarta());
                turno++;
            }
            mazziere.setMano(mazzo.estraiCarta());
            turno = 0;

            System.out.println("\n\n");
            for (int i = 0; i < player.length; i++) {
                System.out.println("Tocca a " + player[turno].getNome() + "\n");
                mossa = "";
                while (!mossa.equals("stai") && player[turno].getMano() < 7.5) {
                    System.out.println("La tua mano attuale è: " + player[turno].getMano());
                    System.out.println(player[turno].getNome() + ", fai una mossa: ");
                    mossa = scanner.nextLine();
                    while (!(mossa.equals("carta") || mossa.equals("stai"))) {
                        System.out.println("Mossa non valida, inserisci carta o stai: ");
                        mossa = scanner.nextLine();
                    }
                    if (mossa.equals("carta")) {
                        player[turno].setMano(mazzo.estraiCarta());
                    }
                }
                if (player[turno].getMano() > 7.5) {
                    System.out.println(
                            "Il giocatore " + player[turno].getNome() + " ha sforato il punteggio con " + player[turno].getMano() + "\n");
                } else {
                    System.out.println(
                            "Il giocatore " + player[turno].getNome() + " termina il turno con " + player[turno].getMano() + "\n");
                }
                turno++;
                
                if (turno >= player.length) {
                    turno = 0;
                }
            }
            System.out.println("Tocca a Mazziere" + "\n");
            String mossaMazziere = "";
            while (!mossaMazziere.equals("stai") && mazziere.getMano()< 7.5) {
                System.out.println("La tua mano attuale è: " + mazziere.getMano());
                mossaMazziere = mazziere.decisioneMossa();
                System.out.println("Mossa Mazziere: " + mossaMazziere);
                if (mossaMazziere.equals("carta")) {
                   mazziere.setMano(mazzo.estraiCarta()); 
                }
            }
            if (mazziere.getMano() > 7.5) {
                System.out.println("Il Mazziere ha sforato il punteggio con " + mazziere.getMano() + "\n");
            } else {
                System.out.println("Il Mazziere termina il turno con " + mazziere.getMano() + "\n");
            }

            String s = "Risultato: \n";

        if (mazziere.getMano() > 7.5) {
            for (int i = 0; i < player.length; i++) {
                if (player[i].getMano() <= 7.5) {
                    s += "Vince " + player[i].getNome() + " con il punteggio di " + player[i].getMano() + "\n";
                }
            }
        } else {
            for (int i = 0; i < player.length; i++) {
                if (player[i].getMano() <= 7.5 && player[i].getMano() > mazziere.getMano()) {
                    s += "Vince " + player[i].getNome() + " con il punteggio di " + player[i].getMano() + "\n";
                } else{
                    if (player[i].getMano() == mazziere.getMano()) {
                        s += player[i].getNome() + " con il punteggio di " + player[i].getMano()
                            + " pareggia con il mazziere\n";
                    }
                } 
            }

        }
        if (s== "Risultato: \n" && !(mazziere.getMano() > 7.5)) {
            s = "Il mazziere vince con " + mazziere.getMano() + "\n";
        } else {
            if (s=="Risultato: \n") {
                s = "Nessuno vince\n";
            }
        }
            System.out.println("\n\n" + s);
            System.out.println("\n\n");

            partite--;
        }
        scanner.close();
    }
}