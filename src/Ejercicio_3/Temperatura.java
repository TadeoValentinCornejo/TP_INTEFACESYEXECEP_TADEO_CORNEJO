package Ejercicio_3;

public class Temperatura implements Convertible{
    private double temperaturaCelsius;

    public Temperatura(){

    }

    public Temperatura(double temperaturaCelsius) {
        this.temperaturaCelsius = temperaturaCelsius;
    }

    @Override
    public String convertir() {
        double farenheit = (this.temperaturaCelsius * 9/5) + 32;
        return temperaturaCelsius+"°C = "+ farenheit+"°F ";
    }
}
