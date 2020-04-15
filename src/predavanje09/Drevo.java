package predavanje09;

/**
 * @author tomaz
 **/
public class Drevo extends Rastlina {
  // vse enako kot v Rastlina ...
  // ... razen tisto, kar bomo spremenili spodaj:

  int sirina; // sirina drevesa v cm

  @Override
  int mesecnaRast() {
    if (getStarost() < 24)
      return 5;
    else
      return 1;
  }

  @Override
  void izrisiSe() {
    System.out.println("DREVO - DN");
  }

  @Override
  void novMesec() {
    super.novMesec();

    sirina +=5;
  }

  @Override
  public String toString() {
    return "Drevo: " + imeRastline;
  }
}
