/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int a=1;
        int b=2;
        int suma=0;
        int producte=0;
        int comptador=0;
        
        while(!(a == b && a == 0 && b == 0)) {
            System.out.println("Introdueix la parella " + (comptador + 1) + ":");
            a = entry.nextInt();
            b = entry.nextInt();
            if (a != 0) {
                producte *= a;
                comptador++;
                suma += a;
            }
            if (b != 0){
                producte *= b;
                comptador++;
                suma += b;
            }
        }
        
        // System.out.println(comptador);
        if (suma == 0) {
            System.out.println("No s'ha introduït cap valor.");
        } else {
            System.out.println("La suma total dels nombres introduïts és " + suma);
            System.out.println("La mitjana dels nombres introduïts és " + ((double)suma/comptador));

        }
    }
    
}
