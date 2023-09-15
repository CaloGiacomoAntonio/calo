package abbonamento_mensile;

public class AbbonamentoMensileTest {

    public static void main(String[] args) {
       
        AbbonamentoMensile c1 = new AbbonamentoMensile("Dicembre");
        
        
        System.out.println(c1.calcolaCosto("Chiara", false, 11));
        System.out.println(c1.calcolaCosto("Gianna La Pier Paola", false, 20));
        System.out.println(c1.calcolaCosto("Belen", false, 69));
        System.out.println(c1.calcolaCosto("Jennifer", false, 104));
       
        System.out.println(c1.calcolaCosto("John", true, 9));
        System.out.println(c1.calcolaCosto("Mastro Lindo", true, 20));
        System.out.println(c1.calcolaCosto("Schettino", true, 69));
        System.out.println(c1.calcolaCosto("Rocco", true, 104));
    }
    
}
