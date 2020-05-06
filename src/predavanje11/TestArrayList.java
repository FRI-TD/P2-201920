package predavanje11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author tomaz
 **/
public class TestArrayList {

  public static void main(String[] args) {
    ArrayList<Integer> tabela = new ArrayList<>();

    // dodajanje v tabelo na konec
    tabela.add(5);
    tabela.add(7);
    tabela.add(9);
    tabela.add(13);

    // elemente lahko dosežemo tudi s pomočjo indeksa
    System.out.println(tabela.get(1));

    // metoda contains() vrne true, če je element prisoten v tabeli
    System.out.println(tabela.contains(19));
    System.out.println(tabela.size());

    System.out.println("Izpis z iteratorjem");
    Iterator<Integer> it = tabela.iterator();
    while (it.hasNext()) {
      int x = it.next();
      System.out.println(x);
    }

    System.out.println("Izpis s klasicno for zanko");
    for (int i = 0; i < tabela.size() ; i++) {
      System.out.println(tabela.get(i));
    }

    System.out.println("Izpis s foreach zanko");
    for (int element : tabela) {
      System.out.println(element);
    }


    /*
    // TA NAČIN NI PRAVI - vsakič, ko kličeš tabela.iterator() dobiš
    // nov iterator, zato se spodnje zanka zacikla (gre vedno od začetka)
    while(tabela.iterator().hasNext()) {
      int x = tabela.iterator().next();
      System.out.println(x);
    }
    */
  }
}
