/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10_bis;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex10_bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int n, mitjana, sum = 0;
                
        System.out.println("Amb quants nombres vols operar? ");
        n = entry.nextInt();
        
        int array[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("introdueix el nombre (" + (i+1) + "/" + n + ")");
            array[i] = entry.nextInt();
            sum += array[i];
        }
        
        mitjana = sum / n;
        System.out.println("La mitjana és " + mitjana);
        System.out.println("Els nombres més grans que la mitjana són: ");
        
        for (int i = 0; i < n; i++){
            if (array[i] > mitjana) {
                System.out.println(array[i]);
            }
        }
    }
    
}
