
package llibreries;
import java.lang.Math;


public class Numeros {

  public static int longitudNumero(int a) {
    int count=0;

    if (a < 0) {
      a *= -1;
    }

    while(a/10>0) {
      a = a/10;
      count++;
    }

    return count+1;
  }

  public static int revesNumero(int n) {
    int reves=0,count=0;
    if (longitudNumero(n)==1) return n;

    while(n!=0) {
      reves += n%10 * Math.pow(10,longitudNumero(n)-1);
      n /= 10;
    }

    return reves;
  }
}
