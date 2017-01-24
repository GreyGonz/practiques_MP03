/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex18;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int quantitat, max, min, aux, a, sum=0;
        char resp='y';
        boolean correcte=true;
        
        do {
            System.out.println("Introdueix una quantitat: ");
            quantitat = entry.nextInt();

            System.out.println("Introdueix el nombre mínim del rang: ");
            min = entry.nextInt();

            System.out.println("Introdueix el nombre màxim del rang: ");
            max = entry.nextInt();

            if (min > max) {
                System.out.println("El valor mínim introduït és més gran que el màxim. \n" + "Vols intercanviar els valors? [y/n] ");
                resp = entry.next().charAt(0);
                switch (resp) {
                    case 'y': aux = max; max = min; min = aux; correcte = true; break;
                    case 'n': correcte = false;
                }
            }
        } while (correcte==false);
        
        for (int i = 1; i < quantitat; i++) {
            System.out.println("Introdueix un valor enter(" + i + "/" + quantitat + "):");
            a = entry.nextInt();
            if (a >= min && a <= max) {
                sum++;
                System.out.println("El " + a + " es troba dins l'interval \n" + "Portes " + sum + " valors dins l'interval");
            }
        }
        
        System.out.println("S'han escrit un total de " + sum + " valors pertanyents a l'interval " + min + ":" + max);
    }
    
}
