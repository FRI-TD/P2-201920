package predavanje13;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Razred, ki implementira AutoCloseable se lahko uporabi kot vir
 * v try-with-resources. Metoda close() se bo ob koncu try bloka
 * samostojno izvedla.
 * primer uporabe tega razreda je spodaj v main metodi.
 *
 */
class MojVir implements AutoCloseable {
  public void close() throws Exception {
    System.out.println("Moj vir se je zaprl");
  }
}


/**
 * Razred, ki razširja RuntimeException, predstavlja "nepreverljivo izjemo";
 */
class MojaIzjema extends RuntimeException  {
  @Override
  public String getMessage() {
    return "Moja napaka!";
  }
}

/**
 * @author tomaz
 **/
public class TyrCatch {

  // meotda, ki "vrže" izjemo; ker je izjema nepreverljiva, lahko to metodo
  // kličemo, ne da bi posebej obravnavali izjemo
  static void nekaj() throws MojaIzjema {
    if (1==1)
      throw new MojaIzjema();
  }

  // metoda sproži izjemo in jo ulovi (try) ter obravnava (catch)
  static void deli() {
    int x = 0;

    try {
      int i = 5 / x;
    } catch (Exception e) {
      System.out.println("Napaka (getMessage): " + e.getMessage());
      System.out.println("Napaka (toString): " + e.toString());

      e.printStackTrace();
    }
  }

  // tudi pri delu s tabelo lahko pride do izjeme;
  // izjemo lahko ujamemo v try bloku
  static void tabela() {
    int []a = new int[5];
    try {
      a[7] = 10;  // 7. element ne obstaja -> sproži se izjema!
    } catch (Exception e) {
      System.out.println("Ups, napaka!");
    }
  }

  // Metoda, ki odpira datoteko, lahko morebitno izjemo vrže naprej;
  // v tem primeru mora metoda, ki kliče odpriDatotako() izjemo pravilno obravnavati.
  static void odpriDatoteko() throws Exception {
    Scanner sc = new Scanner(new File("ime.txt"));
  }


  // Bolj pravilno je, da metoda svojo izjemo obravnava sama. Metodi, ki
  // bo klicala odpriDatotekoPravilno() ni potrebo obravnavati izjeme!
  static void odpriDatotekoPravilno()  {
    try {
      Scanner sc = new Scanner(new File("ime.txt"));
    } catch (Exception e) {
      //...
    }
  }


  public static void main(String[] args) {
    nekaj();

    //deli();
    tabela();

    try {
      odpriDatoteko();
    } catch (Exception e) {

    }

    odpriDatotekoPravilno();

    Scanner sc = null;
    try {
      sc = new Scanner(new File("ime.txt"));

      // ... branje
      // kaj pa, če med branjem pride do izjeme?
      // če bi bil ukaz sc.close() na koncu try bloka, ob izjemi
      // do tja ne bi prišli in datoteka bi ostala odprta...

    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());

    } finally { // v vsakem primeru!
      // ... zato je prav, da se zapiranje datoteke zgodi v "finally" bloku
      try {
        sc.close();
      } catch (Exception e) {
        System.out.println("Napaka pri zapiranju!");
      }
    }


    // vsi viri (mv, vhod in izhod) so ob koncu try bloka samodejno zaprejo
    try ( MojVir mv = new MojVir();
          Scanner vhod = new Scanner(new File("ime.txt"));
          PrintWriter izhod = new PrintWriter(new File("iime.txt"));
          ) {

      System.out.println("bla");
      //vhod.close se bo na koncu zgodil avtomatsko!!!!
      //izhod.close se bo na koncu zgodil avtomatsko!!!!
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }
}
