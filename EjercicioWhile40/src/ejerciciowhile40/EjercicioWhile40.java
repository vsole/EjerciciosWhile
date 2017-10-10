/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile40;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioWhile40 {

    /**
     * @param args the command line arguments
     * 40- Pedir 10 números e informar cuantos negativos, positivos y ceros ingresaron.
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner traerDato=new Scanner(System.in);
    int numero=0;
    int contador=0;
    int acumulador=0;
    int contadorPositivo=0;
    int contadorNegativo=0;
    int contadorCeros=0;
    
    while(contador<10)
    {
    contador++;  
    System.out.println("Ingrese un numero:");
    numero= traerDato.nextInt();
    
    if(numero>0)
    {   
      contadorPositivo++;
    }
    if(numero<0)
    {
        
        contadorNegativo++;
    }
    if(numero==0)
    {
        
        contadorCeros++;
    }    
    }
    System.out.println("Ingreso --"+contadorPositivo+"-- numeros positivos"); 
    System.out.println("Ingreso --"+contadorNegativo+"-- numeros negativos");
    System.out.println("Ingreso --"+contadorCeros+"-- ceros.");
    }
}   
}
