package predavanje11.liki;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author tomaz
 **/
public class RisanjeLikov {
  // maksimalno dovljeno število likov
  static final int MAX_LIKI = 100;


  int stLikov;  // koliko likov imam v tabeli
  Lik[] liki;

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
      if (liki[i].isOznacen())
        liki[i].premakni(delatX, deltaY);
    }
  }

  void narisiOznake() {
    for (int i = 0; i < stLikov; i++) {
      if (liki[i].isOznacen())
        liki[i].narisiOznake();
    }
  }

  void oznaciLike(double mX, double mY) {
    for (int i = 0; i < stLikov; i++) {
      if (liki[i].obmocjeLika().contains(mX, mY))
        liki[i].setOznacen(true);
    }
  }

  void odznaciLike() {
    for (int i = 0; i < stLikov; i++) {
      liki[i].setOznacen (false);
    }
  }

  void risanje() {
    StdDraw.setScale(-100,100);

    liki[stLikov++] = new Krog(50,50,30, Color.red);
    liki[stLikov++] = new Pravokotnik(-50, 10, 40, 20, Color.green);
    liki[stLikov++] = new Kvadrat(50, -80, 20, Color.blue);

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

      if (StdDraw.isMousePressed()) {
        double mX = StdDraw.mouseX();
        double mY = StdDraw.mouseY();

        if (!StdDraw.isKeyPressed(KeyEvent.VK_SHIFT)) {
          odznaciLike();
        }

        oznaciLike(mX, mY);
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
