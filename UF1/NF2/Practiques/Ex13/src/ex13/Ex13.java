/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int a = 0;
        int count = 0;
        
        while(a <= 0) {
            System.out.println("Introdueix un valor: ");
            a = entry.nextInt();
            if (a <= 0) {
                System.out.println("Error 01 :( \n" + "No s'accepten nombres negatius");
            }
        }
        
        for(int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        
        if(count == 2){
            System.out.println("El nombre " + a + " és un nombre primer");
        } else {
            System.out.println("El nombre " + a + " no és un nombre primer");
        }
    }
    
}
