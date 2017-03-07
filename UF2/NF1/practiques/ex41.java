
import llibreries.Dates;

public class ex41 {

  public static void main(String[] args) {
    System.out.println("1-2-1998 i 23-2-1998 --> " + Dates.diferenciaDies(1,2,1998,23,2,1998));
    System.out.println("1-2-1998 i 23-2-2017 --> " + Dates.diferenciaDies(1,2,1998,23,2,2017));
    System.out.println("23-2-2017 i 1-2-1998 --> " + Dates.diferenciaDies(23,2,2017,1,2,1998));
    System.out.println("1-2-1998 i 1-2-1998 --> " + Dates.diferenciaDies(1,2,1998,1,2,1998));
    System.out.println("22-1-1998 i 7-3-2017 --> " + Dates.diferenciaDies(22,1,1998,7,3,2017));
  }
}
