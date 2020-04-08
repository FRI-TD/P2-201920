package predavanje08;

/**
 * @author tomaz
 **/
public class IzpisFakultete {

  int f(int n) {
    if (n==1) return 1;
    return n*f(n-1);
  }

  public static void main(String[] args) {
    IzpisFakultete izpisF = new IzpisFakultete();

    int f1 = izpisF.f(10);
    System.out.println(f1);
  }
}
