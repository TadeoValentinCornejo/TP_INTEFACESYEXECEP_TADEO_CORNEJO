package Ejercicio_4;

public class Multiplicacion implements Operaciones{
    private int num1, num2;

    public Multiplicacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    @Override
    public int operar(int a, int b) {
        return a * b;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("La multiplicacion de "+num1+" y "+num2+" es: "+operar(num1, num2));
    }
}
