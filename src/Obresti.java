/*
   Program Obresti izračuna in izpiše znesek na 
   bančnem računu po n letih, pri dani osnovni 
   glavnici G in obrestni meri p.
*/
public class Obresti {

  // Metoda main se izvrši ob klicu programa z ukazom
  //   java Obresti
  public static void main(String[] args) {
  
    // Najprej deklariramo štiri spremenljivke;
    // pri vsaki povemo njeno tip in ime  
    double p;  // obrestna mera
    int n;     // stevilo let
    double G;  // glavnica
    double Gn; // koncni znesek 
    
    // Nato spremenljivke inicializiramo (jim nastavimo vrednost).    
    p = 10;      // 10% obrestna mera
    n = 10;      // 10 let
    G = 1000;    // glavnica: 1000 EUR
    
    // Izračun končnega zneska; za izračun potence x^n 
    // uporabimo metodo Math.pow(x,n).
    Gn = G * Math.pow(1 + p/100, n); 
    
    // Izpis rezultata
    // Zanimivo: pri izpisu lahko "seštevamo" različne tipe
    // (v prvem izpisu, na primer, String in double); 
    // java bo double vrednost najprej pretvorila v String, 
    // nato bo seštela (združila) dva niza.
    System.out.println("Glavnica: " + G);
    System.out.println("Število let: " + n);
    System.out.println("Obrestna mera: " + p);
    System.out.println("Koncni znesek: " + Gn);  
  } 

}
