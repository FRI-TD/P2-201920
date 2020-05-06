package predavanje11.liki;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * @author tomaz
 **/
public class Pravokotnik extends Lik {
  private int a; // sirina
  private int b; // visina

  public Pravokotnik(int x, int y, int a, int b, Color barva) {
    super(x, y, barva);
    this.a = a;
    this.b = b;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(getBarva());
    StdDraw.filledRectangle(getX()+getA()/2, getY()+getB()/2, getA()/2, getB()/2);
  }

  @Override
  Rectangle obmocjeLika() {
    return new Rectangle(getX(), getY(), getA(), getB());
  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }
}
