package Istat2;

import istat.*;

public class IstatTest {
    public static void main(String[] args) {
        
        String[] regioni2={"Abruzzo","Basilicata","Calabria","Campania","Emilia Romagna","Friuli Venezia Giulia","Lazio","Liguria","Lombardia","Marche","Molise","Piemonte","Puglia","Sardegna","Sicilia","Toscana","Trentino-Alto Adige","Umbria","Valle d'Aosta","Veneto"};
        double[][] costo={
            {1330.4 , 19.2 , 15.7 , 11.2 , 17.5 , 13.1 , 18.0 , 12.8 , 16.7 , 14.6 , 18.8 , 15.5 , 14.7 , 13.0 , 13.7 , 17.4 , 11.9 , 10.9 , 17.8 , 20.1},
            {16.7 , 14.6 , 18.8 , 15.5 , 14.7 , 13.0 , 13.7 , 11.2 , 17.5 , 13.1 , 18.0 , 12.8 , 17.4 , 11.9 , 10.9 , 17.8 , 20.1 , 10.4 , 19.2 , 15.7},
            {13.0 , 30.6 , 15.8 , 19.9 , 3.7 , 5.0 , 15.7 , 12.0 , 1.5 , 54.1 , 87.0 , 99.8 , 67.4 , 1.9 , 15.9 , 37.8 , 28.1 , 18.4 , 89.2 , 55.7}
        };
        String[] nome={"pane","latte","carne"};
        
        Istat testIstat=new Istat(regioni2,nome,costo);
        System.out.println(testIstat.costoVitaMax());
    }
}
