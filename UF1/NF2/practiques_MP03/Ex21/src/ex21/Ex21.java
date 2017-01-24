/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex21;

import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entry = new Scanner(System.in);
        int diaN, mesN, anyN, diaA, mesA, anyA, anys;
        boolean bixest=false, valida;
        
        diaA = LocalDateTime.now().getDayOfMonth();
        mesA = LocalDateTime.now().getMonthValue();
        anyA = LocalDateTime.now().getYear();
        
        do {
            valida=true;
            
            System.out.println("La data actual és " + diaA + "/" + mesA + "/" + anyA);
            System.out.println("Introdueix la teva data de naixement(dia, mes, any): ");
            diaN = entry.nextInt();
            mesN = entry.nextInt();
            anyN = entry.nextInt();

            if(anyN % 4 == 0 && !(anyN % 100 == 0) || anyN % 400 == 0) {
                //System.out.println("L'any és bixest");
                bixest = true;
            }

            if((mesN == 1 || mesN == 3 || mesN == 5 || mesN == 7 || mesN == 8 || mesN == 10 || mesN == 12) && (diaN < 31 && diaN > 0)){
                System.out.println("La data és vàlida!"); 
            } else if ((mesN == 4 || mesN == 6 || mesN == 9 || mesN == 11) && (diaN < 30 && diaN > 0)) {
                System.out.println("La data és vàlida!"); 
            } else if (mesN == 2 && bixest == true && diaN < 29 && diaN > 0) {
                System.out.println("La data és vàlida!"); 
            } else if (mesN == 2 && bixest == false && diaN < 28 && diaN > 0){
                System.out.println("La data és vàlida!"); 
            } else {
                System.out.println("La data no és vàlida!"); valida=false;
            }
        } while (valida==false);
        
        anys = anyA - anyN;
//        System.out.println(anys);
        
        if (anys > 18 || (anys == 18 && mesN == mesA && diaN <= diaA) || (anys == 18 && mesN < mesA)) {
            System.out.println("Ets major d'edat!");
        } else {
            System.out.println("No ets major d'edat...");
        }
    }
    
}
