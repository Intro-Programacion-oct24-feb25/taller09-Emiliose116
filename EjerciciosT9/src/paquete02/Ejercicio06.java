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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double precioTotal = 0;
        String[] tipoCafe = {"cafe tradicional", "cafe frances", "cafe aleman"};
        double[] precio = {1.5, 2.1, 2.3};
        int cantidad;
        String cadena = "";
        int i;
        double precioParcial;
        boolean bandera = true;
        String salida;

        while (bandera) {
            System.out.println("Ingrese que cafe quiere");
            for (i = 0; i < tipoCafe.length; i++) {
                System.out.printf("%d %s\n", i, tipoCafe[i]);

            }
            i = entrada.nextInt();
            
            System.out.printf("Ingrese el numero de tazas de %s que desee:\n", 
                    tipoCafe[i]);
            
            cantidad = entrada.nextInt();
            entrada.nextLine();
            precioParcial = precio[i] * cantidad;
            cadena = String.format("%s%s (%d t), valor a cancelar $%.2f\n", 
                    cadena, 
                    tipoCafe[i], 
                    cantidad, 
                    precioParcial);
            
            
            System.out.println("ingrese si para seguir ordenando:");
            salida = entrada.nextLine();
            if(salida.equals("si")){
            bandera = true;            
            } else {
                bandera = false;
            
            }
        }
        System.out.printf("El usuario ha comprado:\n%s\nTotal a pagar: %.2f\n", cadena, precioTotal);

    }

}
