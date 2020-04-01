package predavanje07;

import edu.princeton.cs.introcs.StdDraw;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tomaz
 **/
public class Ura {

  static void ura() {
    StdDraw.setScale(-100,100);

    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");

    while (true) {
      StdDraw.clear();

      String ura = sdf.format(new Date());
      StdDraw.text(0, 0, ura);

      String [] deliUre = ura.split(":"); // uro razbijem na posamezne dele

      // sekunde so 3 del ure
      int ss = Integer.parseInt(deliUre[2]);
      // za izris kazalcev uporabi metodo predavanje06.Risanje.kazalec()
      predavanje06.Risanje.kazalec(90 - 360 / 60 * ss, 80);

      // podobno naredi še za urni in minutni kazalec
      // predlagam, da metodo kazalec() popraviš tako, da bo sprejela še en
      // parameter (debelino), da bodo kazalci različno debeli

      StdDraw.show(100);
    }
  }

  public static void main(String[] args) {
    ura();
  }
}
