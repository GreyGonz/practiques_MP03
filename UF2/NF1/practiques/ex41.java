
import llibreries.Numeros;

public class ex41 {

  public static void main(String[] args) {
    System.out.println("1-2-1998 i 23-2-1998 --> " + Numeros.diferenciaDies(1,2,1998,23,2,1998));
    System.out.println("1-2-1998 i 23-2-2017 --> " + Numeros.diferenciaDies(1,2,1998,23,2,2017));
    System.out.println("23-2-2017 i 1-2-1998 --> " + Numeros.diferenciaDies(23,2,2017,1,2,1998));
    System.out.println("1-2-1998 i 1-2-1998 --> " + Numeros.diferenciaDies(1,2,1998,1,2,1998));
  }
}
