// Exercici 21 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex17 {
  public static void main(String[] args) {

  }

  public static int[] tractaParametres(int... params) {

      if(params.length == 0) return null;

      int[] resultat = {0, params.length, 0, 0};

      int suma, maxim, minim;

      for (int i = 0; i < params.length-1; i++) {
        if (i==0) maxim = minim = suma = params[i];
        if (maxim>params[i]) maxim = params[i];
        if (minim<params[i]) minim = params[i];
        suma += params[i];
      }
  }
}
