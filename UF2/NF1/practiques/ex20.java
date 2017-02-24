// Exercici 20 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex20 {

  public static void main(String[] args) {
    System.out.println(reemplassaMultiplesCaracters("textexans",'p','t','e','x'));
  }

  public static String reemplassaMultiplesCaracters(String text, char canvi, char... busq) {
    String result=text;

    if (result==null || result.isEmpty()) return result;
    for (int i = 0; i < result.length(); i++) {
      for (int j = 0; j < busq.length; j++) {
          if (i == 0 && result.charAt(0)==busq[j]) result = canvi + result.substring(1,result.length());
          if (result.charAt(i)==busq[j]) {
              result = result.substring(0,i) + canvi + result.substring(i+1,result.length());
          }
      }

    }
    return result;
  }
}
