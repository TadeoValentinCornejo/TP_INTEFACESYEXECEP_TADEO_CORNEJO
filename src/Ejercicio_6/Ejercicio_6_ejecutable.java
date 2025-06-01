package Ejercicio_2;

public class Ejercicio_2_ejecutable {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("pepe","gomez",19,"BARRIO GENERICO");
        Producto producto = new Producto(42,4.99,"Leche");
        Factura factura = new Factura(4.99,cliente);

        factura.imprimir();
        producto.imprimir();
        cliente.imprimir();
    }
}
