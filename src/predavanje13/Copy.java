package predavanje13;

import java.io.*;

/**
 * Kopiranje binarne datoteke na tri načine
 * 1) bajt-po-bajtu (metoda copy()); to je najpočasnejši način
 * 2) blok-po-bloku (metoda copy1())
 * 3) blok-po-bloku v kombinaciji z Buffered ovojnimi tokovi (metoda copy2()) - ta metoda je najhitrejša!
 *
 * @author tomaz
 **/
public class Copy {

  static void copy(String imeVhoda, String imeIzhoda) {
    try {
      FileInputStream  fis = new FileInputStream(new File(imeVhoda));
      FileOutputStream fos = new FileOutputStream(new File(imeIzhoda));

      while(fis.available() > 0) {
        fos.write(fis.read());
      }

      fos.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }

  }

  static void copy1(String imeVhoda, String imeIzhoda) {
    try {
      FileInputStream  fis = new FileInputStream(new File(imeVhoda));
      FileOutputStream fos = new FileOutputStream(new File(imeIzhoda));

      byte [] buffer = new byte[1024];
      int prebrano; // koliko bajtov smo prebrali z zadnjnim branjem
      do {
        prebrano = fis.read(buffer); // preberem blok bajtov (največ 1024)

        if (prebrano > 0) {
          fos.write(buffer, 0, prebrano);
        }

      } while (prebrano > 0);

      fos.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }

  }

  static void copy2(String imeVhoda, String imeIzhoda) {
    try {
      FileInputStream  fis = new FileInputStream(new File(imeVhoda));
      FileOutputStream fos = new FileOutputStream(new File(imeIzhoda));

      // dodamo dodatno shranjevanje (bufferiranje) podatkov
      BufferedInputStream  bis = new BufferedInputStream(fis);
      BufferedOutputStream bos = new BufferedOutputStream(fos);

      byte [] buffer = new byte[1024];
      int prebrano; // koliko bajtov smo prebrali z zadnjnim branjem
      do {
        prebrano = bis.read(buffer); // preberem blok bajtov (največ 1024)

        if (prebrano > 0) {
          bos.write(buffer, 0, prebrano);
        }

      } while (prebrano > 0);

      bos.close();
      bis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }

  }

  // kopiraj vsebino datoteke medo.png v drugo datoteko
  public static void main(String[] args) {
    copy2("viri/m32.png", "viri/medo1.png");
  }
}
