package predavanje14;

import javax.swing.*;
import java.awt.*;

/**
 * Prikaz uporabe razporejevalnika BorderLayout - komponente, ki jih bomo dodali,
 * se bodo v oknu razporedile v pet con
 * @author tomaz
 **/
public class BorderLayoutTest {

  public static void main(String[] args) {
    JFrame okno = new JFrame();

    // ustvarim komponente ...
    JButton gumb1 = new JButton("Prvi");
    JButton gumb2 = new JButton("Drugi");
    JButton gumb3 = new JButton("Tretji");
    JButton gumb4 = new JButton("Četrti");
    JButton gumb5 = new JButton("Peti");

    // komponente bo razporejal BorderLayout razporejevalnik
    okno.setLayout(new BorderLayout());

    // ... in jih dodam vsako v svojo cono
    okno.add(gumb2, BorderLayout.PAGE_START);   // zgornja vrstica
    okno.add(gumb1, BorderLayout.LINE_START);   // levi del okna
    okno.add(gumb3, BorderLayout.CENTER);       // sredina
    okno.add(gumb5, BorderLayout.LINE_END);     // desni del okna
    okno.add(gumb4, BorderLayout.PAGE_END);     // spodnja vrstica

    okno.setTitle("BorderLayout test");
    okno.setLocation(500,500);
    okno.pack();
    okno.setVisible(true);
  }
}
