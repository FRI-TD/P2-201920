package predavanje12;

import java.io.Serializable;

/**
 * Razred Oseba hrani podatke o eni osebi (ime in starost).
 * - Za vse privatne atrubute (ima in starost) imamo getterje in setterje.
 * - metoda compareTo() omogoča urejanje seznama oseb (uredijo se glede na starost)
 * - metodi equals in hashCode omogočata primerjavo dveh oseb - osebi sta "enaki",
 *   če imata enako ime.
 *
 * @author tomaz
 **/
public class Oseba implements Comparable<Oseba>, Serializable {

  private String ime;
  private int starost;

  public Oseba(String ime, int starost) {
    this.ime = ime;
    this.starost = starost;
  }

  @Override
  public int compareTo(Oseba o) {
    // 0   ... če sta osebi enaki
    // <0  ... če prva (this) oseba manjša
    // >0  ... če prva oseba večja od druge (o)

    return this.starost - o.starost;
   }

  @Override
  public String toString() {
    return String.format("%s (%d let)", this.ime, this.starost);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Oseba)) return false;

    Oseba o = (Oseba) obj;
    return this.ime.equals(o.ime);
  }

  @Override
  public int hashCode() {
    return ime.hashCode();
  }

  public String getIme() {
    return ime;
  }

  public void setIme(String ime) {
    this.ime = ime;
  }

  public int getStarost() {
    return starost;
  }

  public void setStarost(int starost) {
    this.starost = starost;
  }
}
