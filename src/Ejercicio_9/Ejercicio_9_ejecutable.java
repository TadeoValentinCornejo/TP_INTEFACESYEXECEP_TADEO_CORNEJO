package Ejercicio_9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio_9_ejecutable {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\valen\\OneDrive\\Escritorio\\Segundo semestre programacion\\programacion II Java\\TP_INTEFACESYEXECEP_TADEO_CORNEJO\\src\\Ejercicio_9\\oracion.txt"));
            String linea;

            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo:"+ e.getMessage());
        }finally {
            try {
                if(br != null){
                    br.close();
                }
            }catch (IOException e){
                System.out.println("Error al cerrar el archivo:"+ e.getMessage());
            }
        }

    }
}
