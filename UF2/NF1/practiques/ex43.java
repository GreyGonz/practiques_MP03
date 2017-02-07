// Exercici 45 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex43 {

  public static void main(String[] args) {

    System.out.println(buscaParaula("la lola lava la lana","la",0));

  }

  public static int buscaParaula(String text, String paraula, int valor) {
    String separadors = ",.';:-";

    if (text==null && paraula==null || text==null || valor>=text.length()) return -1;
    valor = (valor<0?0:valor);
    if (paraula==null) return (text.length()>valor?valor:text.length());

    for (int k = 0; k < text.length(); k++) {
      if (text.contains(separadors)) {
        System.out.println(text.charAt(k));
      }
    }

    return -1;
  }

}
