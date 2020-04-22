package predavanje10;

abstract class Stevilo {
  abstract double absolutnaVrednost();
}

class CeloStevilo extends Stevilo {
  int z;
  public CeloStevilo(int z) {
    this.z = z;
  }
  @Override
  double absolutnaVrednost() {
    return Math.abs(z);
  }

  @Override
  public String toString() {
    return Integer.toString(z);
  }
}

/**
 * @author tomaz
 **/
public class DN08 {
  public static void main(String[] args) {
    //Stevilo s = new Stevilo();
    //System.out.println(s.absolutnaVrednost());
  }
}
