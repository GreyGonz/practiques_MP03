/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex6_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        String linia, text=null, separadors=" ,.\n\':";
        int comp=0;
        boolean enParaula = false;
        
        System.out.println("Introdueix un text acabat en punt: ");
        do {
            
            do {
                linia = entry.nextLine();
            } while (linia.isEmpty());
            
            if(text==null) text = linia; else text += "\n" + linia;
            
        } while (!linia.endsWith("."));
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(!enParaula) {
                if (!separadors.contains(c+"")) { //també podem utilitzar String.valveOf(c) en ves de c+""
                    enParaula = true;
                    comp++;
                }
            } else {
                if (separadors.contains(String.valueOf(c))) enParaula = false;
            }            
        }
    
        System.out.format("Hi ha %s paraules", comp);
    }
    
}
