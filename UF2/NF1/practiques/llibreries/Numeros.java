
package llibreries;
import java.lang.Math;


public class Numeros {

  public static int longitudNumero(int a) {
    int count=0;

    if (a < 0) {
      a *= -1;
    }

    while(a/10>0) {
      a = a/10;
      count++;
    }

    return count+1;
  }

  public static int revesNumero(int n) {
    int reves=0,count=0;
    if (longitudNumero(n)==1) return n;

    while(n!=0) {
      reves += n%10 * Math.pow(10,longitudNumero(n)-1);
      n /= 10;
    }

    return reves;
  }

  public static int revesNumeroV2(int n) {
    return numVector(girarVector(vectorDigits(n)));
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

    // for (int i = 0; i < resp.length; i++) { // mostra el resultat
    //   System.out.format("%2s", resp[i]);
    // }
    // System.out.println();

    return resp;

  }

  public static int[] girarVector(int[] vector) {
    int[] aux = new int[vector.length];

    boolean negatiu=vector[0]<0;

    if(negatiu) vector[0] *= -1;

    for (int i = 0, j=vector.length-1; i < vector.length; i++, j--) {
      aux[i] = vector[j];
    }

    if (negatiu) aux[0] *= -1;

    return aux;
  }

  public static int numVector(int[] vector) {
    int num=0,fi=vector.length-1;

    boolean negatiu=vector[0]<0;

    if (negatiu) vector[0] *= -1;

    for (int i = 0; i < vector.length; i++) {
      num += vector[i]*Math.pow(10,fi--);
    }

    if (negatiu) num *= -1;

    return num;
  }

}
