package predavenje03;

import java.util.Scanner;

public class Ocene {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int trOcena;    // prebrana ocena

    // Da se bo zanka vsaj enkrat izvedla, mora biti začetna
    // vrednost za trOcena karkoli, kar je različno od 0.
    trOcena = -1;

    int vsota=0;    // vsota vseh prebranih ocen
    int n=0;        // število prebranih ocen

    while (trOcena != 0) {
      System.out.print("Vpisi oceno: ");
      trOcena = in.nextInt();

      if (trOcena != 0) {
        vsota = vsota + trOcena;
        n = n + 1;
      }
    }

    // ker bomo delili z n, moramo najprej preveriti, ali je n različen od 0
    if (n != 0) {

      // v Javi imamo samo en operatore za deljenje: /
      // Katero deljenje bo java uporabila? Odvisno od konteksta!
      //   A)
      //     int / int .... celoštevilsko deljenje
      //   B)
      //     double / int    ...
      //     int / double    ...
      //     double / double ... običajno (ne-celostevilsko) deljenje
      //
      // Ker sta obe spremenjljivki (vsota in n) tipa int, bi java
      // ob izrazu (vsota/n) uporabila celoštevilsko deljenje; ker
      // pa mi potrebujemo realni rezultat (z decimalnimi mesti),
      // v izračun "umetno" dodamo decimalno piko (1.0 * ...)
      System.out.printf("Povprecje ocen: %.2f\n", (1.0 * vsota) / n);
    } else {
      System.out.println("OK");
    }

  }
}
