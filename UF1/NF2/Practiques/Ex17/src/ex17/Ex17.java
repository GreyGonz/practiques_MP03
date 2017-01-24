/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int a, b, start, aux;
        char z;
        do {
            System.out.println("CALCULADORA \n");
            System.out.println("1. Fer operació");
            System.out.println("2. Sortir del programa \n");
            System.out.println("Elegeix una opció:");
            start = entry.nextInt();

            switch (start) {
                case 1:
                    System.out.println("Introdueix la operació (els valors separats per un intro): ");
                    a = entry.nextInt();
                    z = entry.next().charAt(0);
                    b = entry.nextInt();

                    switch (z) {
                        case '*': System.out.println("El resultat de la multiplicació és " + (a*b)); break;

                        case '/': System.out.println("El resultat de la divisió és " + (a/b)); break;

                        case '+': System.out.println("El resultat de la suma és " + (a+b)); break;

                        case '-': System.out.println("El resultat de la reste és " + (a-b)); break;

                        case '%': System.out.println("El residu és " + (a%b)); break; 

                        default: System.out.println("Error, no es reconeix el valor de la operació"); break;
                    }   break;             
                case 2:
                    System.exit(0); break;
            }
        } while (start == 1);
    }
}
