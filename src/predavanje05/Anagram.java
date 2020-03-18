package predavanje05;

import java.util.Random;

/**
 * @author tomaz
 **/
public class Anagram {

  // Metoda prejme niz in premeša črke v njem
  // Ker je objekt razreda String nespremenljiv, moram niz najprej pretvoriti
  // v obliko, kjer ga bomo lahko spreminjali, nato bom v tej obliki črke niza
  // premešali, na koncu pa bomo rezultat ponovno pretvorili v niz
  static String anagram(String niz, int n) {
    // Niz pretvorimo v tabelo znakov ...
    char [] znaki = niz.toCharArray();

    Random rnd = new Random();

    // ... nato n-krat zamenjamo polozaj para črk ...
    for (int i = 0; i < n; i++) {
      int z1 = rnd.nextInt(niz.length()); // ustvarimo prvi indeks
      int z2 = rnd.nextInt(niz.length()); // ustvarimo drugi indeks

      // zamenjamo črki na mestu z1 in z2
      char t = znaki[z1];
      znaki[z1] = znaki[z2];
      znaki[z2] = t;
    }
    // ... na koncu tabelo črk pretvorimo v niz
    return new String(znaki);
  }

  public static void main(String[] args) {
    System.out.println(anagram("POMLAD", 10));
  }
}
