/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex8_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        String linia, text="", textCanvi="";
        int a, e, i, o, u;
        a=e=i=o=u=0;
        System.out.println("Introdueix un text acabat en punt: ");
        do {
            
            do {
                linia = entry.nextLine();
            } while (linia.isEmpty());
            
            text += "\n" + linia;
            
        } while (!linia.endsWith("."));
        
        for (int j = text.length()-1; j > 0; j--) {
            switch (Character.toUpperCase(text.charAt(j))) {
                case 'A': a++; break;
                case 'E': e++; break;
                case 'I': i++; break;
                case 'O': o++; break;
                case 'U': u++; break;
            }
            textCanvi += text.charAt(j);
        }
        
        System.out.println("\n" + textCanvi + "\n");
        System.out.format("La lletra \'A\' apareix %s cops \n", a);
        System.out.format("La lletra \'E\' apareix %s cops \n", e);
        System.out.format("La lletra \'I\' apareix %s cops \n", i);
        System.out.format("La lletra \'O\' apareix %s cops \n", o);
        System.out.format("La lletra \'U\' apareix %s cops \n", u);
    }
    
}
