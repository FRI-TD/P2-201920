package predavanje06;

/**
 * Prikaz uporabe ukaza switch.
 *
 * @author tomaz
 **/
public class SwitchTest {

  public static void main(String[] args) {
    int ocena = 9;

// To, kar naredimo s spodnjim zaporedjem if-else ukazov,
// naredimo tudi s spodnjim switch ukazom!
//
//    if (ocena == 10)
//      System.out.println("ODLIČNO");
//    else if ((ocena==9) || (ocena==8))
//      System.out.println("Prav dobro");
//    else if (ocena==7)
//      System.out.println("Dobro");
//    else if (ocena==6)
//      System.out.println("Zadostno");
//    else
//      System.out.println("Nezadostno");

    switch (ocena) {
      case 10:
        System.out.println("ODLIČNO");
        // vsak "case" mora imeti svoj "break"!
        break;
      case 9: case 8:
        System.out.println("Prav dobro");
        break;
      case 7:
        System.out.println("Dobro");
        break;
      case 6:
        System.out.println("Zadostno");
        break;
      default:
        System.out.println("Nezadostno");
    }

  }
}
