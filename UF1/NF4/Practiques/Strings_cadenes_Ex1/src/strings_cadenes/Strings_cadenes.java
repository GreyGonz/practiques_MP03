/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Strings_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner entry = new Scanner(System.in);
//        String s;
//        String text;
//        char c;
//        int counter=0;
//        
//        System.out.println("Introdueix un caràcter a cercar dins el text: ");
//        c = entry.next().charAt(0);
//        System.out.println("Introdueix un text: (escriu \".\" per acabar) ");
//        do {
//            s = null;
//            do {
//                s = entry.nextLine();
//            } while(s.isEmpty());
//
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == c) counter++;
//            }  
//        } while(!s.contains("."));
//        
//        System.out.format("El text introduït conté %s vegades la lletra %s \n", counter, c);
        
        Scanner entry = new Scanner(System.in);
        String s;
        String text;
        char c;
        int counter=0, v;
        
        System.out.println("Introdueix un caràcter a cercar dins el text: ");
        c = entry.next().charAt(0);
        System.out.println("Introdueix un text: (escriu \".\" per acabar) ");
        do {
            s = null;
            do {
                s = entry.nextLine();
            } while(s.isEmpty());

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) counter++;
            }  
            
        } while(s.charAt(s.length()-1) != '.' && !s.isEmpty());
        
        System.out.format("El text introduït conté %s vegades el caràcter \"%s\" \n", counter, c);
    }
    
}
