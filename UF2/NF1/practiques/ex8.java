
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

  public static int vectorDigits(int valor) {

      String 
      int comp = String.valueOf(valor).length();
      for (int i = 0; i < comp; i++) {
        a[i] = String.valueOf(valor).substring(0,i);
        if (a[i] equal("-")) i--;
      }

      return 0;
  }
}
