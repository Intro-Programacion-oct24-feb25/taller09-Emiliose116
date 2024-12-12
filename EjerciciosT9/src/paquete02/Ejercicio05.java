/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] ventas = new double [5]; 
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
      
        for(int i = 0; i < dias.length; i++){
            System.out.printf("ingresar el valor de las ventas del dia %s\n",dias[i]);
            double venta = entrada.nextDouble();
            ventas[i] = venta;
                           
        }
        for(int i = 0; i < dias.length; i++){
            System.out.printf("%s $%.2f\n", dias[i], ventas[i]);        
                
        }   
    }

}
