package predavanje09;

/**
 * @author tomaz
 **/
public class Ocene  {
  private int [] ocene;
  private int steviloOcen;

  private String status; // status studenta (Odličen / Dober)

  Ocene() {
    ocene = new int[100];
    steviloOcen = 0;
    status = "?";
  }

  public String getStatus() {
    return status;
  }

  private void osveziStatus() {
    int vsota = 0;
    for (int i = 0; i < steviloOcen; i++) {
      vsota += ocene[i];
    }
    double povprecje = (steviloOcen != 0 ? 1.0 * vsota / steviloOcen : 0);
    status = povprecje >= 9 ? "Odličen" : "Dober";
  }

  public void dodajOceno(int ocena) {
    ocene[steviloOcen++] = ocena;
    osveziStatus();
  }

}
