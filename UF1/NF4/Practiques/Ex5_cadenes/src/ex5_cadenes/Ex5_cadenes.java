/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5_cadenes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex5_cadenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //---------------------
        // AMB indexOf()
        //---------------------
        
//        Scanner entry = new Scanner(System.in);
//        String linia, busq, text=null, textBusq;
//        int comp=0;
//        
//        System.out.println("Introdueix un text acabat en punt: (\'.\')");
//        do {
//            
//            do {
//                linia = entry.nextLine();
//            } while(linia.isEmpty());
//            
//            if (text==null) text = linia; else text += "\n" + linia; //text += "\n" + linia
//            
//        } while(!linia.endsWith("."));
//        
//        System.out.println("Introdueix un altre text per buscar al primer text: ");
//        do {
//           busq = entry.nextLine();
//        } while(busq.isEmpty());
//        
//        textBusq = text;
//        
//        while (textBusq.indexOf(busq) > -1) {
//            textBusq = textBusq.substring(textBusq.indexOf(busq)+busq.length(), textBusq.length());
//            comp++;
//        } 
//        
//        System.out.format("El text:\n\"%s\"\nconté el text \"%s\", %s vegades\n", text, busq, comp);

        //--------------------------
        // SENSE indexOf()
        //--------------------------
        
        Scanner entry = new Scanner(System.in);
        String linia, busq, text=null, textBusq;
        int comp=0;
        
        System.out.println("Introdueix un text acabat en punt: (\'.\')");
        do {
            
            do {
                linia = entry.nextLine();
            } while(linia.isEmpty());
            
            if (text==null) text = linia; else text += "\n" + linia; //text += "\n" + linia
            
        } while(!linia.endsWith("."));
        
        System.out.println("Introdueix un altre text per buscar al primer text: ");
        do {
           busq = entry.nextLine();
        } while(busq.isEmpty());
        
        textBusq = text;
        
        for (int i = 0; i < textBusq.length(); i++) {
            if(textBusq.charAt(i) == busq.charAt(0)) {
                int k = i; int j = 0;
                for (;j < busq.length() && k < textBusq.length() && textBusq.charAt(k) == busq.charAt(j); k++, j++);
                if(j == busq.length()) comp++;
            }
        }
        
        System.out.println(comp);
    }
    
}
