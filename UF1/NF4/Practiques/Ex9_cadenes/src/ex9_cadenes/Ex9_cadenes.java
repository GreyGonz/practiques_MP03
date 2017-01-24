/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex9_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        String linia, text="", textNoSep="", textRev="";
        String sep=" .,\n\':";
  
        System.out.println("Introdueix un text acabat en punt: ");
        do {
            
            do {
                linia = entry.nextLine();
            } while (linia.isEmpty());
            
            text += "\n" + linia;
            
        } while (!linia.endsWith("."));
        
        for(int i = 0; i < text.length(); i++) {
            if (!sep.contains(String.valueOf(text.charAt(i)))) textNoSep += text.charAt(i);
        }
        
        System.out.format("El text sense separadors és: \n%s\n", textNoSep);
    
        for (int j = textNoSep.length()-1; j > 0; j--) {
            textRev += textNoSep.charAt(j);
        }
        
        System.out.format("El text al revés és: \n%s\n", textRev);
    }
    
}
