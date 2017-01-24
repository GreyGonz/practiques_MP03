/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0, e = 0; 
        int comprovar = 0, mitjana;
        
        for (int i=0; i < 5; i++) {
            System.out.println("Introdueix els " + (5-i) + " valors: ");
            switch(i+1){
                case 1: a = entry.nextInt(); break;
                case 2: b = entry.nextInt(); break;
                case 3: c = entry.nextInt(); break;
                case 4: d = entry.nextInt(); break;
                case 5: e = entry.nextInt(); break;
                default: System.out.println("error 01"); break;
            }
           
        }
          
        mitjana = (a+b+c+d+e) / 5;
        System.out.println("La mitjana dels nombres és " + mitjana);
        System.out.println("Els valors més grans que la mitjana són: ");
        for (int i = 0; i < 5; i++) {
            switch(i+1){
                case 1: comprovar = a; break;
                case 2: comprovar = b; break;
                case 3: comprovar = c; break;
                case 4: comprovar = d; break;
                case 5: comprovar = e; break;
                default: System.out.println("error 02"); break;
            }
            if (comprovar > mitjana) {
                System.out.println(comprovar);
            }
        }
        
    }
    
}
