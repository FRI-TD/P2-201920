package predavanje11.liki;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.*;

/**
 * Razsiritev razreda Lik - implementacija metode narisi().
 * @author tomaz
 **/
public class Krog extends Lik {
  // polmer kroga
  private int r;

  Krog(int x, int y, int r, Color barva) {
    super(x,y,barva);
    this.r = r;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(getBarva());
    StdDraw.filledCircle(getX(), getY(), getR());
  }

  @Override
  Rectangle obmocjeLika() {
    return new Rectangle(getX()-getR(), getY()-getR(), 2*getR(), 2*getR());
  }

  public int getR() {
    return r;
  }

  public void setR(int r) {
    this.r = r;
  }
}
