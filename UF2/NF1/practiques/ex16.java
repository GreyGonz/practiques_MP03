// Exercici 16 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex16 {

  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);

    String text, subcadena, result;
    int pos;

    System.out.format("Introdueix un text:\n");
    text = e.nextLine().trim();

    System.out.format("Escriu una cadena a buscar dins el text:\n");
    subcadena = e.nextLine().trim();

    System.out.format("Escriu la pos del text per on es vol començar a buscar:\n");
    pos = e.nextInt();
    //
    // text = "textexans";
    // subcadena = "ex";
    // pos = 0;
    //
    do {
      result = eliminaCadena(text,subcadena,pos);
      text = result;
    } while (buscaCadena(text,subcadena,pos)!=-1);

    System.out.format("\nEl resultat és: %s\n", result);
  }

  public static String eliminaCadena(String text, String subcadena, int pos) {
    int posSub;
    String aux="";
    posSub = buscaCadena(text,subcadena,pos);

    if (posSub != -1) {
        aux = text.substring(0,posSub) + text.substring(posSub+subcadena.length(),text.length());
        return aux;
    } else return text;

  }

  public static int buscaCadena(String cadena, String busq, int a) {
    if (cadena==null || busq==null) return -1;
    a = (a<0?0:a);
    if (busq.length()==0) return (a<=cadena.length()?a:cadena.length());
    if(a>=cadena.length()) return -1;


    boolean trobat=false;
    int i;
    for (i = a; i < cadena.length() && !trobat; i++) {
      int j;
      for (j = 0; j < busq.length() && cadena.charAt(i+j)==busq.charAt(j); j++);
      if(j==busq.length()) {
        trobat = true;
        break;
      }
    }

    return (trobat?i:-1);
  }
}
