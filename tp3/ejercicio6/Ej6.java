/*
6. Cree una aplicación que gestione empleados y permita:
    • Registrar nombre y sueldo de empleados.
    • Devolver el nombre y sueldo del empleado que más gana.
    • Devolver el sueldo promedio.
*/

package ejercicio6;

import java.util.Scanner;
import java.util.ArrayList;

public class Ej6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Empleado> empleados = new ArrayList<>();

        String continuar;

        do {
            System.out.println("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();
    
            System.out.println("Ingrese el sueldo del empleado: ");
            double sueldo = scanner.nextDouble();
            scanner.nextLine();

            Empleado nuevo = new Empleado(nombre, sueldo);
            empleados.add(nuevo);

            System.out.println("¿Desea agregar otro empleado? (Si/No): ");
            continuar = scanner.nextLine();
            
        } while (continuar.equalsIgnoreCase("Si"));

        for (Empleado empleado : empleados) {
            System.out.println("\nNombre: " + empleado.getNombre());
            System.out.println("Sueldo: " + empleado.getSueldo());
        }

        System.out.println("\nEl promedio de sueldos es: " + MetodosEmpleado.sueldoPromedio(empleados));

        Empleado empleadoMejorPago = MetodosEmpleado.calcularMayorSueldo(empleados);

        if (empleadoMejorPago != null) {
            System.out.println("\nEl nombre del empleado con mayor sueldo es: " + empleadoMejorPago.getNombre());
            System.out.println("El sueldo del empleado con mayor sueldo es: " + empleadoMejorPago.getSueldo());
        } else {
            System.out.println("\nNo hay empleados registrados.");
        }

        scanner.close();
    }
    
}