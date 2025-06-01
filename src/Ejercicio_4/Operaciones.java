package Ejercicio_4;

public interface Operaciones {
    public abstract int operar(int a, int b);

    public default void mostrarInfo(){
        System.out.println(toString());
    }
}
