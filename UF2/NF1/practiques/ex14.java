// Exercici 14 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex14 {

  public static int[] vector = {2,3,4,5,6,7,8,8,12};

  public static void main(String[] args) {

    printVector();
    eliminaNoMultiples(2);
    printVector();


  }

  public static void eliminaNoMultiples(int a) {
      if (a!= 0) {

        System.out.format("\nS'ha introduit el valor \"%s\" com a paràmetre\n\n", a);

        int[] aux = new int[vector.length];

        int comp=0;
        for (int i = 0; i < vector.length; i++) {
          if(vector[i]%a == 0) {
            vector[comp] = vector[i];
            comp++;
          }
          if(i!=comp-1) vector[i] = -1;
        }

      } else {
        System.out.format("\nEl valor \"%s\" no és vàlid!\n", a);
      }
  }

  public static void printVector() {
    for (int i = 0; i < vector.length; i++) {
      System.out.format("%3s", vector[i]);
    }
    System.out.println("");
  }
}
