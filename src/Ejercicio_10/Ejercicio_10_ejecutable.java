package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_10_ejecutable {
    public static void main(String[] args) {
        ListaDeTareas lista = new ListaDeTareas();
        Scanner scanner = new Scanner(System.in);

        lista.agregarTarea("Estudiar Java");
        lista.agregarTarea("Hacer ejercicio");
        lista.agregarTarea("Leer un libro");

        System.out.println("Tareas actuales:");
        lista.mostrarTareas();

        System.out.print("\nIngrese el índice de la tarea a eliminar: ");
        int indice = scanner.nextInt();

        lista.eliminarTarea(indice);

        System.out.println("\nTareas después de eliminar:");
        lista.mostrarTareas();

    }
}
