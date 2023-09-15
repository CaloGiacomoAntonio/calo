package indirizzoIp;
public class indirizzoIpTest {
    public static void main(String[] args) {
        IndirizzoIp a = new IndirizzoIp ("192.168.0.0", "255.255.255.0");
        System.out.println(a.stampa());
        System.out.println(a.classe());
    }
    
}
