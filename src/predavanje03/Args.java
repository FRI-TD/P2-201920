package predavenje03;

// Program izpise vse argumente, vsakega v svoji vrstici.
// Izpis i-tega argumenta je oblike:  Argument i: arg_i
public class Args {
  public static void main(String [] args) {
    // dolzino tabele je zapisana v atributu length (args.length);
    // pozor: length pri tabeli NI metoda, zato ne pišem oklepajev (args.length() ni pravilno!)
    System.out.printf("Stevilo argumentov: %d \n", args.length);
    for (int i = 0; i < args.length; i++) {
      System.out.printf("Argument %d: %s\n", i, args[i]);
    }
  }
}
