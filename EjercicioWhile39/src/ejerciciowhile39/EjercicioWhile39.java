/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile39;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioWhile39 {

    /**
     * @param args the command line arguments
     * 39- Pedir 10 números e informar cuantos pares ingresaron.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        int numero=0;
        int contador=0;
        int acumulador=0;
        int contadorPares=0;
      
        while(contador<10)
            
        {
            contador++;
            System.out.println("Ingrese un numero..");
            numero= traerDato.nextInt();
            if (numero%2==0)
                contadorPares++;            
        }
             System.out.println("La cantidad de numeros pares es de--"+contadorPares);
           
            
        }
    
}
