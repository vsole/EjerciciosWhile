/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile43;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioWhile43 {

    /**
     * @param args the command line arguments
     * 43- Se piden los nombres de los alumnos, informar cuantas marías y 
     * cuantos José hay en el curso, además de cuantos alumnos hay.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        String nombre;
        String maria;
        String jose;
        int contador=0;
        int contMaria=0;
        int contJose=0;
        String respuesta="si";
        String respuestaNom;
        
        while(respuesta.equals("si"))
        { 
          //System.out.println("Ingrese el color de los vehiculos:");  
          contador++;
          System.out.println("Ingrese el nombre:");
          respuestaNom=traerDato.next();
          if(respuestaNom.equals("maria"))
          {
              contMaria++;
          }
          if(respuestaNom.equals("jose"))
          {
             contJose ++;
          }
          System.out.println("Desea seguir? si o no");
          respuesta=traerDato.next();
        }
        System.out.println("Cantidad de marias---"+contMaria);
        System.out.println("Cantidad de jose---"+contJose);
        System.out.println("Cantidad total de alumnos---"+contador);
       
            
            
        
    }
    
}
