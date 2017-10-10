/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciowhile42;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class EjercicioWhile42 {

    /**
     * @param args the command line arguments
     * 42- De un grupo de vehículos (no se sabe la cantidad) se necesita tomar
     * el color, informar cuantos rojo y cuantos azules, además del total de vehículos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner traerDato=new Scanner(System.in);
        
        String color;
        String azul = null, rojo = null;
        Integer aRojos;
        Integer aAuzules;
        String datoAux;
        int contador=0;
        int contadorAzul=0;
        int contadorRojo=0;
        String respuesta="si";
        String respuestaAuto;
        //int acumulador=0;
                
                
        while(respuesta.equals("si"))
        { 
          //System.out.println("Ingrese el color de los vehiculos:");  
          contador++;
          System.out.println("Ingrese el color del auto:");
          respuestaAuto=traerDato.next();
          if(respuestaAuto.equals("azul"))
          {
              contadorAzul++;
          }
          if(respuestaAuto.equals("rojo"))
          {
              contadorRojo++;
          }
          System.out.println("Desea seguir? si o no");
          respuesta=traerDato.next();
        }
        System.out.println("Cantidad de autos rojos---"+contadorRojo);
        System.out.println("Cantidad de autos azules---"+contadorAzul);
        System.out.println("Cantidad total de auots---"+contador);
        
    }
    
}
