// Exercici 3a UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex3a {

  //Les variables en majuscules solen ser constantns
  public static final int P=0;
  public static final int F=20;

  public static void main(String[] args) {
    int a, b;

    a = demanaValor("\nIntrodueix el primer nombre un nombre entre %s i %s\n");
    b = demanaValor("\nIntrodueix el segon nombre un nombre entre %s i %s\n");

    System.out.format("\nEl valor de la suma entre %s i %s = %s\n", a, b, a+b);
  }

  public static int demanaValor(String pregunta) {
    Scanner entry = new Scanner(System.in);
    int valor;

    do {
      System.out.format(pregunta, P, F);
      valor = entry.nextInt();
    } while(valor<P||valor>=F);

    return valor;
  }


}
