
package foglio;
/**
 *
 * @author giacomoantonio.calo
 */
public class FoglioTest {

    public static void main(String[] args) {
       Foglio f = new Foglio(5, 2, "rosso");
       
       double area= f.calcArea();
        System.out.println(area);
               
       double diagonale = f.calcDiagonale();
        System.out.println(diagonale);
        
        System.out.println(f.stampa());
        
        f.impostaAltezza(30);
        System.out.println(f.getAltezza());
        
        f.impostaBase(30);
        System.out.println(f.getBase());
        
        f.impostaColore("giallo");
        System.out.println(f.getColore());
        
    /**
      *  Questo è un secondo oggetto
      *Foglio t = new Foglio(6, 5, "giallo");
      *  
      * double area1= t.calcArea();
      * System.out.println(area1);
      *       
      *double diagonale1 = t.calcDiagonale();
      *System.out.println(diagonale1);
      *
      *System.out.println(t.stampa());
      */
        }
}
