package moracinese;

public class MorraCineseTest {
        
    public static void main(String[] args) {
        MorraCinese gioco = new MorraCinese("PC", "Andrea");

        String round1 = gioco.gioca(2);
        String round2 = gioco.gioca(1);
        String round3 = gioco.gioca(3);
        
        String round4 = gioco.game(3);
        String round5 = gioco.game(2);
        String round6 = gioco.game(1);
        
        System.out.println(round1);
        System.out.println(round2);
        System.out.println(round3);

    Level myVar = Level.CARTA;

    switch(myVar) {
      case CARTA:
        System.out.println("Low level");
        break;
      case FORBICE:
         System.out.println("Medium level");
        break;
      case SASSO:
        System.out.println("High level");
        break;
    }
  }
}


