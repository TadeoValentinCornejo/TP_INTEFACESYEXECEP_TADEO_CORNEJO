package Ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6_ejecutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("pepe","gomez",40,"BARRIO GENERICO");
        Producto producto = new Producto(42,4.99,"Leche");
        Factura factura = new Factura(4.99,cliente);
        int edad;
        factura.imprimir();
        producto.imprimir();
        cliente.imprimir();
        System.out.println("Ingrese la edad del cliente: ");
        edad = sc.nextInt();
        cliente.ingresarEdad(edad);





    }
}
