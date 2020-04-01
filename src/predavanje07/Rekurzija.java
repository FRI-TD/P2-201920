package predavanje07;

/**
 * @author tomaz
 **/
public class Rekurzija {

  // iterativni izračun funkcije n!
  static int fakulteta(int n) {
    int r = 1;
    for (int i=2; i<=n; i++)
      r = r*i;
    return r;
  }

  // rekurzivni izračun funkcije n!
  static int fakultetaR(int n) {
    // pozor: ne smemo pozabiti na izstopni pogoj!
    if (n==1)
      return 1;
    else
      return n*fakultetaR(n-1);
  }

  /**
   * Metoda vrne true, če je podani niz palindrom (se z obeg strani enako bere).
   */
  static boolean jePalindrom(String niz) {
    // uporabim StringBuffer in metodo reverse (za obrat niza) ...
    StringBuffer s = new StringBuffer(niz);
    String niz2 = s.reverse().toString();

    // ... nato primerjam oba niza (originalnega in obrnjenega)
    return niz.equals(niz2);
  }

  /**
   * Rekurzivni pogled na palindrom: niz je palindrom, če sta
   * prva in zadnja črka enaki in če je sredinski del niza palindrom.
   *
   */
  static boolean jePalindromR(String niz) {
    // rekurzijo ustavim, ko je niz kratek (ena črka je vedno palindrom)
    if (niz.length() <= 1) return true;

    char prva      = niz.charAt(0);                   // prva črka
    char zadnja    = niz.charAt(niz.length()-1);      // zadnja črka
    String sredina = niz.substring(1,niz.length()-1); // sredinski del niza

    return ((prva==zadnja) && jePalindromR(sredina));
  }


    public static void main(String[] args) {
    //System.out.println(fakultetaR(6));

    String palindrom = "Ti pazi Nado; voda ni za pit.";
    // iz niza odstranim vsa ločila ...
    String palindromX = palindrom.replaceAll("[ .,;?!-]", "");
    // .. in ga "povečam" (vse črke spremenim v velike)
    palindromX = palindromX.toUpperCase();
    System.out.printf("Niz '%s' %s palindrom\n", palindrom,
            jePalindromR(palindromX) ? "JE" : "NI");
  }

}
