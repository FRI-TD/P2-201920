package predavanje11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Implementacija več vmesnikov. Primerke razreda Kvadratna zato lahko uporabim
 * povsod, kjer je zahtevan objekt tipa Funkcija, ActionListener in/ali MouseListener
 * (glej primer v programu Test.java)
 *
 * @author tomaz
 **/
public class Kvadratna implements Funkcija, ActionListener, MouseListener {

  @Override
  public double vrednost(double x) {
    return x*x;
  }

  @Override
  public double odvod(double x) {
    return 2*x;
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }


  @Override
  public void mouseClicked(MouseEvent e) {

  }

  @Override
  public void mousePressed(MouseEvent e) {

  }

  @Override
  public void mouseReleased(MouseEvent e) {

  }

  @Override
  public void mouseEntered(MouseEvent e) {

  }

  @Override
  public void mouseExited(MouseEvent e) {

  }
}
