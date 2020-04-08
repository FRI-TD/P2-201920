package predavanje08;

/**
 * @author tomaz
 **/
public class Piskoti {

  public static void main(String[] args) {
    Smreka s1 = new Smreka();  // 1. instanca  (primerek, objekt)
    Smreka s2 = new Smreka();

    Srcek sr1 = new Srcek();

    String niz1 = "To je prvi niz";
    String niz2 = new String("To je prvi niz");
    String niz3 = new String("TO pa je drugi niz");

    char a = niz1.charAt(0);

    // To v javi ni mogoce - metoda je vedno vezana na objekt ali razred, nikoli ni "prosta"
    // charAt(niz1, 0);

    int i; // osnovni (atomarni) podatkovni tip (ni objekt)
  }
}
