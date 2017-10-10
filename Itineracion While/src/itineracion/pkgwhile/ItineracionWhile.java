/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itineracion.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class ItineracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        Integer miContador=0;
        
        while(miContador<3)
        {   
            miContador=miContador+1;
            System.out.println("Contando");
        }
        
        System.out.println("Terminé");
        
    }
    
}
