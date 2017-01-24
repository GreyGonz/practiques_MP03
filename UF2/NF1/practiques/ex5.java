// Exercici 5 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex5 {

  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int any;

    do {
      System.out.println("Insereix l'any a comprovar: ");
      any = entry.nextInt();
    } while (any<1);

    if (bixest(any)==true) System.out.format("\nL'any %s és bixest\n", any);
    else System.out.format("\nL'any %s no és bixest\n", any);

  }

  public static boolean bixest(int any) {
    boolean bixest;

    if (any%400==0 || any%4==0 && any%100!=0) bixest=true;
    else bixest=false;

    return bixest;
  }
}
