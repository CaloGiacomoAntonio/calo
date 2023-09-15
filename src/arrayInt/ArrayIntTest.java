package arrayInt;

public class ArrayIntTest {

    public static void main(String[] args) {
        ArrayInt s = new ArrayInt (5);
        System.out.println(s.stampa());
        
        s.add(7);
        System.out.println(s.stampa());
        
        int[]v ={0,1,2,3,8};
        s.addAll(v);
        System.out.println(s.stampa());
    }
    
}
