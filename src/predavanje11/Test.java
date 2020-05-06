package predavanje11;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

/**
 * @author tomaz
 **/
public class Test {

  static double poisciNiclo(Funkcija f, double x0, int n) {
    for (int i = 0; i < n; i++) {
      x0 = x0 - f.vrednost(x0) / f.odvod(x0);
    }
    return x0;
  }


  static void premakniMisko(MouseListener m) {

  }

  public static void main(String[] args) {
    Kvadratna k = new Kvadratna();

    if (k instanceof ActionListener)
      System.out.println("DA");

    // metodi premakniMisko lahko podamo razred k, saj je ta (tudi) tipa MouseListener
    // (res, saj implementira vse metode razreda MouseListener)
    premakniMisko(k);

    poisciNiclo(k,0,10);

    // anonimni notranji razred izpeljan iz vmesnika Funkcija
    // (podobno smo prejšnjič razred izpeljali iz abstraktnega razreda)
    poisciNiclo(new Funkcija() {
      @Override
      public double vrednost(double x) {
        return 0;
      }

      @Override
      public double odvod(double x) {
        return 0;
      }
    }, 0,10);
  }

}
