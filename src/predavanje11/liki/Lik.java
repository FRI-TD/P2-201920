package predavanje11.liki;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * Abstrakten razred, ki ponazarja en LIK. Poleg osnovnih atributov
 * (x, y, barva) razred definira abstraktno metodo narisi() in
 * metodo premakni().
 *
 * @author tomaz
 **/
public abstract class Lik {
  static final int KV=4; // velikost kvadratka za oznacevanje

  // polozaj (lega) lika
  private int x;
  private int y;

  // barva lika
  private Color barva;

  private boolean oznacen;

  public Lik(int x, int y, Color barva) {
    this.x = x;
    this.y = y;
    this.barva = barva;
  }

  abstract void narisi();
  abstract Rectangle obmocjeLika();

  void narisiOznake() {
    Rectangle o = obmocjeLika();

    StdDraw.setPenColor(Color.lightGray);
    StdDraw.filledRectangle(o.x, o.y, KV, KV);  // spodaj leva
    StdDraw.filledRectangle(o.x+o.width, o.y, KV, KV);  // spodaj desno
    StdDraw.filledRectangle(o.x, o.y+o.height, KV, KV); // zgoraj levo
    StdDraw.filledRectangle(o.x+o.width, o.y+o.height, KV, KV); // zgoraj desno
  }

  void premakni(int deltaX, int deltaY) {
    this.x += deltaX;
    this.y += deltaY;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public Color getBarva() {
    return barva;
  }

  public void setBarva(Color barva) {
    this.barva = barva;
  }

  public boolean isOznacen() {
    return oznacen;
  }

  public void setOznacen(boolean oznacen) {
    this.oznacen = oznacen;
  }
}
