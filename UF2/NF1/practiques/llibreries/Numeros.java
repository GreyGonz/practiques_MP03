
package llibreries;

public class Numeros {

  public static boolean bixest(int any) {
    if(any<1584) return false;
    else {
      if (any%400==0 || (any%4==0 && any%100!=0)) return true;
      else return false;
    }
  }

  public static boolean data(int dia, int mes, int any) {
    int[] dies = {31,28,31,30,31,30,31,31,30,31,30,31};

    if (bixest(any)) dies[1] = 29;
    if (mes>12 || dia>dies[mes-1]) return false;
    else return true;

  }

  public static int[] diaSeguent(int dia, int mes, int any) {
    if(!data(dia,mes,any)) return null;

    if(data(dia+1,mes,any)) return new int[]{dia+1,mes,any};
    if(data(1,mes+1,any)) return new int[]{1,mes+1,any};
    return new int[]{1,1,any+1};
  }

  public static int comparaDates(int dia1, int mes1, int any1, int dia2, int mes2, int any2) {
    if (!data(dia1,mes1,any1) || !data(dia2,mes2,any2)) return -2;
    if (any1 > any2)return 1;
    else if (any1 < any2) return -1;
    else if (any1 == any2) {
      if (mes1 > mes2) return 1;
      else if (mes1 < mes2) return -1;
      else if (mes1 == mes2) {
        if (dia1 > dia2) return 1;
        else if (dia1 < dia2) return -1;
      }
    }
    return 0;
  }

}
