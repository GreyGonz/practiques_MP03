/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author alumne
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Nombres enters entre -50 i 50
        for (int valor = -50; valor <= 50; valor++) {
            if (valor % 2 == 0) {
                System.out.println(valor + " és parell");
            } else {
                System.out.println(valor + " és imparell");
            }
        }
    }
    
}
