/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_11_vectors;

/**
 *
 * @author alumne
 */
public class Ex_11_vectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] p, ip;
        int par=0, ipar=0;
        p = new int[51];
        ip = new int[50];
        
        for (int i = -50; i <= 50; i++) {
            if (i%2==0) {
                System.out.format("%s és parell%n", i);
                p[par++]=i;
            } else {
                System.out.format("%s és imparell%n", i);
                ip[ipar++]=i;
            }
        }
        
        System.out.format("Parells: %n");
        for (int i = 0; i < p.length; i++) {
            System.out.format("%s ", p[i]);
        }
        
        System.out.format("%nImparells: %n");
        for (int i = 0; i < ip.length; i++) {
            System.out.format("%s ", ip[i]);
        }
        
        System.out.format("%n");
    }
    
}
