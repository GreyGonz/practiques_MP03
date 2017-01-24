/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex15;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        char a;
        
        System.out.println("Introdueix una lletra de l'abecedari:");
        a = entry.next().charAt(0);
        
        switch(a) {
            case 'a': 
            
            case 'e': 
            
            case 'i': 
            
            case 'o': 
            
            case 'u': System.out.println("És vocal!"); break;
            
            default: System.out.println("No és vocal..."); break;
        }
    }
    
}
