/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile41;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioWhile41 {

    /**
     * @param args the command line arguments
     * 41- Pedir un número y mostrar todos sus antecesores hasta el cero.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingrese un numero:");
        numero=traerDato.nextInt();
        
        int contador=numero;
        
        while(contador>0)
        {
            contador--;
            System.out.println("Todos sus antecesores son.."+contador);
        }
        //System.out.println("Todos sus antecesores son.."+contador);
    }
    
}
