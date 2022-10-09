/* Escribe un programa en el que se declaren las variables enteras x, y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación. */

// Librerías usadas
import java.util.InputMismatchException;

public class Exercise1 {
    public static void main(String[] args) {
        // Captura de errores
        try {
            // Variables
            int x = 144;
            int y = 999;
            System.out.println("Valor de x: " + x);
            System.out.println("------------------------------");
            System.out.println("Valor de y: " + y);
            System.out.println("------------------------------");
            System.out.println("Suma de x e y: "+(x + y));
            System.out.println("------------------------------");
            System.out.println("Resta de x e y: "+(x - y));
            System.out.println("------------------------------");
            System.out.println("Resta de y e x: "+(y - x));
            System.out.println("------------------------------");
            System.out.println("Multiplicación de x e y: "+(x * y));
            System.out.println("------------------------------");
            System.out.println("División de x e y: "+(x / y));
            System.out.println("------------------------------");
            System.out.println("División de y e x: "+(y / x));
            System.out.println("------------------------------");
        } catch (InputMismatchException ex) {
            System.out.println("Dato introducido erroneo");
        }
    }
}