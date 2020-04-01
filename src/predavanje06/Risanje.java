package predavanje06;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * Demonstracija uporabe razreda StdDraw iz knjižnice stdlib.jar
 *
 * @author tomaz
 **/
public class Risanje {

  static void test() {
    StdDraw.line(0,0,1,1);
  }

  static void tarca() {
    // nastavim koordinatni sistem x: -100..100, y: -100..100
    StdDraw.setScale(-100,100);
    // "pobrišem" ozadnje s črno barvo
    StdDraw.clear(Color.black);
    // izberem rumen svinčnik ...
    StdDraw.setPenColor(Color.yellow);
    for (int i = 0; i < 10; i++) {
      // ... in narišem 10 krogov
      StdDraw.circle(0,0, 10 + 10*i);
    }
  }

  /**
   * Metoda nariše "kvadratno spiralo"
   * @param delta za koliko povecam velikost crtice na vsakem koraku
   * @param n stevilo črtic
   */
  static void kvadratnaSpirala(int n, int delta) {
    StdDraw.setScale(-100,100);

    // 4 možne smeri premika pri izrisu spirale
    int [][] smeri = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
    int trSmer = 0;

    int dolzina = 1;

    int trX = 0, trY = 0;
    for (int i = 0; i < n; i++) {
      // narisem crtico
      int nX = trX + smeri[trSmer][0]*dolzina;
      int nY = trY + smeri[trSmer][1]*dolzina;
      StdDraw.line(trX, trY, nX, nY);

      trX = nX; trY = nY;

      // spremenim smer ...
      trSmer = (trSmer + 1) % 4;
      // ... in povečam dolžino črtice
      dolzina = dolzina + delta;
    }
  }

  /**
   * Risanje grafov funkcije. Metoda je prekopirana iz razreda Graf, sprememnjen je
   * le del za risanje (namesto izpisa v tabelo tu rišem direktno na zaslon).
   */
  static void graf() {
    int H = 100, W=H;
    StdDraw.setScale(0, H);

    double x1=-2*Math.PI, x2=2*Math.PI;
    double y1=-1,         y2=1;

    int pX=-1, pY=-1;
    for (int j = 0; j < W ; j++) {
      double x = j*(x2-x1)/W+x1;
      double y = Math.sin(x);
      int i = (int) (H*(y-y1) / (y2-y1));

      if ((i>=0 && i<H) && (pX!=-1))
        StdDraw.line(pX, pY, j, i);

      pX = j; pY = i;
    }
  }

  /**
   * Metoda narise kazalec pod danim kotom
   * @param kot kot v stopnjah
   * @param dolzina dolzina kazalca
   */
  public static void kazalec(double kot, double dolzina) {
    double x = dolzina * Math.cos(2*Math.PI*kot/360);
    double y = dolzina * Math.sin(2*Math.PI*kot/360);

    StdDraw.line(0,0,x,y);
  }

  static void radar() {
    StdDraw.setScale(-100,100);

    int kot=0;
    while (true) {
      StdDraw.clear(Color.black);
      StdDraw.setPenColor(Color.green);
      StdDraw.setPenRadius(0.02);
      for (int i = 0; i < 4; i++) {
        StdDraw.circle(0, 0, 20 + 20 * i);
      }
      kazalec(kot,80);
      kot=kot-1;
      StdDraw.show(10);
    }

  }
  public static void main(String[] args) {
    //test();
    // tarca();
    //kvadratnaSpirala(200, 1);
    //graf();
    radar();
  }
}
