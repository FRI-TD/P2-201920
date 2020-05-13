package predavanje12;

/**
 * Razred Drzava hrani podatke o eni drzavi (kratica, glavno mesto in stevilo prebivalcev).
 * - Vsi atributi so privatni, zato imamo zanje getterje in setterje.
 * - Razred ima konstruktor, s katerim nastavimo vrednost vseh atributov
 * - Dodali smo še metodo toString za lep izpis.
 * @author tomaz
 **/
public class Drzava {
  private String kratica;
  private String glMesto;
  private int steviloPrebivalcev;

  public Drzava(String kratica, String glMesto, int steviloPrebivalcev) {
    this.kratica = kratica;
    this.glMesto = glMesto;
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  @Override
  public String toString() {
    return String.format("Drzava. %s, Glavno mesto: %s, Prebivalci. %d",
                          this.kratica, this.glMesto, this.steviloPrebivalcev);
  }

  public String getKratica() {
    return kratica;
  }

  public void setKratica(String kratica) {
    this.kratica = kratica;
  }

  public String getGlMesto() {
    return glMesto;
  }

  public void setGlMesto(String glMesto) {
    this.glMesto = glMesto;
  }

  public int getSteviloPrebivalcev() {
    return steviloPrebivalcev;
  }

  public void setSteviloPrebivalcev(int steviloPrebivalcev) {
    this.steviloPrebivalcev = steviloPrebivalcev;
  }
}
