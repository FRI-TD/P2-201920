package predavanje05;

/**
 * @author tomaz
 *
 * Demonstracija uporabe bitnih operatorjev za spreminjanje velikosti črk.
 * Za spremembo v velike črke uporabim operator &~, s katerim ugasnem 5. bit,
 * za spremembo v male črke uporabim operator |, s katerim prižgeb 5. bit,
 * za preklop velikost (velike v male, male pa v velike) pa operator xor (^),
 * s katerim "preklopim" 5. bit.
 **/
public class SpremeniVelikost {

  static String vVelikeCrke(String niz) {
    String rezultat = "";
    for (int i = 0; i < niz.length(); i++) {
      char c = niz.charAt(i);
      if (c>='a' && c <='z') {
        c = (char) (c & ~(1 << 5));    // ugasnem 5. bit
      }
      rezultat += c;
    }
    return rezultat;
  }

  static String vMaleCrke(String niz) {
    String rezultat = "";
    for (int i = 0; i < niz.length(); i++) {
      char c = niz.charAt(i);
      if (c>='A' && c <='Z') {
        c = (char) (c | (1 << 5));    // prizgem 5. bit
      }
      rezultat += c;
    }
    return rezultat;
  }

  static String spremeni(String niz) {
    String rezultat = "";
    for (int i = 0; i < niz.length(); i++) {
      char c = niz.charAt(i);
      if ((c>='A' && c <='Z') | (c>='a' && c <='z')) {
        c = (char) (c ^ (1 << 5));    // prizgem 5. bit
      }
      rezultat += c;
    }
    return rezultat;
  }

  public static void main(String[] args) {
    String niz = "Danes Je Lep Dan";
    System.out.println(vVelikeCrke(niz));
    System.out.println(vMaleCrke(niz));
    System.out.println(spremeni(niz));

    System.out.println(niz.toLowerCase());
    System.out.println(niz.toUpperCase());

  }

}
