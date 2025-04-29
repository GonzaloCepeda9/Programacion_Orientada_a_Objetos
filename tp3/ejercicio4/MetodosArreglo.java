package ejercicio4;

public class MetodosArreglo {

          
        // public → Es un modificador de acceso, y significa que ese método puede ser llamado desde cualquier parte del programa.                      
        // static → Significa que el método pertenece a la clase y no a una instancia.
            // Si NO fuera static, tendríamos que crear un objeto de MetodosArreglo para poder usar ese método que estamos creando.
            //Pero como es static, podés llamarlo directamente así: MetodosArreglo.contarNumeros(...).


    public static int contarNumeros(int[] array) {      // Estas "funciones" que estoy creando, también se llaman métodos, porque están dentro de una clase.
        return array.length;
    }

    public static int calcularMayor(int[] array) {      // (int[] array) el int[] significa que es un arreglo de enteros. El array es el nombre que le vamos a dar al arreglo.
        int mayor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return mayor;
    }

    public static double calcularPromedio(int[] array) {
        int suma = 0;
        double promedio = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        promedio = (double) suma / array.length;        // Se agrega el (double) para indicar que el resultado de la división debe a ser un decimal.

        return promedio;
    }

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