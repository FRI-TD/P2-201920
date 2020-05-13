package predavanje12;

import java.util.*;

/**
 * Prikaz delovanja slovarja.
 * @author tomaz
 **/
public class Meseci {

  public static void main(String[] args) {
    // ustvarim nov slovar (kljuci bodo tipa String, vrednosti pa tipa Integer)
    HashMap<String, Integer> meseci = new HashMap<>();

    // v slovar dodam nekaj elementov
    meseci.put("Jan", 31);
    meseci.put("Feb", 28);
    meseci.put("Mar", 31);
    meseci.put("Apr", 30);
    meseci.put("Maj", 31);
    meseci.put("Jun", 30);
    meseci.put("Jul", 31);
    meseci.put("Avg", 31);
    meseci.put("Sep", 30);
    meseci.put("Okt", 31);
    meseci.put("Nov", 30);
    meseci.put("Dec", 31);

    // stevilo elementov v slovarju
    System.out.println("Stevilo mesecev:" + meseci.size());

    // tudi po dodajanju istega ključa se slovar ne poveča
    meseci.put("Feb", 29);
    System.out.println("Stevilo mesecev:" + meseci.size());
    System.out.println("Feb:" + meseci.get("Feb"));


    // izpis vseh ključev
    Set<String> kljuci = meseci.keySet();
    System.out.println(kljuci);

    // izpis mesecev s pomocjo iteratorja
    Iterator<String> it = kljuci.iterator();
    while(it.hasNext()) {
      String kljuc = it.next();
      System.out.printf("%s: %d\n", kljuc, meseci.get(kljuc));
    }

    // izpis vrednosti
    for (Integer v : meseci.values()) {
      System.out.println(v);
    }

    System.out.println(meseci.values());
  }
}
