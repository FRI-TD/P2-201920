package predavanje06;

import org.apache.commons.io.FileUtils;

/**
 * Razred vsebuje metodo @code{sredina}, ki jo bomo klicali
 * iz drugih razredov.
 *
 * @author tomaz
 **/
public class Orodja {

  /**
   * Izračun aritmetične sredine elementov a in b.
   * @return aritmetična sredina podanih parametrov
   */
  public static double sredina(double a, double b) {
    return (a+b)/2;
  }
}
