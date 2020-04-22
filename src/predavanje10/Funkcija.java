package predavanje10;

/**
 * Abstrakten razred z dvema abstraktnima metodama.
 * @author tomaz
 **/
public abstract class Funkcija {
  // vrednost funkcije
  abstract double vrednost(double x);

  // odvod funkcije v točki x
  abstract double odvod(double x);

}
