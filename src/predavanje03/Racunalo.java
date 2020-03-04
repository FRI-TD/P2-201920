package predavenje03;

public class Racunalo {
  public static void main(String [] args) {
    // pred izvajanje moram obvezno preveriti ali sem
    // dobil natanko dva argumenta!
    if (args.length != 2) {
      // če nisem dobil dveh argumentov, izpišem opozorilo ...
      System.out.println("Uporaba programa: java Racunalo a b");
      // ... in končam!
      System.exit(0);
    }

    // ker so argumenti nizi (torej tipa String), jih moram
    // pred uporabo pretvoriti v tip int
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    // klasicen izpis s pomocjo printf metode
    System.out.printf("%d + %d = %d\n", a, b, a+b);
  }

}
