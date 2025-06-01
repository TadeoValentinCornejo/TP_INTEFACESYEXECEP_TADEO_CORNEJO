package Ejercicio_3;

public class Tiempo implements Convertible{
    private double horas;

    public Tiempo(double horas) {
        this.horas = horas;
    }

    @Override
    public String convertir() {
        double minutos = horas * 60;
        return horas + " h = " + minutos + " min";
    }
}
