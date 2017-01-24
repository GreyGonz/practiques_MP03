/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int pesPizza;
        int comptador=0;
        int suma=0;
        int min=0;
        int max=0;
        
        while (true) {
            System.out.println("Introdueix el pes de la pizza " + (comptador + 1) + ":");
            pesPizza = entry.nextInt();
            if (pesPizza < 0) {
                System.out.println("Error: 01 (valor negatiu) :( \n" + "Has introduït un pes invàlid, introdueix un valor correcte");
            } else {
                if (pesPizza == 0) {
                    break;
                }
                suma += pesPizza;
                if (max < pesPizza) {
                    max = pesPizza;
                }
                if (min > pesPizza || min == 0) {
                    min = pesPizza;
                }
                comptador++;
            }
        }
        System.out.println("S'ha introduït el pes de " + comptador + " pizzes");
        System.out.println("La suma total dels pesos és: " + suma);
        System.out.println("La mitjana dels pesos és: " + (suma / comptador));
        System.out.println("El pes minim introduït és: " + min);
        System.out.println("El pes maxim intoduït és: " + max);
        
    }
    
}
