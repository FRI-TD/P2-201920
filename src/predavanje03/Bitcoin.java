package predavenje03;

import java.io.File;
import java.util.Scanner;

// Metoda main() prebere datoteko "bitcoin.txt" in izpise datum in vrednost
// najvišjega in najnižjega tečaja valute bitcoin.
public class Bitcoin {

  // Pri delu z datotekami lahko pride do težav (izjem), ki jih moramo obvezno obravnavati. Kako se to
  // naredi, se bomo učili čez nekaj tednov. Do tedaj pa, da se bomo izognemo javinim opozorilom (da
  // moramo izjemo obravnavati) bomo v podpis metode na koncu dodali "throws Exception". Kasneje, ko
  // bomo poznali pravilni način obravnave izjem, pa tega "trika" ne bomo uporabljali, saj je nevaren!
  public static void main(String[] args) throws Exception {
    // za dostop do datotek praviloma uporabljamo relativne poti (torej take,
    // ki se ne začnejo z c:\... ali (v linux okolju) z znakom /).
    Scanner sc = new Scanner(new File("viri/bitcoin.txt"));

    // ko iščemo minimum (maximum) po nekih vrednostih, lahko za začetno vrednost
    // uporabimo kar neskončno (oziroma -neskončno); v javi je za tip double
    // najboljši "približek" neskončnosti imenuje Double.MAX_VALUE (oziroma Double.MIN_VALUE)
    double minTecaj=Double.MAX_VALUE, maxTecaj=Double.MIN_VALUE;
    String minDatum="", maxDatum=""; // datum, ko je bil dosezen min (max) tecaj

    while (sc.hasNext()) {
      String datum  = sc.next();
      String tecaj  = sc.next();

      // ker je tecaj tipa String, ga moramo pred uporabo predtoriti v double
      double tecajD = Double.parseDouble(tecaj);

      if (tecajD < minTecaj) {
        minTecaj = tecajD;
        minDatum = datum;
      }

      if (tecajD > maxTecaj) {
        maxTecaj = tecajD;
        maxDatum = datum;
      }
    }
    sc.close();

    System.out.printf("Minimlani tecaj: %.2f (%s)\n", minTecaj, minDatum);
    System.out.printf("Maximlani tecaj: %.2f (%s)\n", maxTecaj, maxDatum);
  }

}
