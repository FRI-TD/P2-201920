package predavanje08;

/**
 * @author tomaz
 **/
public class Drevesnica {

  static void test1() {
    Rastlina r1 = new Rastlina(); // izdelam objekt
    r1.id = 1;
    r1.starost = 4;
    r1.imeRastline = "Vrtnica";

    System.out.println(r1.imeRastline);
    System.out.println(r1.mesecnaRast());
    r1.starost=10;
    System.out.println(r1.mesecnaRast());

    Rastlina r2 = new Rastlina();
    r2.imeRastline = "Lilija";

    System.out.println("Prva  rastlina: " + r1.imeRastline);
    System.out.println("Druga rastlina: " + r2.imeRastline);
  }

  static void test2() {
    Rastlina r1 = new Rastlina();
    r1.spremeniImeRastline("Vrtnica");
    r1.novMesec();r1.novMesec();r1.novMesec();r1.novMesec();
    r1.izrisiSe();
  }


  static void test3() {
    Rastlina r1 = new Rastlina();
    //r1.ID = 1; // statičnih atributov ne uporabljam preko objekta!
    Rastlina.ID = 1;

    Rastlina r2 = new Rastlina();
    Rastlina.ID = 2;

    r1.velikost=5;

    System.out.println(Rastlina.ID);
  }


  public static void main(String[] args) {
    // test1();
    //test2();
    test3();

    Rastlina.izpisiNavodilaZaObrezovanje();
  }
}
