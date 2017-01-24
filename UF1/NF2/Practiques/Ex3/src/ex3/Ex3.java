/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Anys bixests
        Scanner entry = new Scanner(System.in);
        int any=0;
        
        while ( any == 0 || any < 1582) {
            if (any == 0) {
                System.out.println("Introdueix un any: ");
                any = entry.nextInt();
            } else {
                System.out.println("Error 01 :(" + "\n" + "L'any introduït ha estat: " + any + "\n" + "Introdueix un any posterior al 1582: ");
                any = entry.nextInt();
            }
            
        }
        
        System.out.println("L'any introduït és: " + any);
        
        if (any % 4 == 0 && !(any % 100 == 0) || any % 400 == 0) {
            System.out.println("Per tant L'ANY ÉS BIXEST!");
        } else {
            System.out.println("Per tant l'any no és bixest...");
        }
        
        
    }
    
}
