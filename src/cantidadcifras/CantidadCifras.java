/*
Ejercicio Pedir un número entre 0 y 99 999 y decir cuántas cifras tiene. 

*/
package cantidadcifras;

import java.util.Scanner;

public class CantidadCifras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 0 y 99,999: ");
        int numero = scanner.nextInt();

        // Convertir el número a una cadena para contar los dígitos
        String numeroString = String.valueOf(numero);

        // Calcular la cantidad de cifras
        int cantidadCifras = numeroString.length();

        // Mostrar el resultado
        System.out.println("El número tiene " + cantidadCifras + " cifras.");

        scanner.close();
    }
    /* Explicación:

Importamos la clase Scannerpara poder leer la entrada del usuario.
Creamos un objeto Scannerllamado scannerpara leer la entrada del usuario.
Solicitamos al usuario que ingrese un número entre 0 y 99,999 utilizando
    System.out.print.
Utilizamos scanner.nextInt()para leer el número ingresado por el usuario 
    y almacenarlo en la variable numero.
Convertimos el número a una cadena utilizando String.valueOf(numero). 
    Esto nos permite contar los dígitos del número.
Utilizamos numeroString.length()para obtener la longitud de la cadena, 
    que es igual a la cantidad de cifras del número.
Mostramos el resultado utilizando System.out.println.
Cerramos el objeto Scannerutilizando scanner.close()para liberar los recursos.
    */
}
