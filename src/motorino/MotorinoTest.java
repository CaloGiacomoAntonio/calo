
package motorino;

/**
 *
 * @author giacomoantonio.calo
 */
public class MotorinoTest {

    public static void main(String[] args) {
       Motorino m = new Motorino ("rosso", 50, "merchede", "faggio", false);
        m.frena();
                
        double velocità = m.getVelocità();
        System.out.println(velocità);
        
        String colore= m.getColore();
        System.out.println(colore);
        
        String marca= m.getMarca();
        System.out.println(marca);
        
        String modello= m.getModello();
        System.out.println(modello);
        
        boolean antifurto= m.getAntifurto();
        System.out.println(antifurto);
    }
}
