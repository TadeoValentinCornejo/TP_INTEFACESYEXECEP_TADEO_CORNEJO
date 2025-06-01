package Ejercicio_1;

public class Rectangulo implements Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.round(this.base * this.altura);
    }

    @Override
    public double calcularPerimetro() {
        return Math.round(2 * this.base + this.altura);
    }
}
