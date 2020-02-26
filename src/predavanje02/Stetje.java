package predavanje01;

public class Stetje {

  // metoda posteje, koliko besed iz tabele 'besede' se začne
  // na črko 'crka'
  static int steviloBesed(String[] besede, char crka) {
    // koliko besed se zacne na pravo crko
    int stevec = 0;

    // sprehodim se po vseh besedah
    for(int i=0; i<besede.length; i=i+1) {

      // ali se i-ta beseda začne na pravo črko?
      if (besede[i].charAt(0) == crka) {
        stevec = stevec + 1;
      }
    }

    return stevec;
  }

  public static void main(String [] args) {
    String[] besede = new String[] {"lipa", "bor", "javor", "jesen"};

    char crka = 'j';
    // klic metode steviloBesed(); rezultat ujamemo v spr. 'pojavitve'
    int pojavitve = steviloBesed(besede, crka);
    System.out.printf("Črka '%c' se kot prva crka pojavi %d-krat",
      crka, pojavitve);
  }

}
