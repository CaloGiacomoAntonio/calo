package moracinese;

import java.util.Random;

enum Level {
        CARTA,
        FORBICE,
        SASSO
        }

public class MorraCinese {

    private String g1;
    private String g2;

    public MorraCinese(String g1, String g2) {
        this.g1 = g1;
        this.g2 = g2;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public String gioca(int m2) {

        String t;
        Random rand = new Random();
        int m1 = rand.nextInt(2) + 1;

        if (m2 == 3 && m1 == 2) {
            t = g2 + " vince perché ha giocato carta contro sasso.";
            } else //m2!=3 || m1!=2
                if (m2 == 1 && m1 == 3) {
                    t = g2 + " vince perché ha giocato forbici contro carta.";
                } else //m2!=1 || m1!=3
                    if (m1 == 2 && m2 == 1) {
                        t = g2 + " vince perché ha giocato sasso contro forbici.";
                    } else //m1!=2 || m2!=1
                        if (m1 == 3 && m2 == 2) {
                            t = g1 + " vince perché ha giocato carta contro sasso.";
                        } else //m1!=3 || m2!=2
                            if (m1 == 1 && m2 == 3) {
                                  t = g1 + " vince perché ha giocato forbici contro carta.";
                            } else {
                                t = g1 + " vince perché ha giocato sasso contro forbici.";
                            }
            return t;
    }

    private String decGiocata(int mano) {
        String stampa;

        switch (mano) {
            case 1:
                stampa = "CARTA";
                break;
            case 2:
                stampa = "FORBICE";
                break;
            case 3:
                stampa = "SASSO";
                break;
            default:
                stampa = "giocata non prevista";
        }
        return stampa;
    }

    public String game(int mg) {

        Random random = new Random();
        String esito;
        int mc = random.nextInt(2) + 1;
        // 1 = Carta
        // 2 = Forbice
        // 3 = Sasso

        if (mg == mc) {
            esito = "Pareggio";
        } else {
            if ((mg == 1 && mc == 2) || (mg == 2 && mc == 3) || (mg == 3
                    && mc == 1)) {
                esito = "Vince " + g2;
            } else {
                esito = "Vince " + g1;
            }
        }
        esito += '\n' + g1 + " ha giocato " + decGiocata(mg) + '\n'
                + g2 + "  ha giocato " + decGiocata(mc);
        return esito;
    }

}