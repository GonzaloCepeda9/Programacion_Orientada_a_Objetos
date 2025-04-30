/*
2. Clasificador de Calificaciones:
• Ingresa una calificación numérica (por ejemplo, de 0 a 10).
Utiliza una serie de if-else if-else para clasificar la calificación en categorías como "Aprobado", "Reprobado",
"Sobresaliente", etc. Define tus propios rangos
*/

package ejercicio2;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una calificación numérica (por ejemplo, de 0 a 10):");

        int calificacion = scanner.nextInt();

        String condicion;

        if (calificacion >= 7) {
            condicion = "Sobresaliente";
        } else if (calificacion >= 4) {
            condicion = "Aprobado";
        } else {
            condicion = "Desaprobado";
        }

        System.out.println("Calificación: " + calificacion);
        System.out.println("Condición: " + condicion);
        
        scanner.close();
    }
    
}