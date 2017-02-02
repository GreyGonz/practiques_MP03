// Exercici 11 UF2 NF1
// Gerard Rey González
// Disseny Modular

public class ex11 {

  public static void main(String[] args) {

    System.out.println(buscaCadena(null,null,0));
    System.out.println(buscaCadena(null, "subcadena", 0));
    System.out.println(buscaCadena("textex",null,0));
    System.out.println(buscaCadena("textex","",-10));
    System.out.println(buscaCadena("textex","",0));
    System.out.println(buscaCadena("textex","",2));
    System.out.println(buscaCadena("","",20));
    System.out.println(buscaCadena("textex","ex",0));
    System.out.println(buscaCadena("textex","ex",2));
    System.out.println(buscaCadena("textex","ex", "texttex".length()));
    System.out.println(buscaCadena("textex", "", "texttex".length() + 10));

  }

  public static int buscaCadena(String cadena, String busq, int a) {

    // if (cadena==null || busq==null) return -1;
    // a = (a<0?0:a);
    // if (busq.length()==0) return (a<=cadena.length()?a:cadena.length());
    // if(a>=cadena.length()) return -1;
    //
    //
    // boolean trovat=true;
    // int i;
    // for (i = a; i < cadena.length(); i++) {
    //   for (int j = 0; j < busq.length(); j++) {
    //     if(cadena.charAt(i+j)==busq.charAt(j)) trovat = true;
    //     else trovat = false;
    //   }
    //   if(trovat) break;
    // }
    //
    // return (trovat?i:-2);

    // CORRECCIÓ

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
