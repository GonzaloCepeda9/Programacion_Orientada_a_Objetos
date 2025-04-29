package ejercicio5;

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
    public boolean esPar() {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}