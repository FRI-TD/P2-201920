package predavanje11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Množica dni v tednu
 * @author tomaz
 **/
public class Dnevi {
  public static void main(String[] args) {
    Set<String> dnevi = new TreeSet<>();

    // dodajanje dni v množico
    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("SRE");
    dnevi.add("CET");
    dnevi.add("PET");
    dnevi.add("SOB");
    dnevi.add("NED");

    System.out.println(dnevi.contains("SOB"));  // true
    System.out.println(dnevi.size());           // 7

    // ponovno dodajanje že obstoječih dni ne spremeni vsebine množice
    dnevi.add("SOB");
    dnevi.add("PET");
    System.out.println(dnevi.size());           // 7

    // ce odstranim PET, ostane v množici samo še 6 elementov
    dnevi.remove("PET");
    System.out.println(dnevi.size());           // 6

    // izpis elementov množice
    for(String dan : dnevi)
      System.out.println(dan);
  }
}
