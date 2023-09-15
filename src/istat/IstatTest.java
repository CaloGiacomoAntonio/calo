package istat;

public class IstatTest {

    public static void main(String[] args) {
        double[] latte = {1.23, 3.43, 5.35, 2.56, 9.10, 23.40, 1.00, 2, 4, 10.40, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] pane = {1.23, 3.43, 1.04, 2.56, 9.10, 23.40, 1.00, 2, 4, 10.40, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1.04};
        String[] reg = {"Abruzzo", "Basilicata", "Calabria", "Campania", "Emilia Romagna", "Friuli Venezia Giulia", "Lazio", "Liguria", "Lombardia", "Marche", "Molise", "Piemonte", "Puglia", "Sardegna", "Sicilia", "Toscana", "Trentino Alto Adige", "Umbria", "Val d'Aosta", "Veneto"};

        Istat es = new Istat(reg, pane, latte);
        System.out.println(es.costoPaneM());
        System.out.println(es.costoLatteM());
        System.out.println(es.maxBeni());
        //System.out.println(es.stampa());

    }
}
