/******************************************************************************************
 * 4.   Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere       *
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

public class Ejercicio4 {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);
        // Try - Catch for errors
        try {
            // Variables euros and total
            System.out.println("Introduce la cantidad de euros: ");
            float euros = sc.nextFloat();
            double total = (euros * 166.386);
            // Output
            System.out.println(euros + " son " + total + " pesetas");
        } catch (InputMismatchException ex) {
            System.out.println("Dato introducido erróneo");
        }
    }
}