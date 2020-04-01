package predavanje07;

import java.util.Arrays;
import java.util.Random;

/**
 * Popravljen program za izpis Loto številk:
 *   - preprečimo ponavljanje (števila zapisujemo v tabelo; preden vstavimo
 *     novo število, preverimo, če tako število v tabeli že obstaja)
 *   - števila uredimo po velikosti (s pomočjo svoje metode uredi())
 * @author tomaz
 **/
public class Loto {

  /**
   * Urejanje z metodo BubbleSort: sprehodim se čez celotno tabelo in
   * primerjam sosednja elementa - če sta v napačnem vrstnem redu,
   * ju zamenjam.
   * Če sprehod večkrat ponovim (vsaj (n-1)-krat), je tabela urejena.
   * @param t
   */
  static void uredi(int [] t) {
    int n = t.length;

    // število sprehodov: n-1
    for (int i = 0; i < n-1 ; i++) {
      // en sprehod gre od začetka (0) do konca (n-1) tabele
      for (int j = 0; j < n-1; j++) {
        // primerjam j-ti in (j+1)-ti element ...
        if (t[j] > t[j+1]) {
          // ... in, če sta v napačnem vrstnem redu, ju zamenjam
          int zacasno = t[j];
          t[j]   = t[j+1];
          t[j+1] = zacasno;
        }
      }
    }
  }


  // metoda izpise 7 nakljucnih števil iz za
  // izpolnjevanje loto listka (stevila med 1 in 36)
  public static void main(String[] args) {
    // ustvarim objekt rnd, ki ga bomn uporabljan za
    // ustvarjanje novih psevdo-naključnih števil
    Random rnd = new Random();

    // če želim, lahko podam seme; morda rojstni datum?
    //rnd.setSeed(15051998);

    int [] loto = new int[7];

    for (int i = 0; i < 7; i=i+1) {
      int x = rnd.nextInt(36);
      x = x + 1; // ustvarim novo število

      // preverim, ali število v tabeli že obstaja
      boolean imam = false;
      for (int j = 0; j < i; j++) {
        if (loto[j] == x)
          imam=true; // ce število najdem, nastavim "imam" na true
      }
      if (imam) { // če je "imam==true", stevilo obstaja -> ponovim zanko!
        i--;
        continue;  // skoči na novo iteracijo zanke
      }

      loto[i] = x;
    }

    // števila še uredim ...
    uredi(loto);
    // ... in izpišem
    for (int k = 0; k < 7; k++) {
      System.out.print(loto[k] + " ");
    }
    System.out.println();

    //Arrays.sort(loto);
    //System.out.println(Arrays.toString(loto));
  }
}