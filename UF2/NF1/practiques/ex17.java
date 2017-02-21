// Exercici 17 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex17 {
  public static void main(String[] args) {
    int[] result = tractaParametres(1, 2, 3);
    if(result==null) System.out.println(result);
    else {
      for (int i = 0; i < result.length; i++) {
        System.out.println(result[i]);
      }
    }
    System.out.println("fi");
  }

  public static int[] tractaParametres(int... params) {

      if(params.length == 0) return null;

      int[] resultat = {0, params.length, 0, 0};

      int suma, maxim, minim;
      suma=maxim=minim=params[0];
      for (int i = 1; i < params.length; i++) {
        // if (i==0) maxim = minim = suma = params[i];
        if (maxim>params[i]) maxim = params[i];
        if (minim<params[i]) minim = params[i];
        suma += params[i];
      }

      resultat[0] = suma;
      resultat[2] = maxim;
      resultat[3] = minim;

      return resultat;
  }
}
