package ejercicio4;

public class MetodosArreglo {

    // Contar números >> Devuelve la cantidad de números en el array
    public static int contarNumeros(int[] array) {
        return array.length;
    }

    // Calcular mayor >> Devuelve el mayor número del array
    public static int calcularMayor(int[] array) {
        int mayor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    // Calcular promedio >> Devuelve el promedio de los números del array
    public static double calcularPromedio(int[] array) {
        int suma = 0;
        double promedio = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        promedio = (double) suma / array.length;

        return promedio;
    }

    // Ordenar de mayor a menor y de menor a mayor
    public static void ordenarMayorAMenor(int[] array) {
        int aux;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j+1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }


    // Ordenar de menor a mayor
    public static void ordenarMenorAMayor(int[] array) {
        int aux;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }

}