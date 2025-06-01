package Ejercicio_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_7_ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int num2 = scanner.nextInt();

            int resultado = num1 / num2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar solo números enteros.");
        } finally {
            scanner.close();
        }


    }
}
