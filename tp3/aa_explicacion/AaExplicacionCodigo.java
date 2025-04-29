// 1. Escriba un programa que lea tres números y si el primero es positivo calcule el producto de los otros dos, en otro caso calcule la suma.

// Indicar que la clase forma parte del paquete (package) "tp3".
package aa_explicacion;

// Importar la clase Scanner. Sirve para leer datos por teclado.
import java.util.Scanner;

/*
Crear la clase principal llamada Ej1. En Java, todo el código tiene que estar dentro de una clase.
• Si la clase tiene "public class" NombreClase, el archivo debe llamarse NombreClase.java, sí o sí.
• Si no tiene el public, puede tener un nombre distinto, pero no es recomendable porque puede causar confusiones o errores.
*/
public class AaExplicacionCodigo {

    /*
    Iniciar el programa (es como si esta línea le dijera a Java: "Acá es donde tenés que empezar a ejecutar el programa.”).
    • public    >>  Cualquiera puede acceder a este método (Java lo necesita para poder ejecutarlo desde afuera).
    • static    >>  Este método no necesita una instancia de la clase para ser ejecutado.
    • void      >>  Este método no devuelve ningún resultado (no retorna nada).
    • main      >>  Es el nombre obligatorio del método de inicio.
    • String[]  >>  Los argumentos de la linea de comandos. Recibe un arreglo de texto por si se quieren pasar datos por consola al ejecutar el programa (no siempre se usa).
    */
    public static void main(String[] args) {

        // Crear un objeto de la clase Scanner. Lee lo que el usuario ingresa por teclado.
        // Explicación de la sintaxis:
        // Scanner                  >> Tipo de dato (le estamos diciendo a java que vamos a crear un objeto de la clase Scanner).
        // scanner                  >> Nombre que se le da al objeto que creamos.
        // new Scanner(System.in)   >> Permite crear un objeto de la clase Scanner.
        Scanner scanner = new Scanner(System.in);

        // Imprimir en pantalla.
        System.out.println("Ingrese un número");

        // Leer lo que el usuario ingresa por teclado. En este caso, el usuario ingresa un número y se guarda en la variable num1 (de tipo int).
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro número");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese otro número");
        int num3 = scanner.nextInt();

        int resultado;
        
        if (num1 > 0) {
            resultado = num2 * num3;
        } else {                                                
            resultado = num2 + num3;                     
        }
        
        // Imprimir el resultado
        System.out.println("El resultado es: " + resultado);
        
        // Cerrar el Scanner
        scanner.close();
    }
}