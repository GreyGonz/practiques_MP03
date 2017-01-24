/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex7_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        String linia, text="", textCanvi="";

        System.out.println("Introdueix un text acabat en punt: ");
        do {
            
            do {
                linia = entry.nextLine();
            } while (linia.isEmpty());
            
            text += "\n" + linia;
            
        } while (!linia.endsWith("."));
        
        for (int j = 0; j < text.length(); j++) {
            char c = text.charAt(j);
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            textCanvi += c;
        }
        
        System.out.println(textCanvi + "\n");
    }
    
}
