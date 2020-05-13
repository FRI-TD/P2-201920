package predavanje12.dn10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Napiši program, ki izpiše najdaljši podniz, ki je vsebovan v vseh argumentih programa.
 * Primer: java DN10 abcabc ababcd
 *   ... izpis: abc
 * Primer: java DN10 CATGACGTCGCGGACAA ATTCTGAAGTTACAGACTT AGGTGGCAGATTAGGAG
 *   ... izpis: AT
 *
 * Namig: Najprej napiši metodo TreeSet<String> getVsiPodnizi(String niz), ki vrne množico
 *        vseh podnizov danega niza (primer: podnizi niza "abcabc" so
 *        a, b, c, ab, bc, ca, abc, bca, cab, abca, bcab, cabc, abcab, bcabc, abcabc);
 *        nato naredi presek vseh množic (uporabi metodo retainAll()) in iz preseka izberi
 *        najdaljšo besedo.
 *
 * @author tomaz
 **/
public class DN10a {

  static Set<String> getVsiPodnizi(String niz) {
    Set<String> result = new HashSet<>();
    for (int i = 1; i <= niz.length() ; i++) {
      for (int j = 0; j < niz.length()-i+1; j++) {
        result.add(niz.substring(j,j+i));
      }
    }
    return result;
  }

  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Podaj vsaj en argument.");
      System.exit(0);
    }

    Set<String> besede = getVsiPodnizi(args[0]);
    for (int i = 1; i < args.length; i++) {
      besede.retainAll(getVsiPodnizi(args[i]));
    }

    String najD = "";
    for(String b : besede)
      if (b.length() > najD.length()) najD = b;
    System.out.println(najD);
  }
}
