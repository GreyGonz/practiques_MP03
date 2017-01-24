/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex22;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int a;
        char sig;
        
        sig = '*';
        
        System.out.println("Introdueix un nombre enter positiu");
        a = entry.nextInt();
        
        for(int i = 0; i < a; i++){
            for(int j = 0; j < i; j++) {
                System.out.println(sig);
                sig = sig + '*';
            }
        }
    }
    
}
