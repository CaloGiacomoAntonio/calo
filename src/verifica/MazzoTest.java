package verifica;
public class MazzoTest {

    public static void main(String[] args) {
        int nCarte = 40;
        int[] carte = {1,2,3,4,5,6,7,8,9,10};
        String[] semi = {"coppe", "spade", "bastoni", "denari"};
        
        Mazzo ax = new Mazzo(semi, carte, nCarte);
        
        System.out.println(ax.stampaMazzo());
        ax.eliminaCarta();
        System.out.println(ax.cartePresenti());
        System.out.println(ax.stampaMazzo());
        
        System.out.println(ax.giraCarta());
        
        ax.estraiCarta(39);
        System.out.println(ax.stampaMazzo());
        
        System.out.println(ax.cercaCarta(10));
    }
    
}

