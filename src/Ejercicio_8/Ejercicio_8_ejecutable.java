package Ejercicio_8;

public class Ejercicio_8_ejecutable {
    public static int convertirStringAEntero(String texto) {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un número válido.");
            return 0;
        }
    }

    public static void main(String[] args) {
        String numero = "234";
        int num = convertirStringAEntero(numero);
        System.out.println("numero convertido es: " + numero);

        String cadenaTexto = "Hola Mundo";
        int num2 = convertirStringAEntero(cadenaTexto);
        System.out.println("numero convertido es: " + num2);
    }
}
