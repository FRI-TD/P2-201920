package predavanje08;

/**
 * Razred za demonstracijo uporabe objektnega programiranja.
 * Razred Rastlina definira razred a nekaj lastnostmi (id, visina, starost, ...) in
 * nekaj metodami (mesecnaRast(), novMesec(), ...). Primer uporabe razreda Rastlina
 * je v razredu Drevesnica.
 * @author tomaz
 **/
public class Rastlina {
  /**
   * Stevilo do sedaj narejenih rastlin.
   * Ta atribut je statičen, torej je "en sam za vse objekte". Vsi ostali atributi
   * tega razreda niso statični, torej ima vsak objekt svojega (vsak objekt razreda
   * Rastlina ima svojo visino, svojo starost, ...)
   */
  static int ID = 0;

  /**
   * Oznaka rastline
   */
  int id;

  /**
   * Velikost rastline (v centimetrih)
   */
  int velikost;

  /**
   * Starost rastline v mesecih;
   */
  int starost;

  /**
   * Ime rastline (vrtnica, ...)
   */
  String imeRastline;

  // lastnosti rastline - mesecna rast v mladem in starem obdobju
  int rastMladaRastlina = 5; // mlada rastlina zraste za 5 cm / mesec
  int rastStaraRastlina = 2; // stara rastlina zraste za 2 cm / mesec

  int mesecnaRast() {
    if (this.starost <= 6)
      return this.rastMladaRastlina;
    else
      return this.rastStaraRastlina;
  }

  void novMesec() {
    this.starost = this.starost + 1;

    this.velikost += mesecnaRast();
  }

  void izrisiSe() {
    System.out.printf("Ime rastline: %s, starost: %d, velikost: %d\n",
            this.imeRastline, this.starost, this.velikost);
    for (int i = 0; i < velikost; i++) System.out.print(".");
    System.out.println();
  }

  void spremeniImeRastline(String imeRastline) {
    this.imeRastline = imeRastline;
  }

  static void izpisiNavodilaZaObrezovanje() {
    System.out.println("Število do sedaj izdelanih rastlin: " + ID);
    System.out.println("Rastline obrezujemo dvakrat letno, spomladi in jeseni ...");
  }
}
