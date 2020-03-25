package predavanje06;

/**
 * To je razred za testiranje razreda Orodja.
 * @author tomaz
 **/
public class TestOrodja {

  /**
   * Metoda main, v kateri kličemo metodo sredina.
   * @param args
   */
  public static void main(String[] args) {
    double a=7; // spr. a
    double x=9; // spr. b

    // klic metode iz drugega razreda. Ker je razred Orodja v
    // istem paketu kot razred TestOrodja, import ni potreben.
    double c = Orodja.sredina(a,x);
    System.out.println(c);
  }
}
