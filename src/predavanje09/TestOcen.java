package predavanje09;

/**
 * @author tomaz
 **/
public class TestOcen {

  public static void main(String[] args) {
    Ocene o1 = new Ocene(); // ocene P2

    o1.dodajOceno(10);o1.dodajOceno(10);
    System.out.println("Status P2: " + o1.getStatus());

    Ocene o2 = new Ocene(); // ocene OS
    o2.dodajOceno(5);o2.dodajOceno(10);
    System.out.println("Status OS: " + o2.getStatus());
  }
}
