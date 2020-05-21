package predavanje13;

import java.net.URL;
import java.util.Scanner;

/**
 * Branje podatkov iz internetnega vira -> uporaba razreda java.util.URL
 *
 * @author tomaz
 **/
public class ScannerInternet {
  public static void main(String[] args) {
    try {
      // na zunanji (internetni) vir se "povežemo" s pomočjo razreda URL ...
      URL url = new URL("https://meteo.arso.gov.si/uploads/probase/www/observ/surface/text/sl/observation_si_latest.html");
      // ... nato "odpremo" Scanner na podoben naičin, kot bi ga odprli za branje datoteke
      Scanner sc = new Scanner(url.openStream());

      // delo s scannerjem je enako kot pri delu z lokalnimi datotekami
      while (sc.hasNextLine()) {
        String vrstica = sc.nextLine();
        System.out.println(vrstica);
      }
      sc.close();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
}
