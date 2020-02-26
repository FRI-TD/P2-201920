package predavanje01;

public class StatistikaNiza {

  // Metoda statistika() izpise statistiko podanega niza
  static void statistika(String niz) {
    System.out.printf("Vpisi niz: %s\n",       niz);
    System.out.printf("Prva crka:       %c\n", niz.charAt(0));

    int dolzina     = niz.length();  // dolzina podanega niza
    // indeks zadnje črke v nizu je (dolzina-1)
    char zadnjaCrka = niz.charAt(dolzina - 1);
    System.out.printf("Zadnja crka:     %c\n", zadnjaCrka);

    // metoda replaceAll zamenja vse pojavitve prvega presledka s
    // praznim nizom; tako dobimo niz, ki ne vsebuje presledkov!
    String brezPresledkov = niz.replaceAll(" ", "");
    System.out.printf("Brez presledkov: %s\n", brezPresledkov);

    // to velja samo v primeru, da ni podvojenih presledkov
    int steviloBesed = niz.length() - brezPresledkov.length() + 1;
    System.out.printf("Število besed:   %d\n", steviloBesed);

    System.out.printf("Celotna dolžina: %d\n", dolzina);

    // za izpis obrnjenega niza se "sprehodimo" po črkah niza od
    // zadnje (ta ima indeks dolzina-1) proti prvi (ta ima indeks 0)
    System.out.print("Obrnjen niz:      ");
    for (int i=niz.length()-1; i>=0; i=i-1) {
      System.out.printf("%c", niz.charAt(i));
    }
    System.out.println();
  }

  public static void main(String [] args) {
    // metodo statistika lahko kličemo z različnimi parametri, takole ...
    statistika("Danes je lep dan!");

    // ... ali pa takole
    String vreme = "Zunaj sneži!";
    statistika(vreme);
  }
}
