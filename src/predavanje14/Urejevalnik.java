package predavanje14;

import javax.swing.*;
import java.awt.*;

/**
 * Uporaba dveh razporejevalnikov - BorderLayout razporeja komponante v oknu,
 * v spodnji vrstici pa za razporejanje gumbom uporabim FlowLayout.
 *
 * @author tomaz
 **/
public class Urejevalnik {

  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setLayout(new BorderLayout());

    // spodnja vrstica z gumbi
    JButton gumb1 = new JButton("OK");
    JButton gumb2 = new JButton("Cancel");
    JPanel  gumbi = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    gumbi.add(gumb1);gumbi.add(gumb2);

    // "urejevalnik" (vpisno polje, ki se razteze čas celotno prosto površino v oknu)
    JTextArea editor = new JTextArea();
    // urejevalnik odložimo na ScrollPane, ki omogoča premikanje s pomočjo pomičnih trakov
    JScrollPane jsp = new JScrollPane(editor);

    okno.add(gumbi, BorderLayout.PAGE_END);
    okno.add(jsp, BorderLayout.CENTER);

    okno.setTitle("Urejevalnik");
    okno.setLocation(500,500);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.pack();
    okno.setVisible(true);
  }
}
