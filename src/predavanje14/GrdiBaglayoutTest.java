package predavanje14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


// Primerki tega razreda lahko poslušajo dogodke tipa Action
class PoslucalecGumbaOK implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    // v tej metodi napišemo kodo, ki se bo zgodila ob dobodku "action" -
    // takrat se namreč pokliče metoda actionPerformed()
    System.exit(0);
  }
}

/**
 * Razred demonstrira uporabo razporejevalnika GridBagLayout in delovanje poslušalcev.
 *
 * @author tomaz
 **/
public class GrdiBaglayoutTest {

  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setLayout(new GridBagLayout());

    // najprej moramo izdelati vse komponente ...
    JButton gumb1 = new JButton("OK");
    JButton helpGumb = new JButton("Help");
    JButton gumb2 = new JButton("Cancel");

    JPanel  gumbi = new JPanel(new FlowLayout(FlowLayout.CENTER));
    gumbi.add(gumb1);gumbi.add(gumb2);gumbi.add(helpGumb);

    JTextArea editor = new JTextArea();
    JScrollPane jsp = new JScrollPane(editor);

    JLabel     imeL = new JLabel("Ime");
    JLabel     koorL = new JLabel("Koordinate");
    JTextField imeTF = new JTextField();
    JTextField koorTF = new JTextField();

    // ... nato komponentam dodamo poslušalce ...

    // ko bo uporabnik pritisnil na gumb1, se bo poklicala metoda actionPerformed()
    gumb1.addActionListener(new PoslucalecGumbaOK());

    // poslusalec za gumb2
    gumb2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String ime = imeTF.getText();
        editor.setText(ime);
      }
    });

    // poslušalec za premikanje miške nad površino urejevalnika editor
    editor.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseMoved(MouseEvent e) {
        koorTF.setText(e.getX() + ", " + e.getY());
      }
    });

    // poslušalec za gumb helpGumb (izraz lambda - napreden koncept; ni del snovi P2)
    helpGumb.addActionListener((e) -> {
      JOptionPane.showInputDialog("Vpiši nekaj");
      JFileChooser jfc = new JFileChooser();
      jfc.showOpenDialog(null);

      JColorChooser jcc = new JColorChooser();
      jcc.showDialog(null, "Izberi", Color. YELLOW);
    });


    // ... komponente na koncu dodamo še na okno; za vsako komponento določimo
    // vrednost parametrov gbc.gridx, gbc.gridy, gbc.insets, gbc.weightx, gbc.weighty, ...
    // in komponento dodamo z ukazom add(komponenta, gbc)
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.insets = new Insets(5, 5, 0 , 0);
    okno.add(imeL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.insets = new Insets(5, 5, 0 , 0);
    okno.add(koorL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=0;
    gbc.insets = new Insets(5, 5, 0 , 5);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1;
    okno.add(imeTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1;
    gbc.insets = new Insets(5, 5, 0 , 5);
    okno.add(koorTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=2;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1;
    gbc.weighty = 1;
    gbc.gridwidth=2;
    gbc.insets = new Insets(5, 5, 0 , 5);
    okno.add(jsp, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=3;
    gbc.gridwidth=2;
    gbc.insets = new Insets(5, 5, 0 , 0);
    okno.add(gumbi, gbc);

    okno.setTitle("Imenik");
    okno.setLocation(500,500);
    okno.setSize(500,500);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
