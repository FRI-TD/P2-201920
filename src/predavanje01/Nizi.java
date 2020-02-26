package predavanje01;

public class Nizi {

  public static void main(String [] args) {
    String niz1 = "ABC";
    String niz2 = "ABCD";

    String enaka;
    // za primerjavo nizov uporabimo metodo equals (in ne operatorja ==)!
    if (niz1.equals(niz2))
      enaka = "sta";
    else
      enaka = "nista";

    System.out.printf("Niza '%s' in '%s' %s enaka", niz1, niz2, enaka);
  }
}
