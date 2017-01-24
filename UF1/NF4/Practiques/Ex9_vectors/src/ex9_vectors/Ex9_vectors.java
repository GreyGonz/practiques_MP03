/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9_vectors;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex9_vectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int n, z, c=0;
        
        
        do {
            System.out.format("introdueix un nombre: %n");
            n = entry.nextInt();
        } while (n<1);
        
        z = n;
        
        do {
            z /= 10;
            c++;
        } while (z!=0);
        
        
        int[] xifres = new int[c];
        
        for (int i = xifres.length-1; i < xifres.length; i++) {
            
        }
        
        System.out.format("El nombre %d conté %d xifres%n", n, c);
    }
    
}
