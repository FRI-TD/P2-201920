package predavanje12;

import java.io.File;
import java.util.*;

/**
 * @author tomaz
 **/
public class Drzave {
  /**
   * Preberem datoteko in vrnem slovar prebranih držav
   */
  static HashMap<String, Drzava> preberiDrzave(String imeDatoteke) {
    HashMap<String, Drzava> result = new HashMap<>();

    // v try blok zaprem vso "problematično kodo" (to je kodo,
    // ki lahko vrže kakšno izjemo)
    try {
      Scanner sc = new Scanner(new File(imeDatoteke));
      while(sc.hasNextLine()) {
        String vrstica = sc.nextLine();
        String [] deli = vrstica.split(":");
        // pozamezna vrstica je oblike kratica:glMesto:stprebivalcev
        Drzava d = new Drzava(deli[0], deli[1], Integer.parseInt(deli[2]));
        result.put(deli[0], d);
      }
      sc.close();
    } catch (Exception e) {
      // v catch bloku pa obravnavam izjemo, ki se je morda zgodila v try bloku
      // (povemo, kaj naj se zgodi, če smo ujeli izjemo e)
      System.out.println("Prislo je do izjeme: " + e.toString());
    }
    return result;
  }
}
