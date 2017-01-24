/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex20;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int diaN, mesN, anyN, diaA, mesA, anyA, anys;
        
        diaA = LocalDateTime.now().getDayOfMonth();
        mesA = LocalDateTime.now().getMonthValue();
        anyA = LocalDateTime.now().getYear();
        
        System.out.println("dia " + diaA + " mes " + mesA + " any " + anyA);
        System.out.println("Introdueix la teva data de naixement(dia, mes, any): ");
        diaN = entry.nextInt();
        mesN = entry.nextInt();
        anyN = entry.nextInt();
        
        anys = anyA - anyN;
//        System.out.println(anys);
        
        if (anys > 18 || (anys == 18 && mesN == mesA && diaN <= diaA) || (anys == 18 && mesN < mesA)) {
            System.out.println("Ets major d'edat!");
        } else {
            System.out.println("No ets major d'edat...");
        }
        
        
        
    }
    
}
