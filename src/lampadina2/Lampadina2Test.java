package lampadina2;

/**
 *
 * @author giacomoantonio.calo
 */
public class Lampadina2Test {

    public static void main(String[] args) {
        Lampadina2 l1 = new Lampadina2("Phillips", "rosso", 24, 22);
        Lampadina2 l2 = new Lampadina2("Phillips", "giallo", 23, 23);
        Lampadina2 l3 = new Lampadina2("Phillips", "verde", 22, 22);

        int nAcc1 = l1.getNAcc();
        int nAcc2 = l2.getNAcc();
        int nAcc3 = l3.getNAcc();

        if (nAcc1 > nAcc2 && nAcc1 > nAcc3) {
            System.out.println("Lampadina 1");
        } else {
            if (nAcc1 == nAcc2 || nAcc1 == nAcc3) {
                System.out.println("Due o tre lampadineuguali");
            } else {
            //n2 > n3 o n3 > n2 o n2 = n3

                if (nAcc2 > nAcc3) {
                    System.out.println("Lampadina 2");
                } else {
                    // n2 <= n3
                    if (nAcc3 > nAcc2) {
                        System.out.println("Lampadina 3");
                    } else {
                        System.out.println("Due lampadineuguali");
                    }
                }
            }
        }

    }
}
