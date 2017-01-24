/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex1 {

    /* prova */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Introdueix un nombre: ");
        valor1 = entry.nextInt();

        System.out.println("Introdueix el segon nombre: ");
        valor2 = entry.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1 + " és més gran que " + valor2);
        } else {
            System.out.println(valor2 + " és més gran que " + valor1);
        }

    }

}
