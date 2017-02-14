// Exercici 44 UF2 NF1
// Gerard Rey González
// Disseny Modular

import java.util.Scanner;

public class ex44 {

  private static String frase;
  private static String paraula;
  private static int posicio;
  private static int compt;

  public static void main(String[] args) {

    inicialitzaVariables();

    do {
      tractarElement();
    } while (!paraulaFinal());
    tractamentFinal();

  }

  public static void inicialitzaVariables() {
    Scanner e = new Scanner(System.in);
    String[] paraules;

    // Demana valors
    System.out.println("Text: ");
    do {
      frase += e.nextLine();
      if (!(frase.endsWith("."))) frase += "\n";
    } while (frase.isEmpty() || !(frase.endsWith(".")));

    System.out.println("Paraula: ");
    do {
      paraula = e.nextLine().trim();
      paraules = paraula.split(" -");
    } while (paraula.isEmpty() || !(paraules.length==1));


    // Inicialitza vars
    posicio = compt = 0;
  }

  public static void tractarElement() {

    int aparicio=buscaParaula(frase,paraula,posicio);

    if (aparicio>=0) {
      compt++;
      posicio = aparicio+1;
    } else {
      posicio=-1;
    }
  }

  public static boolean paraulaFinal() {
    return posicio==-1;
  }

  public static void tractamentFinal() {
    System.out.format("La paraula %s paraeix %d vegades.\n", paraula, compt);
  }

  public static int buscaParaula(String text, String paraula, int valor) {
    String separadors = " ,.';:-";
    boolean trob=false;

    if (text==null && paraula==null || text==null || valor>=text.length()) return -1;
    valor = (valor<0?0:valor);
    if (paraula==null) return (text.length()>valor?valor:text.length());

    for (int k = valor; k < text.length(); k++) {
      if (text.charAt(k)==paraula.charAt(0)) {
        for (int j = 0; j < paraula.length() && paraula.charAt(j)==text.charAt(k+j); j++) {
          if (j == paraula.length()-1) trob = true;
          if (trob==true && (k+paraula.length())<text.length() && separadors.contains(String.valueOf(text.charAt(k+paraula.length())))) {
            if (k == 0) {
              return k;
            } else if (separadors.contains(String.valueOf(text.charAt(k-1)))) {
              return k;
            }
          }
        }
      }
    }

    return -1;
  }
}

// import java.util.Scanner;
//
// public class ex44 {
//
//   public static void main(String[] args) {
//     Scanner entry = new Scanner(System.in);
//     String text, paraula;
//
//     System.out.format("\nIntrodueix un text: ");
//     text = entry.nextLine();
//
//     System.out.format("\nIntrodueix la paraula a buscar: ");
//     paraula = entry.nextLine();
//
//     System.out.println(contaParaula(text,paraula));
//
//   }
//
//   public static int contaParaula(String text, String paraula) {
//     int valor, comp;
//     valor=comp=0;
//
//     while (valor < (text.length()-paraula.length())) {
//       valor = buscaParaula(text,paraula,valor);
//       System.out.println(valor);
//       if (valor==-1) {
//         System.out.println("No s'ha trobat la paraula");
//         return -1;
//       } else {
//         comp++;
//         valor += 1;
//       }
//     }
//
//     return comp;
//   }
//
//   public static int buscaParaula(String text, String paraula, int valor) {
//     String separadors = " ,.';:-";
//     boolean trob=false;
//
//     if (text==null && paraula==null || text==null || valor>=text.length()) return -1;
//     valor = (valor<0?0:valor);
//     if (paraula==null) return (text.length()>valor?valor:text.length());
//
//     for (int k = valor; k < text.length(); k++) {
//       if (text.charAt(k)==paraula.charAt(0)) {
//         for (int j = 0; j < paraula.length() && paraula.charAt(j)==text.charAt(k+j); j++) {
//           if (j == paraula.length()-1) trob = true;
//           if (trob==true && (k+paraula.length())<text.length() && separadors.contains(String.valueOf(text.charAt(k+paraula.length())))) {
//             if (k == 0) {
//               return k;
//             } else if (separadors.contains(String.valueOf(text.charAt(k-1)))) {
//               return k;
//             }
//           }
//         }
//       }
//     }
//
//     return -1;
//   }
//
// }
