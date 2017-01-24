/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_12_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex_12_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        String dni="", num="", l="TRWAGMYFPDXBNJZSQVHLCKE", n="0123456789";
        char lletra;
        boolean valid;
        
        do {
            
            valid = true;
            
            System.out.println("Introdueix el teu DNI: ");
            dni = entry.nextLine();
            
            for (int i = 0; i < dni.length()-1; i++) {
                if(!(n.contains(String.valueOf(dni.charAt(i)))) || dni.length() > 8 || !l.contains(String.valueOf(dni.charAt(8)))){
                    System.out.println("DNI incorrecte, un dni ha d'estar composat per 8 xifres i una lletra");
                    System.out.println("Introdueix un DNI vàlid: ");
                    valid=false;
                    break;
                }
                num += dni.charAt(i);
            }
            
        } while(!valid);
        
        lletra = dni.charAt(8);
        if(l.charAt(Integer.valueOf(dni)%23) == lletra){
            System.out.println("DNI correcte" + dni);
        }
    }
    
}
