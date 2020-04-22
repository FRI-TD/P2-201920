package predavanje10;

/**
 * Razsiritev razreda Sinus - metodi vrednost() in odvod() vracata
 * vrednost in odvod funkcije sinus.
 *
 * @author tomaz
 **/
public class Sinus extends Funkcija {
  @Override
  double vrednost(double x) {
    return Math.sin(x);
  }

  @Override
  double odvod(double x) {
    return Math.cos(x);
  }
}
