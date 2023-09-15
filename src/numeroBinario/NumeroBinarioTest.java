package numeroBinario;

public class NumeroBinarioTest {

    public static void main(String[] args) {
        NumeroBinario a = new NumeroBinario("11111111");
        System.out.println(a.digit(0));
        System.out.println(a.decimale());
        System.out.println(a.sommaBinario("1"));
        System.out.println(a.sottrazione("1"));
    }
}
