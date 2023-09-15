package data;

public class DataTest {

    public static void main(String[] args) {
        int an = 1947;
        Data a = new Data (29, 2, an);       
        
        System.out.println(a.ieri());
        System.out.println(a.formattaData());
        System.out.println(a.domani());
        System.out.println(a.isBisestile(an));
    }
}
