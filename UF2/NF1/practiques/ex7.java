// Exercici 7 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex7 {
  public static void main(String[] args) {
    // Scanner entry = new Scanner(System.in);
    // String text;
    // int a, b;
    //
    // System.out.println("Introdueix un text: ");
    // text = entry.nextLine();
    //
    // System.out.println("Introdueix un nombre: ");
    // a = entry.nextInt();
    //
    // System.out.println("Introdueix un segon nombre: ");
    // b = entry.nextInt();
    //
    // System.out.println(subcadena(text,a,b));

    System.out.println(subcadena(null,0,0));
    System.out.println(subcadena("text",0,-3));
    System.out.println(subcadena("text",0,0));
    System.out.println(subcadena("text",34,2));
    System.out.println(subcadena("text",0,4));
    System.out.println(subcadena("text",0,2));
    System.out.println(subcadena("text",-2,4));

  }

  public static String subcadena(String text, int a, int b) {
    String resp=null;

    if (text==null)  resp = null;
    else {
      if (a<0) a = 0;
      if (b>text.length()) b = text.length();
      if (b<=0 || a>=text.length() || a>=b) resp = "";
      else resp = text.substring(a,b);
    }

    return resp;
  }
}
