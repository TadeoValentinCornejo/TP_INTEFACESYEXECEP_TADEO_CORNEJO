package Ejercicio_1;

public class Circulo implements Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.round(Math.PI * Math.pow(this.radio, 2)) ;
    }

    @Override
    public double calcularPerimetro() {
        return Math.round(2 * Math.PI * this.radio);
    }
}
