/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double suma=0;
        double promedio;
        String cadenaMayores = "Los valores mayores a la media son:";
        String cadenaMenores = "Los valores menores al promedio son:";
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }

        promedio = suma / arreglo.length;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) {
                cadenaMayores = String.format("%S\t%d", 
                        cadenaMayores, 
                        arreglo[i]);

            } else {
                cadenaMenores = String.format("%S\t%d", 
                        cadenaMenores, 
                        arreglo[i]);
            }

        }
        System.out.printf("%s\n%s\n", cadenaMayores, cadenaMenores);
    }

}
