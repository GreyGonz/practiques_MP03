/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author alumne
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        float a=0.0f;
        float b=0.0f;
        double hipotenusa;
        
        while(true){
            while(a <= 0.0f){
                System.out.println("Introdueix el valor del catet a: ");
                a = entry.nextFloat();
                if (a <= 0.0f) {
                    System.out.println("Error: 01 :( (valor negatiu) \n" + "No s'accepten nombres negatius, per favor introdueix un nombre valid");
                    a = 0.0f;
                } else {
                    break;
                }
            }
            while (b <= 0.0f) {
                System.out.println("Introdueix el valor del catet b: ");
                b = entry.nextFloat();
                if (b <= 0.0f) {
                    System.out.println("Error: 01 :( (valor negatiu) \n" + "No s'accepten nombres negatius, per favor introdueix un nombre valid");
                    b = 0.0f;
                } else {
                    break;
                }
            }
            if (a != 0.0f && b != 0.0f) {
                break;
            }
        }
        
        hipotenusa = Math.sqrt(a*a+b*b);
        System.out.println("El valor del catet a és " + a);
        System.out.println("El valor del catet b és " + b);
        System.out.println("El valor de la hipotenusa és " + df.format(hipotenusa));
    }
    
}
