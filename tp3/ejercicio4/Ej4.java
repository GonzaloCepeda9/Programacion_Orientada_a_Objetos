package ejercicio4;

import java.util.Arrays;

public class Ej4 {
    public static void main(String [] args) {

        int[] numeros = {4, 2, 3, 8, 1};

        int cantidadNumeros = MetodosArreglo.contarNumeros(numeros);
        System.out.println("El arreglo tiene " + cantidadNumeros + " números.");

        int numeroMayor = MetodosArreglo.calcularMayor(numeros);
        System.out.println("El número mayor es: " + numeroMayor + ".");

        double promedio = MetodosArreglo.calcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio + ".");

        MetodosArreglo.ordenarMayorAMenor(numeros);
        System.out.println("Array ordenado de mayor a menor: " + Arrays.toString(numeros) + ".");

        MetodosArreglo.ordenarMenorAMayor(numeros);
        System.out.println("Array ordenado de menor a mayor: " + Arrays.toString(numeros) + ".");
    
    }
}