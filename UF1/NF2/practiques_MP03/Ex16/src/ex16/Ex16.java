/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int a, b;
        char z;
        
        System.out.println("Introdueix els valors a operar: ): ");
        a = entry.nextInt();
        b = entry.nextInt();
        
        System.out.println("Quin tipus d'operació vols realitzar? (+, -, *, /, %)");
        z = entry.next().charAt(0);
        
 
        switch (z) {
            case '*': System.out.println("El resultat de la multiplicació és " + (a*b)); break;

            case '/': System.out.println("El resultat de la divisió és " + (a/b)); break;

            case '+': System.out.println("El resultat de la suma és " + (a+b)); break;

            case '-': System.out.println("El resultat de la reste és " + (a-b)); break;

            case '%': System.out.println("El residu és " + (a%b)); break; 

            default: System.out.println("Error, no es reconeix el valor de la operació"); break;
            }
    }   
    
}
