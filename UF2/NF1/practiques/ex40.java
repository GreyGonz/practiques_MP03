

import llibreries.Dates;

public class ex40 {

  public static void main(String[] args) {
    System.out.println("2-2-2016 o 3-2-2015 --> " + Dates.comparaDates(2,2,2016,3,2,2015));
    System.out.println("2-2-2016 o 2-2-2016 --> " + Dates.comparaDates(2,2,2016,2,2,2016));
    System.out.println("30-2-1999 o 30-3-2003 --> " + Dates.comparaDates(30,2,1999,30,3,2003));
  }

}
