// Exercici 2 UF2 NF1
// Gerard Rey González
// Disseny Modular


import java.util.Scanner;
import java.util.Random;

public class ex2 {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int a;
    do  {
      System.out.println("Introdueix quants caracters vols que es mostren(>=1): ");
      a = entry.nextInt();
    } while(a<1);

    System.out.println("Resultat de la execució: ");
    mostraVarisCaracters(a);
  }

  public static void mostraVarisCaracters(int i) {
    Random  r = new Random();
    char a;

    for (int j = 0; j < i; j++) {
      a = (char)(32 + r.nextInt(94));
      System.out.format("%c", a);
    }

    System.out.println();
  }


}

// CORRECIÓ (incomplert)

// import static ex1.retornaCaracter; //Funció que es crida desde l'exercici 1 (incomplert)
//
// public class ex2 {
//
//
//   public static void main(String[] args) {
//     Scanner entry = new Scanner(System.in);
//     int a;
//     do {
//       System.out.println("Introdueix quants caracters vols que es mostren(>=1): ");
//       a = entry.nextInt();
//     } while (a<1);
//
//     mostraVarisCaracters(a);
//   }
//
//   public static void mostraVarisCaracters(int i) {
//
//     for (int j = 0; j < i; j++) {
//       System.out.print(retornaCaracter());
//     }
//
//     System.out.println();
//   }
//
// }
