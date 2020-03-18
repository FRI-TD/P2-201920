package predavanje05;

/**
 * @author tomaz
 **/
public class Unicode {
  // Izpis enega bloka Unicode tabele
  public static void main(String[] args) {
    int tabela = 2; //  0 .. osnovna ascii tabela (Basic Latin)
                    //  1 .. extended ASCII
                    //  2 .. Latin Extended A

    // z zanko izpišem 128 znakov
    for (int i = 0; i < 127; i++) {
      // vrednost znaka: 128*tabela + i
      System.out.printf("%c ", tabela * 128 + i);
      // vsakih 16 znakov skočim v novo vrstico
      if (i % 16 == 15) System.out.println();
    }
  }
}

