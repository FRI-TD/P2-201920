package predavanje05;

/**
 * @author tomaz
 **/
public class Niz {
  public static void main(String[] args) {
    // Kaj izpisejo spodnje tri vrstice?
    String niz = "ponedeljek";
    niz = "sreda";
    System.out.println("Danes je " + niz);
    // Odgovor: "Danes je sreda".
    // Zakaj, če je pa niz nespremenljiv? Zato, ker se je ustvaril nov objekt!


    // Če zelimo del niza sprememniti, namesto Stringa uporabimo StringBuffer
    StringBuffer sb1 = new StringBuffer("sREDA");
    System.out.println(sb1);
    System.out.println(sb1.charAt(0));
    sb1.setCharAt(0, 'S');
    System.out.println(sb1);

    StringBuffer sb2 = new StringBuffer("Danes je lep dan!");
    System.out.println(sb2.reverse());
  }
}
