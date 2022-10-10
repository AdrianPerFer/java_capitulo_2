/******************************************************************************************
 * 5.   Realiza un conversor de pesetas a euros. La cantidad en euros que se quiere       *
 *      convertir deberá estar almacenada en una variable.                                *
 *                                                                                        *
 *                                                                                        *
 ******************************************************************************************
 *                                                                    |  |                *
 *                                                                    |  |                *
 *                          @author Adrián Perogil Fernández        *      *              *
 *                                                                   ******               *
 ******************************************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // Try - Catch for errors
        try {
            // Variables pesetas and total
            System.out.println("Introduce la cantidad de pesetas: ");
            float pesetas = sc.nextFloat();
            double total = (pesetas / 166.386);
            // Output
            System.out.println(pesetas + " son " + (float)total + " euros");
        } catch (InputMismatchException ex) {
            System.out.println("Dato introducido erróneo");
        } sc.close();
    }
}