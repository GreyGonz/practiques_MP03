/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

import java.util.Scanner;
import java.text.DecimalFormat; //clase per a format decimal

/**
 *
 * @author alumne
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00"); //assignem el format decimal
        float radi;
        double perimetre;
        double area;
                
        while(true) {
            System.out.println("Introdueix el valor del radi: ");
            radi = entry.nextFloat();
            if (radi <= 0.0f) {
                System.out.println("Error: 01 :( (nombre negatiu) \n" + "No s'accepten nombres negatius, per favor introdueix un nombre valid");
            } else {
                break;
            }
        }
        
        //calcul de perimetre i area
        perimetre = 2*Math.PI*radi;
        area = Math.PI*radi*radi;
        
         //df.format(x) limita la sortida dels decimals amb el format que hem definit anteriorment
        System.out.println("El perímetre de la circumferència és: " + df.format(perimetre));
        System.out.println("L'area de la circumferència és: " + df.format(area));
    }
    
}
