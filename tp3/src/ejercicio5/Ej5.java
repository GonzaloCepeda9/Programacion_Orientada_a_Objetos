/*
5. Considere la siguiente clase:
    public class Entero {
    private int numero;
    //constructor de la clase Enteros
    public Entero(int numero) {
        super();
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    //calcula el cuadrado de n
    public long cuadrado(){
        return numero*numero;
    }
}
Agregue métodos para calcular, si el numero es par o impar, el factorial de numero, si numero es primo.
Pruebelos.
*/

package ejercicio5;

public class Ej5 {
    
    public static void main(String[] args) {

        MetodosEntero numero = new MetodosEntero(5);
        
        numero.setNumero(3);

        System.out.println("Valor actual: " + numero.getNumero());

        System.out.println("El cuadrado es: " + numero.cuadrado());

        boolean esPar = numero.esPar();
        if (esPar) {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }

        boolean esPrimo = numero.esPrimo();
        if (esPrimo) {
            System.out.println("El numero es primo");
        }
        else {
            System.out.println("El numero no es primo");
        }

        System.out.println("El factorial es: " + numero.factorial());
    }
}