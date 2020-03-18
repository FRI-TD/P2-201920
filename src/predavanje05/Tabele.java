package predavanje05;

/**
 * @author tomaz
 **/
public class Tabele {
  // demonstracija dvodimenzionalne tabele
  public static void main(String[] args) {
    // deklaracija tabele in rezervacija prostora
    char [][] t = new char[3][3];
    // tabelo se "napčolnim" z vrednostmi
    t[1][1]='O';
    t[1][0]='X';

    // ... lahko pa vse skupaj naredim tudi takole:
    char [][] t2 = {{'X', 'O', 'X'}, {'O', 'x', 'O'}, {'X','X','X'}};

    System.out.println(t2[1][1]);
  }

}
