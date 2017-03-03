// Exercici 38 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;
//Utilitzem la classe Data de la llibreria numeros.jar
import llibreries.Numeros;

public class ex38 {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    int any, mes, dia;

    System.out.format("\nIntrodueix una data: \n");
    System.out.format("Any: ");
    any = e.nextInt();
    System.out.format("\nMes: ");
    mes = e.nextInt();
    System.out.format("\nDia: ");
    dia = e.nextInt();

    if (Numeros.data(any,mes,dia)) System.out.format("\nLa data %s-%s-%s és correcta\n", dia, mes, any);
    else System.out.format("\nLa data %s-%s-%s és incorrecta\n", dia, mes, any);

  }

}
