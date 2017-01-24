/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_11_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex_11_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        String linia, text="", textVer="", textRev="";
        String sep=" .,\n\':";
        int compVer, compRev;
        boolean palindrom=true;
        
        System.out.println("Introdueix un text acabat en punt: ");
        do {
            
            do {
                linia = entry.nextLine();
            } while (linia.isEmpty());
            
            text += "\n" + linia;
            
        } while (!linia.endsWith("."));
        
        compVer = 0;
        compRev = text.length()-1;
        
        while (compVer < compRev) {
            
            while(sep.contains(String.valueOf(text.charAt(compVer)))) {
                compVer++;
            }
            
            while(sep.contains(String.valueOf(text.charAt(compRev)))) {
                compRev--;
            }
            
            if (text.charAt(compVer) == text.charAt(compRev)) {
                compVer++;
                compRev--;
            } else {
                palindrom=false;
                break;
            }
            
        }
        
        if(!palindrom) {
            System.out.println("No és palindrom");
        } else {
            System.out.println("És palindrom");
        }
    }
    
}
