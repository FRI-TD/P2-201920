package predavanje13;

import java.io.File;
import java.io.FileInputStream;

/**
 * Izpis datoteke na način kot jo izpiše program HexDump
 * @author tomaz
 **/
public class HexDump {

  public static void main(String[] args) {
    String imeDatoteke = "viri/besede.txt";

    try {
      // ker datoteko beremo bajt-po-bajtu, uporabimo FileInputStream
      FileInputStream fis = new FileInputStream(new File(imeDatoteke));

      int i=0;
      StringBuilder besedilo = new StringBuilder();
      while (fis.available() > 0) {
        int bajt = fis.read();
        System.out.printf("%x ", bajt);

        if (bajt > 31 && bajt < 128)
          besedilo.append((char) bajt);
        else
          besedilo.append(".");

        i++;
        if (i==16) {
          System.out.println("  " + besedilo.toString());
          besedilo = new StringBuilder();
          i=0;
        }
      }

      System.out.println("  " + besedilo.toString());

      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }
}
