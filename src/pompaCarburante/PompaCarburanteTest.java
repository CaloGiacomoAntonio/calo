package pompaCarburante;

public class PompaCarburanteTest {
    
    public static void main(String[] args) {
        PompaCarburante a1 = new PompaCarburante ("pompa 1", 1.6, 100.0, 51);
        PompaCarburante a2 = new PompaCarburante ("pompa 2", 1.7, 100.0, 51);
        PompaCarburante a3 = new PompaCarburante ("pompa 3", 1.5, 100.0, 51);
        
        
        System.out.println(a1.carburanteRimasto());
        System.out.println(a1.riempiCisterna());
        System.out.println(a1.valoreCarburanteRimasto());
        System.out.println(a1.stampa());
        System.out.println(a1.importoPieno());
        System.out.println(a1.importo10L());
        
        double min = 0;
        int num = 0;
        if (a1.importo10L()<a2.importo10L()&& a1.importo10L()< a3.importo10L()){
            min =  a1.importo10L();
            num = 1;
        } else {
            if (a2.importo10L()>a3.importo10L()){
                min = a3.importo10L();
                num = 3;
            }else{
                min = a2.importo10L();
                num = 2;
            }
        }
        System.out.println("il benzinaio dove costa dimeno fare 10 litri e' il num: "+ 
                            num+" con un prezzo di: "+ min);
    }
    
}