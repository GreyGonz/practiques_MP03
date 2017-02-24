// Exercici 19 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex19 {

  public static void main(String[] args) {
      System.out.println(reemplassaCaracters("textexans",'t','p'));
  }

  public static String reemplassaCaracters(String text, char busq, char canvi) {
    String result=text;

    if (result == null || result.isEmpty()) return text;
    for (int i = 0; i < result.length(); i++) {
        if (i == 0 && result.charAt(0)==busq) result = canvi + result.substring(1,result.length());
        if (result.charAt(i)==busq) {
          result = result.substring(0,i) + canvi + result.substring(i+1,result.length());
        }
    }

    return result;

  }
}
