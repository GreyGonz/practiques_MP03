// Exercici 6 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex6 {

  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int prim;

    System.out.println("Insereix el nombre a probar: ");
    prim = entry.nextInt();

    if (primer(prim)==true) System.out.format("\nEl nombre %s és primer\n", prim);
    else System.out.format("\nEl nombre %s no és primer\n", prim);

  }

  public static boolean primer(int prim) {
    boolean primer=true;

    for (int i = 2; i < prim-1; i++) {
      if (prim%i==0) primer=false;
    }

    return primer;
  }
}
