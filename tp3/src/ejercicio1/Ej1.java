/*
1. Escriba un programa que lea tres números y si el primero es positivo calcule el producto de los otros dos, en otro caso calcule la suma.
*/

package ejercicio1;

import java.util.Scanner;

public class Ej1 {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número positivo para realizar multiplicación, o un número negativo para realizar suma: ");

        int num1 = scanner.nextInt();

        System.out.println("Ingrese el primer número");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el segundo número");
        int num3 = scanner.nextInt();

        int resultado;
        
        if (num1 > 0) {
            resultado = num2 * num3;
        } else {                                                
            resultado = num2 + num3;                     
        }
        
        System.out.println("El resultado es: " + resultado);
        
        scanner.close();
    }
    
}