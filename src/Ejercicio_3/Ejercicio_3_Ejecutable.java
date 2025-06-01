package Ejercicio_3;

public class Ejercicio_3_Ejecutable {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura(25);
        Distancia d = new Distancia(45);
        Tiempo t = new Tiempo(2);

        System.out.println(d.convertir());
        System.out.println(t.convertir());
        System.out.println(temperatura.convertir());
    }
}
