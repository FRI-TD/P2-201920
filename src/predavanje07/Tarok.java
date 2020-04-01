package predavanje07;

import edu.princeton.cs.introcs.StdOut;

/**
 * Dva komentarja na rešitve vaje Vaja04
 *
 * @author tomaz
 **/
public class Tarok {
  static String mond = "XXI";

  public static void main(String[] args) {
    String karta = "XXI";

    // nizov NIKOLI ne primerjamo z ==; pravilno: if (karta.equals("XXI"))
    if (karta == "XXI")  // HUDA NAPAKA!!!
      System.out.println("OK");
     else
      System.out.println("NOK");


    String karta2 = "kralj";

    // namesto ročnega računanja števila presledkov pri izpisu ...
    int d1 = 6-karta.length();
    for (int i = 0; i < d1 ; i++) {
      System.out.print(" ");
    }
    System.out.print(karta);

    int d2 = 6-karta2.length();
    for (int i = 0; i < d2 ; i++) {
      System.out.print(" ");
    }
    System.out.print(karta2);
    System.out.println();

    // ... raje uporabi printf!!!
    System.out.printf("%6s%6s", karta, karta2);

  }

}
