package predavanje07;

import edu.princeton.cs.introcs.StdDraw;

/**
 * Roža je krožnica, ki na obodu vsebuje n manjših rož.
 *
 * Program uporabi zgornjo definicijo za izris rože.
 *
 * @author tomaz
 **/
public class Roza {

  static void roza(int stRoz, int nivo, double x, double y, double velikost) {
    // Narišem krog ...
    StdDraw.circle(x,y,velikost);
    if (nivo==1)  return;

    // ... in razporedim (manjše) rože po krožnici
    for (int i = 0; i < stRoz ; i++) {
      // kote, pod katerimi narišem manjše rože, razporedim
      // enakomerno (razlika mad njimi je 360/stRoz).
      double kot = i * 2 * Math.PI / stRoz;

      double x1 = x + velikost*Math.cos(kot);
      double y1 = y + velikost*Math.sin(kot);
      roza(stRoz, nivo-1, x1, y1, velikost/4);
    }
  }

  public static void main(String[] args) {
    StdDraw.setScale(-100, 100);
    roza(12, 4, 0, 0, 80);
  }
}
