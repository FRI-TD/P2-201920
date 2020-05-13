package predavanje12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Primerjalnik implements Comparator<Oseba> {
  @Override
  public int compare(Oseba o1, Oseba o2) {
    // primerjava po dolžini imena
    return o1.getIme().length() - o2.getIme().length();
  }
}

/**
 * Prikaz urejanja seznama elementov.
 *
 * @author tomaz
 **/
public class Imenik {

  public static void main(String[] args) {
    ArrayList<Oseba> osebe = new ArrayList<>();
    osebe.add(new Oseba("Beti",  20));
    osebe.add(new Oseba("Miha",  18));
    osebe.add(new Oseba("Lojze", 25));
    osebe.add(new Oseba("Ana",   22));
    osebe.add(new Oseba("Mojca", 19));
    osebe.add(new Oseba("Tone",  21));

    // uredimo s pomočjo metode compareTo(), ki je implementirana v razredu Oseba
    Collections.sort(osebe);
    System.out.println(osebe);

    // uredimo s pomočjo metode compare(), ki je implementirana v
    // razredu Primerjalnik (glej zgoraj)
    Collections.sort(osebe, new Primerjalnik());
    System.out.println(osebe);

    // uredimo s pomočjo metode compare(), ki je implementirana v
    // v anonimnem notranjem razredu (glej spodaj)
    Collections.sort(osebe, new Comparator<Oseba>(){
      @Override
      public int compare(Oseba o1, Oseba o2) {
        return o1.getIme().compareTo(o2.getIme());
      }
    });
    System.out.println(osebe);
  }
}
