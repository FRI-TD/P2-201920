package predavanje13;

import predavanje12.Oseba;

import java.io.*;


/**
 * Demonstracija pisanja in branja objektov v datoteko.
 *
 * @author tomaz
 **/
public class ObjectStreamTest {

  public static void main(String[] args) throws Exception {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("viri/o.dat")));

    Oseba o = new Oseba("Miha", 20);

    // z metodo writeObject() lahko zapišemo vsak objekt, katerega
    // razred implementira vmesnik Serializable
    oos.writeObject(o);
    oos.close();

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("viri/o.dat")));
    Oseba osebaPrebrano = (Oseba) ois.readObject();
    System.out.println(osebaPrebrano.toString());
    ois.close();
  }
}
