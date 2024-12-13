/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int[] numeros = new int[10];
        int i;
        double suma = 0;
        double promedio;
        double diferencia;
        
        for(i = 0 ; i < numeros.length ; i++){
            System.out.println("Introduzca un numero");
            numeros[i] = entrada.nextInt();
            suma = suma + numeros[i];
        }
        promedio = suma / numeros.length;
      
        System.out.printf("El promedio es: %.2f\n", promedio);
        for(i = 0 ; i < numeros.length ; i++){
            diferencia = numeros[i] - promedio;
            System.out.printf("numero: %d Diferencia con el promedio: %.2f\n", 
                    numeros[i], 
                    diferencia);
        
        }
    }

}
