package predavenje03;

import java.util.Random;

public class Loto {

  // metoda izpise 7 nakljucnih števil iz za
  // izpolnjevanje loto listka (stevila med 1 in 36)
  public static void main(String[] args) {
    // ustvarim objekt rnd, ki ga bomn uporabljan za
    // ustvarjanje novih psevdo-naključnih števil
    Random rnd = new Random();

    // če želim, lahko podam seme; morda rojstni datum?
    rnd.setSeed(15051998);
    for (int i = 0; i < 7; i=i+1) {
      // z generatorjem ustvarim nakljucno stevilo od 0 do 35 ...
      int x = rnd.nextInt(36);
      // ... in mu prištejem 1, da dobim stevilo med 1 in 36
      x = x + 1;

      System.out.print(x + " ");
    }
    System.out.println();
  }
}
