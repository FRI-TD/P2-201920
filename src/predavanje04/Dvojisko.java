package predavanje04;

/**
 * Razred vsebuje metodo vDvojisko (za pretvorbo stevilo iz desetiskega v dvojiski sistem)
 * in metodo vDesetisko (za pretvorbo stevilo iz dvojiskega v desetiski sistem).
 * V obeh metodah so uporabljeni bitni operatorji, prikazana pa je tudi uporaba operatorja ?
 *
 * @author tomaz
 */
public class Dvojisko {

  // Metoda vDvojisko pretvori število iz desetiškega v dvojiški sistem.
  // Vhod metode je tipa int, izhod pa tipa String.
  // Primer: metoda vDvojisko število 19 pretvori v niz "10011".
  //
  // Metoda v zanki gleda zadnji bit števila; če je ta prižgan - kar preverimo z izrazom ((x & 1) == 1)
  // v rezultat doda enko ("1") sicer ničlo ("0"). V nadaljevanju število po bitih premaknemo v desno
  // (kar storimo z ukazom x = x >> 1). To ponavljamo, dokler je x različen od 0
  static String vDvojisko(int x) {
    String rezultat = "";
    while (x>0) {

      // A ... preverim, če je zadnji bit stevila x prizgan
      if ((x & 1) == 1) {
        rezultat = "1" + rezultat;
      } else {
        rezultat = "0" + rezultat;
      }

      // ... namesto zgornje kode (A) lahko isto naredimo
      // hitreje s pomocjo uporabe operatorja ? takole:
      // rezultat = ((x & 1) == 1 ? "1" : "0") + rezultat;

      // B ... premik po bitih v desno
      x = x >> 1;
    }

    // C
    if (rezultat.isEmpty())
      return "0";
    else
      return rezultat;

    // ... namesto zgornje kode (C) lahko isto naredimo
    // hitreje s pomocjo uporabe operatorja ? takole:
    // return (rezultat.isEmpty() ? "0" : rezultat);
  }

  // Metoda vDesetisko pretvori število iz dvojiškega v desetiški sistem.
  // Vhod metode je tipa String, izhod pa tipa int.
  // Primer: metoda vDesetiško niz "10011" pretvori v število 19.
  //
  // Metoda se "sprehodi" po znakih števila x od zadnjega proti prvemu in
  // v primeru, da je k-ti znak od zadaj enak "1", rezultatu prišteje število 2^k.
  static int vDesetisko(String x) {
    int rezultat = 0;

    // v tej spremenljivki imamo shranjeno vrednost števila 2^k
    int bit = 1;
    for(int i = x.length()-1; i>=0; i--) {
      // če je k-ti znak (šteto od zadaj naprej) enak 1 ...
      if (x.charAt(i) == '1') {
        // ... rezultatu prištej 2^k
        rezultat += bit;
      }
      bit = bit << 1;  // isto kot bit = 2*bit
    }

    return rezultat;
  }

  public static void main(String[] args) {
    int x = 1234321;
    String  xPoDvojisko  = vDvojisko(x);
    int     xPoDesetisko = vDesetisko(xPoDvojisko);

    System.out.println("Izbrano število:" + x);
    System.out.println("... pretvorjeno v dvojiški sistem: " + xPoDvojisko);
    System.out.println("... in nazaj v desetiškega:        " + xPoDesetisko);
  }
}
