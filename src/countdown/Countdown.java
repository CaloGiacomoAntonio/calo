
package countdown;

public class Countdown {
  private int num;

  public Countdown(int num) {
    this.num=num;
  }

public String conta() {
    String testo = "";
    int contatore = num;
    while (contatore >= 0) {
      testo += valore(contatore);
      testo += "\n";
      contatore--;
    }
    return testo;
  }

  private String valore(int contatore) {
    String numero = " ";
    switch (contatore) {

    case 10: numero = "  *****\n"+
                      " **  **\n"+
                      "**   **\n"+
                      "     **\n"+
                      "     **\n"+
                      "     **\n"+
                      
                      "\n     ****\n"+
                      "  **     **\n"+
                      " **       **\n"+
                      "***       ***\n"+
                      " **       **\n"+
                      "  **     **\n"+
                      "    ****";
                break;
      case 9: numero = "*********\n"+
                        "**     **\n"+
                        "**     **\n"+
                        "*********\n"+
                        "       **\n"+
                        "       **\n"+
                        "*********\n";
                break;
      case 8: numero = "*********\n"+
                       "**     **\n"+
                       "**     **\n"+
                       "*********\n"+
                       "**     **\n"+
                       "**     **\n"+
                       "*********\n";
                break;

      case 7: numero ="**********\n"+
                      "      ****\n"+
                      "    ****\n"+
                      "  ****\n"+
                      "****\n";
                break;
      case 6: numero ="         ****\n"+
                      "     ****\n"+
                      "  ****    \n"+
                      "****  ****\n"+
                      "  ****    ****\n"+
                      "    ****    ***\n"+
                      "        ****\n";
                break;
      case 5: numero =" ********\n"+
                      "**\n"+
                      "**\n"+
                      "******\n"+
                      "    ****\n"+
                      "     ****\n"+
                      "    ****\n"+
                      "******\n";
                break;
    case 4: numero ="      ***\n"+
                    "    ***\n"+
                    "   ***\n"+
                    "*********\n"+
                    "      **\n"+
                    "      **\n";
                break;

    case 3: numero =
"     ****\n"+
"   *******\n"+
"****     ***\n"+
"**        ***\n"+
"       ****\n"+
"       ****\n"+
"**        ***\n"+
"****     ***\n"+
"   *******\n"+
"      ****\n";
              break; 
    case 2: numero ="    ****\n"+
"   *******\n"+
"****     ***\n"+
"**        ***\n"+
"          ***\n"+
"         ***\n"+
"       ***\n"+
"     *****\n"+
"   **********\n";
              break;
    case 1: numero =  "  *****\n"+
                      " **  **\n"+
                      "**   **\n"+
                      "     **\n"+
                      "     **\n"+
                      "     **\n";
              break;

    case 0: numero = "\n     ****\n"+
                     "  **     **\n"+
                     " **       **\n"+
                     "***       ***\n"+
                     " **       **\n"+
                     "  **     **\n"+
                     "    ****";;
                break;
      default: numero = " " + contatore;
    }
    return numero;
  }
}


