/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex11;

import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author alumne
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double x;
        double exp;
        
        while(true) {
            System.out.println("Introdueix un valor: ");
            x = entry.nextDouble();
            if (x >= 0) {
                break;
            } else {
                System.out.println("Error 01: :( \n" + "El nombre introduït ha de ser positiu");
            }
        }
        for(int i = 0; i < 10; i++){
            exp=Math.pow(x, i+1);
            System.out.println("Potencia de " + x + " elevat a " + (i+1) + " : " + df.format(exp));
        }
    }
    
}
