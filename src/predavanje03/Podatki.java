package predavenje03;

import java.util.Scanner;

// Program vpraša za ime in starost in izpiše pozdravno sporocilo.
public class Podatki {
  public static void main(String[] args) {
    // z objektom tipa Scanner se povežem s tipkovnico (System.in)
    Scanner sc = new Scanner(System.in);

    System.out.print("Vpisi svoje ime: ");
    // za branje podatkov iz tipkovnice uporabim metodo tipa next...()
    String ime = sc.next();

    System.out.print("Vpisi svojo starost: ");
    int starost = sc.nextInt();

    System.out.printf("Pozdravljen(a), %s, star si %d let!\n", ime, starost);
  }
}
