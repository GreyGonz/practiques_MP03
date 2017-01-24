/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_12_vectors;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex_12_vectors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        float[] q, r;
        float res, rsult=1;
        int a, count=0, div, grandaria;
        
        do {
            System.out.format("Introdueix un enter major que 0:");
            a = entry.nextInt();
        } while (a<0);
        
        grandaria = Math.round((float)(Math.log(a)/Math.log(2)));
        q = new float[grandaria]; 
        r = new float[grandaria];
        
        r[0] = a;
        do {
            div=2; 
            do {
                q[count] = div;
                res = r[count]%q[count];
                div++;
            } while (res!=0.0f);
            r[count+1] = r[count]/q[count];
//            System.out.format("%s %s %s %s %n", r[count], q[count], div, res);
            count++;
        } while (r[count]!=1);
        
        
        for (int i = 0; i < q.length; i++) {
            if (q[i] == 0.0f && r[i] == 0.0f) break;
            System.out.format("%s", r[i]);
            System.out.format("  %s", q[i]);
            System.out.format("%n");    
        }
        
        System.out.println("\nEl resultat de la multiplicació dels factors és: ");
        for (int i = 0; i < q.length; i++) {
            if (q[i]==0.0f) break;
            System.out.format("%s ", q[i]);
            if (r[i+1]!=1)System.out.format("x ");
            rsult *= q[i];
        }
        System.out.println("= " + rsult);
    }
    
}
