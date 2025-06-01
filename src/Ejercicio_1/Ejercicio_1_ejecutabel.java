package Ejercicio_1;

public class Ejercicio_1_ejecutabel {
    public static void main(String[] args) {
        Circulo c = new Circulo(12);
        Rectangulo r = new Rectangulo(12, 4);

        System.out.println("El area del circulo es: " + c.calcularArea());
        System.out.println("El perimetro es: " + c.calcularPerimetro());

        System.out.println("--------------------------------------");

        System.out.println("El area del rectangulo es: " + r.calcularArea());
        System.out.println("El perimetro es: " + r.calcularPerimetro());
    }
}
