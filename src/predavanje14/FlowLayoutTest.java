package predavanje14;

import javax.swing.*;
import java.awt.*;

/**
 *  Prikaz uporabe razporejevalnika FlowLayout - komponente, ki jih bomo dodali,
 *  se bodo v oknu razporedile v eno vrstico.
 *
 * @author tomaz
 **/
public class FlowLayoutTest {

  public static void main(String[] args) {
    JFrame okno = new JFrame();

    // ustvarim komponente ...
    JButton gumb1 = new JButton("Prvi");
    JButton gumb2 = new JButton("Drugi");
    JButton gumb3 = new JButton("Tretji");
    JButton gumb4 = new JButton("Četrti");
    JButton gumb5 = new JButton("Peti");

    // komponente bo razporejal razporejevalnik FlowLayout in sicer tako,
    // da jih bo poravnaval v LEVO
    okno.setLayout(new FlowLayout(FlowLayout.LEFT));

    // ... in jih dodam na okno
    okno.add(gumb1);okno.add(gumb2);okno.add(gumb3);okno.add(gumb4);okno.add(gumb5);

    okno.setTitle("FlowLayout test");
    okno.setLocation(500,500);
    okno.pack();
    okno.setVisible(true);
  }
}
