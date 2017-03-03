// Exercici 33 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex33 {

  public static void main(String[] args) {
    System.out.println("(m = 7, n = 3) = " + nombreCombinatoriRec(7,3));
    System.out.println("(m = 0, n = 3) = " + nombreCombinatoriRec(0,3));
    System.out.println("(m = 7, n = 0) = " + nombreCombinatoriRec(7,0));
    System.out.println("(m = 7, n = 7) = " + nombreCombinatoriRec(7,7));
  }

  public static int nombreCombinatoriRec(int m, int n) {
  
    if (m==n || n==0) return 1;
    if (m<n) return -1;

    return nombreCombinatoriRec(m-1,n-1) + nombreCombinatoriRec(m-1,n);
  }
}
