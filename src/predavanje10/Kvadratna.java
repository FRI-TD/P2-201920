package predavanje10;

/**
 * Razsiritev razreda Sinus - metodi vrednost() in odvod() vracata
 * vrednost in odvod kvadratne funkcije a*x^2 + b*x + c.
 * @author tomaz
 **/
public class Kvadratna extends Funkcija {
  private int a, b, c;

  Kvadratna(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  double vrednost(double x) {
    return a*x*x + b*x + c;
  }

  @Override
  double odvod(double x) {
    return 2*a*x + b;
  }
}
