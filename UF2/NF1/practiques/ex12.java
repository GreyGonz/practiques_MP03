// Exercici 12 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex12 {
  public static void main(String[] args) {
    Scanner entry = new Scanner(System.in);
    String text,subcadena;

    System.out.format("Introdueix un text: ");
    text = entry.nextLine();

    System.out.format("Introdueix els caràcters a buscar: ");
    subcadena = entry.nextLine();

    for (int i = 0; i < text.length(); i++) {

    }
  }

  public static int buscaCadena(String cadena, String busq, int a) {
    if (cadena==null || busq==null) return -1;
    a = (a<0?0:a);
    if (busq.length()==0) return (a<=cadena.length()?a:cadena.length());
    if(a>=cadena.length()) return -1;


    boolean trobat=false;
    int i;
    for (i = a; i < cadena.length() && !trobat; i++) {
      int j;
      for (j = 0; j < busq.length() && cadena.charAt(i+j)==busq.charAt(j); j++);
      if(j==busq.length()) {
        trobat = true;
        break;
      }
    }

    return (trobat?i:-1);
  }

}
