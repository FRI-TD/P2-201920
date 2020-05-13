package predavanje12;

import java.io.File;

/**
 * @author tomaz
 **/
public class Datoteke {

  public static void main(String[] args) {
    // (absolutna) pot do mape
    File folder = new File("/Users/tomaz/P2");
    System.out.println(folder.exists()); // true ... folder obstaja

    // f2 ... datoteka v mapi "folder"
    File f2 = new File(folder, "Drzava.java");  // /Users/tomaz/P2/Datoteka.java
    System.out.println(f2.getAbsolutePath());
    System.out.println(f2.length());            // velikost (sveilo bajtov) datoteke

    File f3 = new File(folder, "novo");         // mapa, ki ne obstaja
    System.out.println(f3.exists());
    f3.mkdir();                                 // ustvarim mapo /Users/tomaz/P2/novo

    String [] vsebina = folder.list();          // izpis vseh datotek v mapi
    for (String v: vsebina) {
      System.out.println(v);
    }
  }
}
