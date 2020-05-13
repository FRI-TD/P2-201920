package predavanje12.dn10;

import java.util.Arrays;
import java.util.Random;

/**
 * @author tomaz
 **/
public class TestDN10 {

  static String getNakljucniNiz(int n) {
    char [] znaki = new char[n];
    Arrays.fill(znaki, '0');

    Random rnd = new Random();
    for (int i = 0; i < n/2 ; i++) {
      znaki[rnd.nextInt(n)] = '1';
    }
    return new String(znaki);
  }

  /**
   * Primerjava dveh rešitev 10. domače naloge.
   * Vidimo, da je naloga DN10b veliko hitrejša.
   */
  public static void main(String[] args) {
    int N = 1000;

    args = new String[]{getNakljucniNiz(N), getNakljucniNiz(N)};

    long zacetekA = System.currentTimeMillis();
    DN10a.main(args);
    long casA = System.currentTimeMillis() - zacetekA;
    System.out.println("Cas: " + casA);

    long zacetekB = System.currentTimeMillis();
    DN10b.main(args);
    long casB = System.currentTimeMillis() - zacetekB;
    System.out.println("Cas: " + casB);
  }
}
