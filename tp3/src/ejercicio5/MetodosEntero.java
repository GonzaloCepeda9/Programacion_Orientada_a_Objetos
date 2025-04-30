package ejercicio5;

public class MetodosEntero {
    
    private int numero;

    // Constructor de la clase Enteros
    public MetodosEntero(int numero) {
        super();
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Calcular el cuadrado
    public long cuadrado(){
        return numero*numero;
    }

    // Determinar si es par o impar
    public boolean esPar() {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // Determinar si es primo
    public boolean esPrimo() {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Calcular factorial
    public long factorial() {
        if (numero < 0) return -1;
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
}