/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numElementos;
        String elemento;
        String mensajeFinal = "Los datos ingresados son:\n";
        String letra2;
        
        System.out.println("Ingrese el numero de elementos que quiere "
                + "ingresar:");
        numElementos = entrada.nextInt();
        entrada.nextLine();

        String[] arreglo = new String[numElementos];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese lo que quieras ingresar, "
                    + "por ejemplo marcas");
            elemento = entrada.nextLine();
            arreglo[i] = elemento;
            elemento = elemento.toUpperCase();
            char letra = elemento.charAt(0);

            letra2 = String.valueOf(letra);

            if (letra2.equals("A") || letra2.equals("C") || letra2.equals("T")) {

            } else {
                mensajeFinal = String.format("%s%s\n", mensajeFinal,
                        arreglo[i]);

            }
        }
        System.out.printf("%s", mensajeFinal);
    }
}
