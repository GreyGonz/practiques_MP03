/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex14;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static boolean valid;
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int dia, mes, any;
        boolean bixest;
        
        System.out.println("Introdueix un dia de l'any: ");
        dia = entry.nextInt();
        
        System.out.println("Introdueix un mes de l'any: ");
        mes = entry.nextInt();
        
        System.out.println("Introdueix un any: ");
        any = entry.nextInt();
        
        if (any % 4 == 0 && !(any % 100 == 0) || any % 400 == 0) {
            //System.out.println("L'any és bixest");
            bixest = true;
        } else {
            //System.out.println("L'any no és bixest");
            bixest = false;
        }
        
        switch(mes) {
            case 1: mesos31(dia); break;
            case 2: febrer(dia,bixest); break;
            case 3: mesos31(dia); break;
            case 4: mesos30(dia); break;
            case 5: mesos31(dia); break;
            case 6: mesos30(dia); break;
            case 7: mesos31(dia); break;
            case 8: mesos31(dia); break;
            case 9: mesos30(dia); break;
            case 10: mesos31(dia); break;
            case 11: mesos30(dia); break;
            case 12: mesos31(dia); break;
            default: System.out.println("El més introduït no és vàlid!"); valid = false; break;
        }
        
        if (valid == true) {
            System.out.println("La data és vàlida!");
        } else {
            System.out.println("La data no és vàlida!");
        }
        
    }    
    
    public static void mesos31(int dia){
        if (dia <= 0 || dia > 31) {
            //System.out.println("El dia del mes no és vàlid!");
            valid = false;
        } else {
            //System.out.println("El dia del mes és vàlid!");
            valid = true;            
        }
        return;
    }
    
    public static void mesos30(int dia){
        if (dia <= 0 || dia > 30) {
            //System.out.println("El dia del mes no és vàlid!");
            valid = false;
        } else {
            //System.out.println("El dia del mes és vàlid!");
            valid = true;
        }
    }
    
    public static void febrer(int dia, boolean bixest) {
        if (bixest == true && (dia <= 0 || dia > 29)) {
            //System.out.println("El dia del mes no és vàlid!");
            valid = false;
        } else {
            //System.out.println("El dia del mes és vàlid!");
            valid = true;
        }
        if (bixest == false && (dia <= 0 || dia > 28)) {
            //System.out.println("El dia del mes no és vàlid!");
            valid = false;
        } else {
            //System.out.println("El dia del mes és vàlid!");
            valid = true;
        }
    }
        
}
