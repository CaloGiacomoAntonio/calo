package testo;

public class Testo {
    private char[] messaggio;
    private String caratteri;

    public Testo(String messaggio) {
        this.caratteri = "bcdfghjklmnpqrstvwyzaeiou0123456789";
        this.messaggio = criptaMessaggio(messaggio);
    }

    public String getMessaggio() {
        String t = "";
        for (int i = 0; i < messaggio.length; i++) {
            t += messaggio[i];
        }
        return t;
    }

    private char[] criptaMessaggio(String messaggio) {
        char[] messaggioChar = messaggio.toCharArray();
        for (int i = 0; i < messaggio.length(); i++) {
            if (Character.isUpperCase(messaggioChar[i])) {
                messaggioChar[i] = Character.toUpperCase(cripta(messaggioChar[i]));
            } else {
                messaggioChar[i] = cripta(messaggioChar[i]);
            }
        }
        return messaggioChar;
    }

    private char cripta(char carattere) {

        if (Character.isAlphabetic(carattere)) {
            carattere = Character.toLowerCase(carattere);

            if (vocali(carattere)) {
                int contatore = 20;
                while (carattere != caratteri.charAt(contatore)) {
                    contatore++;

                }
                if (contatore == 24) {
                    carattere = caratteri.charAt(20);
                } else {
                    carattere = caratteri.charAt(contatore + 1);
                }

            } else {
                int contatore = 0;
                while (carattere != caratteri.charAt(contatore)) {
                    contatore++;

                }
                if (contatore == 19) {
                    carattere = caratteri.charAt(0);
                } else {
                    carattere = caratteri.charAt(contatore + 1);
                }

            }
        } else {

            if (Character.isDigit(carattere)) {
                int contatore = 25;
                while (carattere != caratteri.charAt(contatore)) {
                    contatore++;

                }
                if (contatore == caratteri.length() - 1) {
                    carattere = caratteri.charAt(25);
                } else {
                    carattere = caratteri.charAt(contatore + 1);
                }
            }

        }
        return carattere;
    }
    
    private boolean vocali(char carattere) {
        return (carattere == 97 || carattere == 101 || carattere == 105 || carattere == 111 || carattere == 117);

    }
}
