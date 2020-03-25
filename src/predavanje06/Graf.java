package predavanje06;

/**
 * Program izrise graf funkcije sinus na tekstovni zaslon.
 *
 * @author tomaz
 **/
public class Graf {
  /**
   * Višina zaslona
   */
  static final int H = 25;

  /**
   * Širina zaslona
   */
  static final int W = 80;

  /**
   * Tabela, ki predstavlja zaslon; v ozadju "risemo" v
   *  to tabelo, nato vsebino tabele izpišemo na zaslon.
   */
  static char [][] zaslon = new char[H][W];

  /**
   * Izbris vsebine zaslona
   */
  static void pobrisiZaslon() {
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        zaslon[i][j] = ' ';
      }
    }
  }

  /**
   * Izpis tabele na zaslon
   */
  static void izpisi() {
    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(zaslon[H-i-1][j]);
      }
      System.out.println();
    }
  }

  /**
   * Izris koordinatnega sistema
   */
  static void koordinatniSistem() {
    // navpična crt (ordinata)
    for (int i = 0; i < H; i++) {
      zaslon[i][W/2] = '|';
    }
    for (int j = 0; j < W; j++) {
      zaslon[H/2][j] = '-';
    }
    zaslon[H/2][W/2] = '+';
  }

  /**
   * Izris grafa
   */
  static void graf() {
    double x1=-2*Math.PI, x2=2*Math.PI;
    double y1=-1,         y2=1;

    for (int j = 0; j < W ; j++) {
      // premik koordinatnega sistema
      double x = j*(x2-x1)/W+x1;
      double y = Math.cos(2*x);
      int i = (int) (H*(y-y1) / (y2-y1));

      // pred "izrisom" na zaslon preverim, če je znak
      // v mejah zaslonskega koordinatnega sistema
      if (i>=0 && i<H)
        zaslon[i][j] = '*';
    }
  }

  public static void main(String[] args) {
    pobrisiZaslon();
    koordinatniSistem();
    graf();
    izpisi();
  }

}
