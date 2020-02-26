package predavanje01;

public class JavaZakon {
  public static void main(String [] args) {
// 5x izpis besedila Java ja ZAKON!
//    int i;
//    for (i=1; i<=5; i=i+1) {
//      System.out.println("Java je ZAKON!");
//    }

    // ... izpis še enkrat, tokrat malo drugače
    // deklaracija števca znotraj zanke
    for (int i=0; i<5; i=i+1) {
      System.out.println("Java je ZAKON?");
    }

    // .. osnovno o spremenljivkah:
    int x; // deklaracija
    x = 0; // inicializacija

    int y = 5; // deklaracija + incializacija

    System.out.println(y);
  }
}
