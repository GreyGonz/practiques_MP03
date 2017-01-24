/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int a = 0;
        int count = 0;
        int suma = 0;
        
        while (a <= 1) {
            System.out.println("Introdueix el valor de l'enter: ");
            a = entry.nextInt();
        }
        
        for(int i = 1; i <= a; i++){
            if (a % i == 0){
                System.out.println(i);
                count++;
                suma += i;
            }         
        }
        
        suma -= a;
        
        System.out.println("End! " + a + " té " + count + " divisors possibles");
        if (suma == a) {
            System.out.println("El nombre és perfecte!");
        } else {
            System.out.println("No és perfecte");
        }
    }
    
}
  