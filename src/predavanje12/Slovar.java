package predavanje12;

import java.util.HashMap;

/**
 * @author tomaz
 **/
public class Slovar {
  public static void main(String[] args) {
    HashMap<String, Integer> slovar = new HashMap<>();

    slovar.put("Januar",  31);
    slovar.put("Januar",  30);


    Integer steviloDni = slovar.get("Januar");
    System.out.println(steviloDni);


    // v slovarju ne moremo imeti dveh enakih ključev
    // (o1 in p2 sta enaki, če velja: o1.equals(o2) in o1.hashCoda() == o2.hashcode())
    HashMap<Oseba, Integer> osebe = new HashMap<>();
    Oseba o1 = new Oseba("Janez", 10);
    Oseba o2 = new Oseba("Janez", 12);

    osebe.put(o1, 46);
    osebe.put(o2, 39);  // isti ključ (glej metodi equals in hashCode)

    System.out.println(osebe.get(o1));
    System.out.println(osebe.get(o2));

  }
}
