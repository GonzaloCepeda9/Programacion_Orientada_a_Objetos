package ejercicio6;

import java.util.ArrayList;

public class MetodosEmpleado {

    // Calcular sueldo promedio >> Devuelve el sueldo promedio de los empleados
    public static double sueldoPromedio(ArrayList<Empleado> empleados) {
        double suma = 0;
        if (empleados.size() == 0) {
            return 0;
        } else {
            for (int i = 0; i < empleados.size(); i++) {
                suma = suma + empleados.get(i).getSueldo();
            }
        }
        return suma / empleados.size();  
    }

    // Calcular mayor sueldo >> Devuelve el empleado con mayor sueldo
    public static Empleado calcularMayorSueldo(ArrayList<Empleado> empleados) {

        if (empleados.size() == 0) {
            return null;
        } 

        Empleado empleadoMayorSueldo = empleados.get(0);

        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getSueldo() > empleadoMayorSueldo.getSueldo()) {
                empleadoMayorSueldo = empleados.get(i);
            }
        }
        return empleadoMayorSueldo;
    }
    
}