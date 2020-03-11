package predavanje04;

/**
 * Tri metode, vse (vsaka na svoj način) preštejejo število
 * "prižganih" bitov (enic) v danem številu.
 *
 * Primer: število 42 se v dvojiškem sistemu zapiše kot 101010.
 * Število prižganih bitov v številu 42 je torej 3.
 *
 * @author tomaz
 */
public class Biti {

  // Metoda gleda le zadnji (najmanj pomemben bit) v danem številu. Če je
  // prižgan, poveča števec (stBitov). Nato število x "zašifta" (pomakne
  // za en bit) v desno. Vse skupaj ponavlja, dokler je v x-u še kakšen
  // prižgan bit (to pomeni, dokler je x > 0).
  static int steviloBitov1(int x) {
    int stBitov = 0;

    while (x > 0) {
      if ((x & 1) == 1) // je zadnji bit prizgan?
        stBitov++;
      x = x >> 1;       // premik (shift) bitov v desno
    }

    return stBitov;
  }

  // Metoda  pošteje prižgane bite tako, da za vsak bit pogleda,
  // ali je prižgan, pri tem pa upošteva, da je i-ti bit prižgan,
  // če velja (x & 2^i) == 2^i.
  // Vrednosti 2^i metoda naračuna v zanki tako, da v spremenljivko
  // bit shrani 1, nato pa vrednost te spremenljivke v vsaki iteraciji
  // zanke "zašifta" v levo (množi z 2).
  static int steviloBitov2(int x) {
    int stBitov = 0;

    int bit = 1;
    while (bit > 0) {
      if ((x & bit) == bit)
        stBitov ++;
      bit = bit << 1;
    }
    return stBitov;
  }

  // Metda pošteje število prižganih bitov na enak način kot metoda
  // steviloBitov1, le da namesto (x & 1) == 1 uporabi ekvivalentni
  // pogoj x % 2 == 1, namesto izraza x = x >> 1 pa ekvivalentni
  // izraz x = x / 2;
  // Ker metoda steviloBitv1 uporablja bitne operacije, metoda
  // steviloBitov3 pa ekvivalentne aritmetične operacije, je metoda
  // steviloBitov1 veliko hitrejša!
  static int steviloBitov3(int x) {
    int stBitov = 0;

    while (x > 0) {
      if (x % 2 == 1) // zadnji bit je prizgan
        stBitov++;
      x = x / 2;
    }
    return stBitov;
  }

  public static void main(String[] args) {
    int x = 3243424;
    // stevilo x izpišem v desetiskem in v dvojiskem zapisu (da stevilo bitov lahko
    // prestejem tudi "rocno"). Za pretvorbo v dvojiski sistem uporabim metodo
    // Integer.toString().
    System.out.printf("Stevilo %d(10) = %s(2)\n", x, Integer.toString(x,2));
    System.out.printf("Stevilo prizganih bitov v %d je %d\n", x, steviloBitov1(x));
    System.out.printf("Stevilo prizganih bitov v %d je %d\n", x, steviloBitov2(x));
    System.out.printf("Stevilo prizganih bitov v %d je %d\n", x, steviloBitov3(x));
  }
}
