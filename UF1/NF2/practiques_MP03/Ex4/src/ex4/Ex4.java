/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //comptar anys tenint en compte els bixests (cada 1460 anys es suma 1)
        Scanner entry = new Scanner(System.in);
        int any1=1;
        int any2=0;
        int diferencia;
        int plusAnys=0;
        
        while (any1 > any2) {
            System.out.println("Introdueix 2 anys, el primer inferior o igual al segon: ");
            any1 = entry.nextInt();
            any2 = entry.nextInt();
        }
        
        diferencia = any2 - any1;
        //descomentar linia inferior per a comprovar valor
        //System.out.println(diferencia);
        
        if (diferencia >= 1460) {
            plusAnys = diferencia / 1460;
            diferencia += plusAnys;
        }
        
        System.out.println("Han passat " + diferencia + " anys entre l'any " + any1 + " i l'any " + any2);
        System.out.println("S'han sumat " + plusAnys + " anys");
    }
    
}
