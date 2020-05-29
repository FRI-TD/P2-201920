package predavanje14;

import javax.swing.*;
import java.awt.*;

/**
 * @author tomaz
 **/
public class PrvoOkno {

  public static void main(String[] args) {
    JFrame okno = new JFrame();

    // na okno bom dal odlagalno površino (panel)
    JPanel panel = new JPanel();
    panel.setBackground(Color.red);
    panel.setBorder(BorderFactory.createTitledBorder("Moj okvir"));

    // komponente vedno dodajamo na "content pane"; a namesto ...
    // okno.getContentPane().add(panel);
    // ... lahko pišemo kar takole (to je bližnjica):
    okno.add(panel);

    okno.setTitle("Prvo okno");
    okno.setSize(300,300);
    okno.setLocation(500,500);
    okno.setVisible(true);
  }
}
