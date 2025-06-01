package Ejercicio_6;

public class Factura implements Imprimible {
    private double total;
    private Cliente cliente;

    public Factura() {

    }

    public Factura(double total, Cliente cliente) {
        this.total = total;
        this.cliente = cliente;
    }

    @Override
    public void imprimir() {
        String factura = toString();
        System.out.println(factura);
    }

    @Override
    public String toString() {
        return "Factura{" +
                "total=" + total +
                ", cliente=" + cliente +
                '}';
    }
}
