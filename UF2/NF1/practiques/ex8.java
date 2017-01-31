// Exercici 8 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex8 {

  private static int[] a;

  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    int valor;

    System.out.println("introdueix un nombre");
    valor = entry.nextInt();

    vectorDigits(valor);

  }

  public static int[] vectorDigits(int valor) {

    // Inicialitza el vector amb el tamany del valor que li passem
    int[] resp = new int[(valor>=0?String.valueOf(valor).length():String.valueOf(valor).length()-1)];

    boolean neg = (valor<0); // Comprova si el valor es negatiu
    if(neg) valor *= -1; // en cas de que sigui negatiu el passa a positiu per a fer les operacions

    for (int i = resp.length-1; i >= 0; i--) { // Assigna els valors al vector de dreta a esquerra
      resp[i] = valor%10;
      valor /= 10;
    }

    if(neg) resp[0]*=-1; // Si el nombre era positiu passa la primera xifra a negatiu

    for (int i = 0; i < resp.length; i++) { // mostra el resultat
      System.out.format("%2s", resp[i]);
    }
    System.out.println();

    return resp;

  }
}
