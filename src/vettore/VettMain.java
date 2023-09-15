package vettore;

import java.util.Scanner;
import java.util.Random;

public class VettMain {
    public static void main(String[] args) {
        int[] a=new int[5];
        Vett vett = new Vett(a);
        vett.caricamentoRandom(0, 10);
        
        System.out.println(vett.stampa());
        
        vett.scambioElementi(0, 3);
        System.out.println(vett.stampa());
        
        vett.cancellaElemento(0);
        System.out.println(vett.stampa());
        
        vett.cercaElemento(0);
        System.out.println(vett.cercaElemento(0));
        
        vett.modificaElemento(0, 0);
        System.out.println(vett.stampa());

        vett.sommaElementi();
        System.out.println(vett.sommaElementi());
        
        int[]v ={0,1,2,3};
        vett.sommaElementiDaVettore(v);
        System.out.println(vett.sommaElementiDaVettore(v));
        
        vett.aggiungiElemento(3, 2);
        System.out.println(vett.stampa());
        
        vett.numeroElementi(0);
        System.out.println(vett.numeroElementi(0));
        
        vett.unisci(v);
        System.out.println(vett.stampa());


    }
    
}
