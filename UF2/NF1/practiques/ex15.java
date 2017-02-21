// Exercici 15 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex15 {
  public static void main(String[] args) {
      int[] vector = {3,4,5,63,5,34,26,23,34,5,3,4,3};
      int a = 3;
      int[] result = eliminaNoMultiplesV2(vector, a);

      for (int i = 0; i < result.length; i++) {
        System.out.format("%3s", result[i]);
      }
      System.out.println("");
  }

  public static int[] eliminaNoMultiplesV2(int[] vector, int a) {
    int[] result = new int[vector.length];

    if (a!=0) {

        int comp=0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i]%a==0) {
              result[comp]=vector[i];
              comp++;
            }
            if(i!=comp-1) result[i]=-1;
        }
    } else {
      System.out.println("El valor " + a + " introduït no és vàlid");
    }
    return result;
  }
}
