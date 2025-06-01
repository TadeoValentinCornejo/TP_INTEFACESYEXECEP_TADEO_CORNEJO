package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio_5_ejecutable {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        Cabra cabra = new Cabra();
        animales.add(perro);
        animales.add(gato);
        animales.add(vaca);
        animales.add(cabra);

        for (Animal animal : animales) {
            animal.hacerRuido();
        }
    }
}
