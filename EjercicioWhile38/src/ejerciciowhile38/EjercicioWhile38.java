/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile38;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioWhile38 {

    /**
     * @param args the command line arguments
     * 38- Mostrar la suma de los primeros 100 números naturales.
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        int contador=0;
        int acumulador=0;
        
        while(contador<100)
        {
            contador++;
            acumulador=acumulador+contador;
            //System.out.println("Suma de numeros naturales"+acumulador);  
        }    
        System.out.println("Suma de numeros naturales"+acumulador);    
        
    }
    
}
