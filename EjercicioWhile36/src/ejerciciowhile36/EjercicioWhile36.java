/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile36;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioWhile36 {

    /**
     * @param args the command line arguments
     * 36- Mostrar todos los números pares del 1 al 100.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        int contador;
        int numero1; 
        numero1 =0;
        contador=0;
        
        while(contador<100)
        {
            contador++;
            if (contador%2==0) 
               System.out.println("numero par"+contador);
            
    }
    

