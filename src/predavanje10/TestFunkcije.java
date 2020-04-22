package predavanje10;

// Implementacija razširitve razreda Funkcija v datoteki TestFunkcije.java
class Cosinus extends Funkcija {
  @Override
  double vrednost(double x) {
    return Math.cos(x);
  }

  @Override
  double odvod(double x) {
    return -Math.sin(x);
  }
}

/**
 * @author tomaz
 **/
public class TestFunkcije {

  /**
   * Newtnova iteracijska metoda za iskanje nicel podane funkcije.
   *
   * @param f  funkcija
   * @param x0 zacetni priblizek
   * @param n   število iteracij
   * @return priblizek za niclo
   */
  static double poisciNiclo(Funkcija f, double x0, int n) {
    for (int i = 0; i < n; i++) {
      x0 = x0 - f.vrednost(x0) / f.odvod(x0);
    }
    return x0;
  }

  public static void main(String[] args) {
    Funkcija kv1 = new Kvadratna(1, -4, 3);

    double nicla = poisciNiclo(kv1, 5, 5);
    System.out.println("Nicla: "+nicla);


    Funkcija sinF = new Sinus();
    double pi = poisciNiclo(sinF, 2, 5);
    System.out.println("Prva nicla sinusoiude: " + pi);
    System.out.println("PI:                    " + Math.PI);


    // Funkcija implementirana kot "anonimni notranji razred"
    // V fazi izgradnje objekta tipa "Funkcija" lahko razred
    // popravimo (tako, da definiramo manjkajoci metodi)
    Funkcija linearna = new Funkcija() {
      @Override
      double vrednost(double x) {
        return 3*x + 7;
      }

      @Override
      double odvod(double x) {
        return 3;
      }
    };
    double niclaLinearne = poisciNiclo(linearna, 0, 10);
    System.out.println("Nicla linearne: " + niclaLinearne);

    // anonimni notranji razre lahko naredimo tudi iz ne-abstraktnega razreda.
    // V tem priemru v razredu Kvadratna "popravimo" metodo vrednost(), metoda
    // odvod pa ostane enaka metodi, definirani v Kvadratna.
    Funkcija kv2 = new Kvadratna(1, -4, 3) {
      double vrednost(double x) {
        return 0;
      }
    };
  }
}
