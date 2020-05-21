package predavanje13;

import java.io.*;

/**
 * @author tomaz
 **/
public class DataStreamTest {

  // metoda prebere in izpiše širino in višino podane png slike
  public static void main(String[] args) {
    try (
         // ker smo datoteko odprli v () delu try bloka, se bo na koncu samodejno zaprla
         DataInputStream dis = new DataInputStream(new FileInputStream(new File("viri/medo.png")));
    ) {

      // najprej preberemo 16 bajtov...
      byte [] buffer = new byte[16];
      dis.read(buffer);  // preberem 16 bajtov

      // nato dve celoštevilski vrednosti:
      // ... sirino slike (17-20 bajt png datoteke) in
      int s = dis.readInt();
      // ... visino slike (21-24 bajt png datoteke)
      int v = dis.readInt();

      System.out.printf("%d x %d\n", s, v);

    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
  }
}
