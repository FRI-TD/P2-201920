package predavanje14;

import javax.swing.*;

/**
 * Primer absolutnega pozicioniranja komponent na glavno okno.
 *
 * Pri absolutnem pozicioniranju (to je, ko ima vsaka komponenta določen položaj
 * in velikost), je priporočljivo, da si končni izgled okna narišemo na papir,
 * tam določimo koordinate in velikost posamezne komponente in nato podatke
 * prenesemo v kodo.
 *
 * @author tomaz
 **/
public class Absolutno {

  public static void main(String[] args) {
    JFrame okno = new JFrame();

    // vsako komponneto najprej izdelamo ...
    JLabel napis1 = new JLabel("Cena kepice");
    // nato ji dolopimo velikost in položaj

    napis1.setSize(110, 20);  napis1.setLocation(5,5);
    JLabel napis2 = new JLabel("Stevilo kepic");
    napis2.setSize(110, 20);  napis2.setLocation(5,25);
    JButton gumb = new JButton("Racunaj");
    gumb.setSize(110, 20);    gumb.setLocation(5,45);
    JTextField vpis1 = new JTextField();
    vpis1.setSize(110, 20);   vpis1.setLocation(125,5);
    JTextField vpis2 = new JTextField();
    vpis2.setSize(110, 20);   vpis2.setLocation(125,25);
    JTextField vpis3 = new JTextField();
    vpis3.setSize(110, 20);   vpis3.setLocation(125,45);

    // oknu sporočim, da bom komponente pozicioniral ročno
    okno.setLayout(null);

    // vse komponente dodam na okno
    okno.add(napis1);okno.add(napis2);okno.add(gumb);
    okno.add(vpis1);okno.add(vpis2);okno.add(vpis3);

    okno.setTitle("Absolutno pozicioniranje");
    okno.setSize(250,70);
    okno.setLocation(500,500);
    okno.setVisible(true);
  }
}
