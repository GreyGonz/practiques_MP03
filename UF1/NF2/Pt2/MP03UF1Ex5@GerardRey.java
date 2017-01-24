/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int pesPizza;
        int comptador=0;
        
        while (true) {
            System.out.println("Introdueix el pes de la pizza " + (comptador + 1) + ":");
            pesPizza = entry.nextInt();
            if (pesPizza < 0) {
                System.out.println("Error: 01 (valor negatiu) :( \n" + "Has introduït un pes invàlid, introdueix un valor correcte");
            } else {
                if (pesPizza == 0) {
                    break;
                }
                comptador += 1;
            }
        }
        System.out.println("S'ha introduït el pes de " + comptador + " pizzes");
        
    }
    
}
