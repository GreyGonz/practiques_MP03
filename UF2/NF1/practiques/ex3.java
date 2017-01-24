// Exercici 2 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    int alumne, mp, nota;
    int F, C, P;
    F=C=P=20;

    alumne = demanaValor("\nIntrodueix l'alumne a consultar(0-%d):\n", F);

    mp = demanaValor("\nIntrodueix el mòdul a consultar(0-%d):\n", C);

    nota = demanaValor("\nIntrodueix la nota a consultar(0-%d):\n", P);

    System.out.format("\nAlumne: %s\n", alumne);
    System.out.format("\nModul: %s\n", mp);
    System.out.format("\nNota: %s\n", nota);
  }

  public static int demanaValor(String pregunta, int max) {
    Scanner entry = new Scanner(System.in);
    int valor;

    do {
      System.out.format(pregunta, max-1);
      valor = entry.nextInt();
    } while(valor<0||valor>=max);

    return valor;
  }


}
