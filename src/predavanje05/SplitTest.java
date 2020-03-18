package predavanje05;

/**
 * @author tomaz
 **/
public class SplitTest {

  // uporaba metode split
  public static void main(String[] args) {
    // kadar imam niz, ki je sestavljen iz večih podatkov, ki so medseboj ločeni
    // z nekim ločilom, lahko niz "razbijemo" na posamezne kose s pomočjo
    // metode split; razultat bo tabela, v kateri bodo posamezni kosi prvotnega niza

    // spodnji niz vsebuje podatke, ki so ločeni z znakom ":"
    String podatki = "tomaz:10:ljubljana";

    String[] a = podatki.split(":");
    // prvi podatek (to je, podatek pred prvim dvopičjem) je "tomaz"
    System.out.println(a[0]);

    // drugi podatek (torej "10") je (tako  kot vsi ostali podatki) tipe String
    // če Stringu "prištejem" 10, java to razume kot stik nizov
    // ... zato: spodnji ukaz izpiše 1020
    System.out.println(a[1] + 20);

    // če želimo številu 10 (ki je zapisan kot drugi podatek v nizu) prišteti 20,
    // moramo najprej število "10" iz znakovne predstavite pretvotiri v število ...
    int s = Integer.parseInt(a[1]);
    // ... nato lahko opravimo običajno seštevanje; spodnji ukz izpiše 30 (10+20=30)
    System.out.println(s + 20);

  }
}
