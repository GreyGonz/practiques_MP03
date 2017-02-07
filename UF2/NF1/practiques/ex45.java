// Exercici 45 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex45 {

  static int parella;
  static int comp;

  public static void main(String[] args) {

    initComp();

    System.out.format("\nEscriu parelles d'enters(iguals o 0 per acabar): \n");
    do {
      getParella();
    } while (!getFinal());

    getResultat();

  }

  public static void initComp() {
    comp=0;
  }

  public static int getParella() {
    Scanner entry = new Scanner(System.in);

    do {
      parella = entry.nextInt();
      comp++;
    } while(parella>99 || parella<10);

    return parella;
  }

  public static boolean getFinal() {
    return (parella%10==0) || (parella%11==0);
  }

  public static void getResultat() {
    System.out.format("\nS'han introduït %s parelles en total\n", comp);
  }
}
