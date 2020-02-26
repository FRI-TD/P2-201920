package predavanje01;

public class Srecke {

  // Izpis cenika za prodajo srečk
  public static void main(String [] args) {
    double cena = 1.25;

    System.out.println("Stevilo sreck | Cena (EUR)");
    System.out.println("--------------------------");
    for(int i=1; i<=10; i=i+1) {
     System.out.printf("%5d         | %5.2f\n", i, i*cena);
    }
  }
}
