/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_10_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex_10_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        String linia, text="", textVer="", textRev="";
        String sep=" .,\n\':";
  
        System.out.println("Introdueix un text acabat en punt: ");
        do {
            
            do {
                linia = entry.nextLine();
            } while (linia.isEmpty());
            
            text += "\n" + linia;
            
        } while (!linia.endsWith("."));
        
        for (int i = 0; i < text.length(); i++) {
            if (!sep.contains(String.valueOf(text.charAt(i)))) textVer += Character.toUpperCase(text.charAt(i));
        }
          
        for (int i = text.length()-1; i > 0; i--) {
            if (!sep.contains(String.valueOf(text.charAt(i)))) textRev += Character.toUpperCase(text.charAt(i));
        }
    
        if (!textVer.equals(textRev)) {
            System.out.format("El text %s\nno és palindrom \n%s\n%s\n", text, textVer,textRev);
        } else {
            System.out.format("El text %s\nés palindrom \n%s\n%s\n", text, textVer, textRev);
        }
    }
    
}
