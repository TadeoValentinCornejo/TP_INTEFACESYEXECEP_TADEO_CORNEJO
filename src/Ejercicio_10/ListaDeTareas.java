package Ejercicio_10;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTareas {

    private List<String> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(i + ": " + tareas.get(i));
        }
    }

    public void eliminarTarea(int indice) {
        try {
            String eliminada = tareas.remove(indice);
            System.out.println("Tarea eliminada: " + eliminada);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: índice fuera de rango. No se pudo eliminar la tarea.");
        }
    }
}
