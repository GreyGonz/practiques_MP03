// Exercici 13 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex13 {
  public static void main(String[] args) {

    System.out.println(numVector(new int[] {-6,7}));

  }

  public static int numVector(int[] valor) {

    int resultat=0;
    int factor=1;

    boolean negatiu = (valor[0]<0);
    if(negatiu) valor[0] *= -1;

    for (int i = valor.length-1; i >= 0; i--) {
      resultat += valor[i] * factor;
      factor *= 10;
    }

    return resultat * (negatiu?-1:1);
  }
}
