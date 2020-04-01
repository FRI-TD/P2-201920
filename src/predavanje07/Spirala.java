package predavanje07;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author tomaz
 **/
public class Spirala {
  /**
   * Izris spirale: s kotom se vrtim (na vsakem koraku se obrnem za
   * izbrani kot) in pri vsakem kotu izračunam oddaljenost od koordinatnega
   * izhodišča (r), nato narišem točko s polarnima koordinatama (kot, r).
   *
   * @param n koliko točk spirale naj narišem
   */
  static void spirala(int n) {
    double kot=0;
    double r=0;

    double pX=-1, pY=0;
    for (int i = 0; i < n; i++) {
      // spremenim kot in r
      kot = kot + (2*Math.PI/360);  // kot na vsakem koraku povečam za 1 stopinjo

      // spremenim oddaljenost(r)
      //r   = 50/Math.sqrt(kot);    // Lituus
      //r   = 10 * Math.sqrt(kot);  // Fermat
      r   = 1.1 * kot;            // Arhimed
      //r     = 100/kot;              // hiperbolična spirala

      double x = r * Math.cos(kot);
      double y = r * Math.sin(kot);

      if (pX != -1)
        StdDraw.line(pX, pY, x, y);
      pX = x; pY = y;
    }
  }

  public static void main(String[] args) {
    StdDraw.setScale(-100,100);
    spirala(10000);
  }
}
