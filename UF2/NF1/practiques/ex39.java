
import llibreries.Numeros;
import java.util.Scanner;

public class ex39 {
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

    int[] diaS = Numeros.diaSeguent(dia,mes,any);
    System.out.format("El dia següent és %s-%s-%s\n", diaS[0],diaS[1],diaS[2]);

  }
}
