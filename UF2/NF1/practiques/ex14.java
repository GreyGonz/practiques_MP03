// Exercici 14 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex14 {

  public static int[] vector = {2,3,4,5,6,7,8,8,12};

  public static void main(String[] args) {
    eliminaNoMultiples(3);

    for (int i = 0; i < vector.length; i++) {
      System.out.println(vector[i]);
    }
  }

  public static void eliminaNoMultiples(int a) {

      int[] aux = new int[vector.length];

      int comp=0;
      for (int i = 0; i < vector.length; i++) {
        if(vector[i]%a == 0) {
          vector[comp] = vector[i];
          comp++;
        } else {
          vector[i] = -1;
        }
      }

      for (int i = 0; i < vector.length; i++) {
        if (i>comp) {
          vector[i] = -1;
        }
      }
  }
}
