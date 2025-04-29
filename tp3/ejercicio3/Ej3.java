/* 
3. Implemente un programa que indique si una palabra es un palíndromo. Una palabra es palíndromo si se lee igual de izquierda a derecha que de derecha a izquierda.
*/

package ejercicio3;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        
        String palabra = scanner.nextLine();

        StringBuilder constructorPalabra = new StringBuilder(palabra);

        String palabraInvertida = constructorPalabra.reverse().toString();

        System.out.println("Palabra ingresada: " + palabra);
        System.out.println("Palabra invertida: " + palabraInvertida);

        if (palabraInvertida.equals(palabra)) {
            System.out.println("La palabra es un palíndromo");
        } else {
            System.out.println("La palabra no es un palíndromo");
        }
        
        scanner.close();
    }

}