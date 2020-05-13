package predavanje12;

import java.util.*;

/**
 * @author tomaz
 **/
public class TestDrzave {
  public static void main(String[] args) {
    // drzave preberem v slovar
    HashMap<String, Drzava> drzave = Drzave.preberiDrzave("viri/drzave.txt");

    // ce rezultat branja vsebuje kakšno državo ...
    if (!drzave.isEmpty()) {

      // ... drzave uredim
      ArrayList<String> kratice = new ArrayList<>(drzave.keySet());
      // primerjalnik kratic (primerjam stevilo prebivalcev)
      Collections.sort(kratice, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
          return drzave.get(o1).getSteviloPrebivalcev() - drzave.get(o2).getSteviloPrebivalcev();
        }
      });

      // izpis v urejenem vrstnem redu
      for(String kratica : kratice) {
        System.out.println(drzave.get(kratica));
      }


    }
  }
}
