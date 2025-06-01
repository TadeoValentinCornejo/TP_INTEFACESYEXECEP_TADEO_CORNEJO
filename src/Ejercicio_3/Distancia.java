package Ejercicio_3;

public class Distancia implements Convertible{
    private double km;

    public Distancia(){

    }

    public Distancia(double km){
        this.km = km;
    }

    @Override
    public String convertir() {
        double metro = this.km * 1000;
        return km+"Km = "+metro+"m";
    }
}
