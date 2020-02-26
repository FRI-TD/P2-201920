package predavanje01;

public class PrintfDemo {

  // Metoda main izpiše različna besedila s pomočjo metode printf
  public static void main(String [] args) {
    int x = 3;
    int y = 8;
    int z = x +y;

    // izpis računa, kot na primer: 5 + 7 = 12
    System.out.printf("%d + %d = %d\n", x, y, z);

    int s = 10;
    // izpis šestnajstiškega in osmiškega števila
    System.out.printf("Število %d v se po šesnajstiško zapiše takole: %X\n", s, s);
    System.out.printf("Število %d v se po osmiško      zapiše takole: %o\n", s, s);

    String dan = "ponedeljek";
    // izpis niza
    System.out.printf("V '%s' bo deževalo\n", dan);

    char c = 'A';
    // izpis črke
    System.out.printf("Črka %c mi je zelo všeč\n", c);
    System.out.printf("Tudi črka %c mi je  všeč\n", 'F');

    for(int i = 9; i<=11; i=i+1) {
      System.out.printf("%10d\n", i);
    }

    double pi = 3.14159265358;
    // izpis realnega števila na 20 znakov in 10 decimalnih mest
    System.out.printf("Pi = %20.10f\n", pi);
  }
}
