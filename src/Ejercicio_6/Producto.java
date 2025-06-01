package Ejercicio_6;

public class Producto implements Imprimible {
    private int ID;
    private double precio;
    private String nombre;

    public Producto() {

    }

    public Producto(int ID, double precio, String nombre) {
        this.ID = ID;
        this.precio = precio;
        this.nombre = nombre;
    }


    @Override
    public void imprimir() {
        String producto = toString();
        System.out.println(producto);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "ID=" + ID +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
