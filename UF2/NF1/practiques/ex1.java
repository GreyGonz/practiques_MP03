// Exercici 1 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;
import java.util.Random;

public class ex1 {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int a;

    System.out.println("Escriu quants caràcters vols veure: ");
    a = entry.nextInt();

    for (int i = 0; i < a; i++) {
      System.out.format("%c", retornaCaracter());
    }

    System.out.println();
  }

  public static char retornaCaracter() {
    Random  r = new Random();
    char a;

    a = (char)(32 + r.nextInt(94));

    return a;
  }
}
