package predavanje01;

public class Argumenti {

  // Izpis agrumentov programa
  public static void main(String[] args) {
    // preverimo, ali so bili argumenti podani:
    if (args.length > 0) {
      // izpis stevila argumentov
      System.out.println("Stevilo argumentov: " + args.length);

      // izpis prvega argumenta
      System.out.println("Prvi argument: " + args[0]);

      // izpis vseh argumentov (s "sprehodom" (for zanka) po tabeli args)
      System.out.println();
      System.out.println("Vsi argumenti:");
      for (int i = 0; i < args.length; i++) {
        System.out.printf("Argument %d: %s\n", i + 1, args[i]);
      }
    }  else {
      System.out.println("Program nima argumentov.");
    }


  }
}
