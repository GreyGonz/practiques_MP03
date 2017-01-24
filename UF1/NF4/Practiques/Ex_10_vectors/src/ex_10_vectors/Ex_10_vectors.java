/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_10_vectors;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex_10_vectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int n, z, zu=0, c=0;
        int[] y;
        boolean u=false;
        
        
        do {
            System.out.format("introdueix un nombre: %n");
            n = entry.nextInt();
        } while (n==0);
        
        if (n < 0){
            zu = n;
            zu *= -1;
            System.out.println(zu);
            z = zu;
            u = true;
        } else z = n;
     
        do {
            z /= 10;
            c++;
        } while (z!=0);
        
        System.out.format("El nombre %d conté %d xifres%n", n, c);
        
        y = new int[c];
        if (u==true) z=zu; else z=n;
        
        do {
            y[--c] = z % 10;
            z /= 10;
        } while (z>0);
        
        
        //La sortida exacta del valor introduït:
        System.out.format("El vector és:%n");
        for (int i = 0; i < y.length; i++) {
            if (u==true && i == 0) {
                System.out.format("%s",y[i]*-1);
            } else {
                System.out.format("%s",y[i]);
            }
        }
       
        // La sortida que demana l'exercici:
        if (u) {
            System.out.format("%nEl vector és:%n");
            for (int i = 0; i < y.length; i++) System.out.println(y[i]*-1); 
        }
        
        System.out.format("%n");
        
    }
        
}
