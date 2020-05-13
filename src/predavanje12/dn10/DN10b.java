package predavanje12.dn10;

public class DN10b {


  public static String[] dobiVseMoznosti(String tab){
    int dol = tab.length();
    int numberOfSubstrings = (dol*(dol+1))/2;
    String arr[] = new String[numberOfSubstrings];
    int stevec = 0;
    for (int i = 1; i <= dol; i++) {
      for (int j = 0; j <= dol-i; j++) {
        arr[stevec++] = tab.substring(j, j + i);
      }
    }

    return arr;

  }
  public static String dobiNajdalsiPodniz(String tabString[], String[] moznosti)
  {
    int n = tabString.length;

    String rezultat = "";

    for (int i = moznosti.length-1; i >= 0; i--) {

      int st = 1; //lahko je 1 ker od prvega substringa smo itak ze dobili vse moznosti
      for (st = 1; st < n; st++){
        if (tabString[st].contains(moznosti[i]) == false)
          break;
      }

      if (st == n){
        rezultat = moznosti[i];
        break;
      }
    }

    return rezultat;
  }

  public static void izpis(String[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String args[]){
    if(args.length == 1){
      System.out.println(args[0]);
    }else if(args.length >= 2){
      System.out.println(dobiNajdalsiPodniz(args,dobiVseMoznosti(args[0])));
    }
  }

}
