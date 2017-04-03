
import java.util.Scanner;

public class ex4_exc {
  public static void main(String[] args) {
    Scanner e = new Scanner(System.in);
    String text = "Hola món";
    int pos;
    boolean valid;

    do {

      System.out.println("Introdueix una posició: ");

      try {
        pos = e.nextInt();
        System.out.println(text.charAt(pos));
        break;
      } catch(StringIndexOutOfBoundsException x) {
        System.out.println("Error: La posició indicada no és vàlida");
        e.next(); // evita que el programa entri en bucle
      } catch(java.util.InputMismatchException x) {
        System.out.println("Error: valor de la posició incorrecte. Introdueix un nombre correcte");
        e.next(); // evita que el programa entri en bucle
      }
    } while (true);

  }
}
