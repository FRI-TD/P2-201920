package predavanje09;

/**
 * @author tomaz
 **/
public class Drevesnica {

  static void test1() {
    Rastlina r1 = new Rastlina();
    r1.spremeniImeRastline("Nagelj");

    Rastlina r2 = new Rastlina();

    Rastlina r3 = new Rastlina("Vrtnica");

    Rastlina r4 = new Rastlina("Tilipan", 5);

    Rastlina r5 = new Rastlina(5, 15);

    System.out.println(Rastlina.ID);
    System.out.println(r1.id);
    System.out.println(r2.id);
    System.out.println(r3.id);
  }

  static void test2() {
    Drevo d1 = new Drevo();

    d1.novMesec();
    d1.novMesec();
    d1.spremeniImeRastline("Hrast");
    d1.izrisiSe();

    Rastlina r1 = new Rastlina("Vrtnica");
    System.out.println(r1); // isto kot: System.out.println(r1.toString());

    System.out.println(d1.toString());
  }

  static void test3() {
    Rastlina r1 = new Rastlina("Vrtnica");
    r1.novMesec();
    r1.novMesec();
    r1.novMesec();

    r1.setVelikost(100);r1.setStarost(10);

    System.out.printf("Ime: %s, starost: %d, velikost: %d\n",
            r1.imeRastline, r1.getStarost(), r1.getVelikost());
  }

  public static void main(String[] args) {
    //test1();
    //test2();
    test3();
  }
}
