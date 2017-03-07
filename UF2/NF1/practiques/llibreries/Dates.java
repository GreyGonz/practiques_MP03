
package llibreries;

public class Dates {

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

  public static int diferenciaDies(int dia1, int mes1, int any1, int dia2, int mes2, int any2) {
    int count = 0;
    int dia,mes,any;
    int[] data1 = new int[3];
    int[] data2 = new int[3];

    if (!data(dia1,mes1,any1) || !data(dia2,mes2,any2)) return -1;

    if (comparaDates(dia1,mes1,any1,dia2,mes2,any2)==0) return 0;

    if (comparaDates(dia1,mes1,any1,dia2,mes2,any2)==1) {
      int temp=0;
      temp = dia1;
      dia1 = dia2;
      dia2 = temp;
      temp = mes1;
      mes1 = mes2;
      mes2 = temp;
      temp = any1;
      any1 = any2;
      any2 = temp;
    }

    do {
      int[] data = diaSeguent(dia1,mes1,any1);
      dia1 = data[0];
      mes1 = data[1];
      any1 = data[2];
      count++;
    } while (comparaDates(dia1,mes1,any1,dia2,mes2,any2)!=0);

    return count;
  }

}
