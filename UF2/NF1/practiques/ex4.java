// Exercici 2 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex4 {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    String a, b;
    int c;

    System.out.println("Insereix el primer String: ");
    a = entry.nextLine();

    System.out.println("Insereix el segon String: ");
    b = entry.nextLine();

    System.out.println("Insereix un nombre enter: ");
    c = entry.nextInt();

    System.out.println(insertaCadena(a,b,c));

    // System.out.println(insertaCadena(null,null,0));
    // System.out.println(insertaCadena(null,"algo",0));
    // System.out.println(insertaCadena("abans","algo",0));
    // System.out.println(insertaCadena("abans","algo",2));
    // System.out.println(insertaCadena("abans","algo",-34));
    // System.out.println(insertaCadena("abans","algo",5));
    // System.out.println(insertaCadena("abans","algo",10));
  }

  public static String insertaCadena(String a, String b, int c){
      String resp=null;

      if (a==null && b==null)  resp = null;
      if (a!=null && b!=null) {
        if (c>a.length()) c = a.length();
        if (c<0) c = 0;
        resp = a.substring(0,c) + b + a.substring(c,a.length());

      } else if (a!=null || b!=null) {
        if (a!=null) resp = a;
        if (b!=null) resp = b;
      }

      return resp;
  }


}
