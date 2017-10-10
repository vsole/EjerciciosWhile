/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile37;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioWhile37 {

    /**
     * @param args the command line arguments
     * 37- Mostrar todos los números Impares del 1 al 100.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        int contador=0;
          
        
        while(contador<100)
        {
        contador++;
            if (contador%2!=0) 
               System.out.println("numero impar"+contador);
        }
    }
}
           /* int contador = 0;
           //int incremento = 1;
 
           //while (contador !=100) {		  
           if (esImpar(incremento)) {
           System.out.println(incremento);
           contador++;
            }			
           incremento++;
           OTRA MANERA DE HACER EL CONTADOR Y MOSTARR NUM IMPARES/*

}
            
        }
    }
    

