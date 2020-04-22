package predavanje10.liki;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * @author tomaz
 **/
public class RisanjeLikov {
  // maksimalno dovljeno število likov
  static final int MAX_LIKI = 100;


  int stLikov;  // koliko likov imam v tabeli
  Lik [] liki;

  RisanjeLikov() {
    stLikov = 0;
    liki = new Lik[MAX_LIKI];
  }

  void narisiLike() {
    for (int i = 0; i < stLikov; i++) {
      liki[i].narisi();
    }
  }

  void premakniLike(int delatX, int deltaY) {
    for (int i = 0; i < stLikov; i++) {
      liki[i].premakni(delatX, deltaY);
    }
  }

  void narisiOznake() {
    for (int i = 0; i < stLikov; i++) {
      if (liki[i].isOznacen())
        liki[i].narisiOznake();
    }
  }


  void risanje() {
    StdDraw.setScale(-100,100);

    liki[stLikov++] = new Krog(50,50,30, Color.red);
    liki[stLikov++] = new Pravokotnik(-50, 10, 40, 20, Color.green);
    liki[stLikov++] = new Kvadrat(50, -80, 20, Color.blue);

    liki[0].setOznacen(true);
    liki[1].setOznacen(true);
    liki[2].setOznacen(true);

    StdDraw.enableDoubleBuffering();

    while (true) {
      // preverim, če je bila pritisnjena tipka
      if (StdDraw.hasNextKeyTyped()) {
        char c = StdDraw.nextKeyTyped();
        switch (c) {
          case 'a' : premakniLike(-5, 0); break;
          case 'd' : premakniLike( 5, 0); break;
          case 's' : premakniLike( 0, -5); break;
          case 'w' : premakniLike( 0,  5); break;
        }
      }


      StdDraw.clear();
      narisiLike();
      narisiOznake();

      StdDraw.show();
      StdDraw.pause(100);
    }
  }

  public static void main(String[] args) {
    RisanjeLikov rl = new RisanjeLikov();
    rl.risanje();
  }
}
