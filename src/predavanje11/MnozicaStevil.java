package predavanje11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author tomaz
 **/
public class MnozicaStevil {

  /**
   * Metoda vrne množico števil, ki delijo n.
   */
  static Set<Integer> delitelji(int n) {
    Set<Integer> del = new HashSet<>();

    for (int i = 1; i <= n/2  ; i++) {
      // ce i deli n, ga dodamo v množico
      if (n % i == 0)
        del.add(i);
    }
    return del;
  }

  public static void main(String[] args) {
    int x = 14;
    int y = 42;

    java.util.Set<Integer> d1 = delitelji(x);
    java.util.Set<Integer> d2 = delitelji(y);

    // "izračun" skupnih deliteljev - najprej dam v množico "skupni" vse delitelje d1 ...
    java.util.Set<Integer> skupni = new java.util.HashSet<>(d1);
    // ... nato naredim presek z množico d2 (skupni = d1 presek d2)
    skupni.retainAll(d2);

    Iterator<Integer> it = skupni.iterator();
    while (it.hasNext())
      System.out.println(it.next());
  }
}
