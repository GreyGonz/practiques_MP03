/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex19;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int a, b, c, d, e, n, any;
        
        System.out.println("Introdueix un any: ");
        any = entry.nextInt();
        
        a = any % 19;
        b = any % 4;
        c = any % 7;
        d = (19 * a + 24) % 30;
        e = (2*b + 4*c + 6*d + 5) % 7;
        n = (22 + d + e);
        
        if (n <= 31) {
            System.out.println("El diumenge de pascua de " + any + " cau el " + n + " de març");
            
        } else {
            n -= 31;
            System.out.println("El diumenge de pascua de " + any + " cau el " + n + " d'abril");
        }
    }
    
}
