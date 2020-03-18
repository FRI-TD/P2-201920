package predavanje05;

/**
 * @author tomaz
 *
 * Program je namenjen prikazu razlike pri uporabi razreda String in StringBuffer.
 * Dve metodi (pomnozi in pomnoziSB) vrneta enak rezultat, razlika je v tem, da prva
 * za delovanje uporabi String, druga pa StringBuffer.
 * V metodi main() potem klicemo obe metodi in vidimo, da je uporaba
 * prve zelo počasne, druga pa isti rezultat vrne bistveno hitreje
 **/
public class MnozenjeNizov {

  // Metoda vrne niz, ki je sestavljen iz n ponovitev danega niza
  static String pomnozi(String niz, int n) {
    String rezultat = "";
    for (int i = 0; i < n; i++) {
      rezultat += niz;
    }
    return rezultat;
  }

  // Metoda vrne niz, ki je sestavljen iz n ponovitev danega niza
  static String pomnoziSB(String niz, int n) {
    StringBuffer rezultat = new StringBuffer();
    for (int i = 0; i < n; i++) {
      rezultat.append(niz);
    }
    return rezultat.toString();
  }

  public static void main(String[] args) {
    long zacetek, trajanje;
    String zvezdice;

    String r1 = pomnozi  ("*", 10);
    String r2 = pomnoziSB("*", 10);

    System.out.println("Deset zvezdic s prvo  metodo (String)      : " + r1);
    System.out.println("Deset zvezdic z drugo metodo (StringBuffer): " + r2);

    zacetek = System.currentTimeMillis();
    zvezdice = pomnozi  ("*", 200000);
    trajanje = System.currentTimeMillis()- zacetek;
    System.out.println("Čas za 200000 zvezdic s prvo metodo        : " + trajanje );

    zacetek = System.currentTimeMillis();
    zvezdice = pomnoziSB("*", 200000);
    trajanje = System.currentTimeMillis()- zacetek;
    System.out.println("Čas za 200000 zvezdic z drugo metodo       : " + trajanje );

  }
}
