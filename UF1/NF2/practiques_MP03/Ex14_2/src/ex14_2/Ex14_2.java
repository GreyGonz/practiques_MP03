/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14_2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex14_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int dia;
        int mes;
        int any;
        boolean bixest = false;
        
        System.out.println("Introdueix un dia: ");
        dia = entry.nextInt();
        
        System.out.println("Introdueix un mes: ");
        mes = entry.nextInt();
        
        System.out.println("Introdueix un any: ");
        any = entry.nextInt();
        
        if(any % 4 == 0 && !(any % 100 == 0) || any % 400 == 0) {
            //System.out.println("L'any és bixest");
            bixest = true;
        } 
        
        if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia < 31 && dia > 0)){
            System.out.println("La data és vàlida!");
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 30 && dia > 0)) {
            System.out.println("La data és vàlida!");
        } else if (mes == 2 && bixest == true && dia < 29 && dia > 0) {
            System.out.println("La data és vàlida!");
        } else if (mes == 2 && bixest == false && dia < 28 && dia > 0){
            System.out.println("La data és vàlida!");
        } else {
            System.out.println("La data no és vàlida!");
        }
        
    }
    
}
