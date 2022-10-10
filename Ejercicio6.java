/******************************************************************************************
 * 6.   Escribe un programa que calcule el total de una factura a partir de la base       *
 *      imponible (precio sin IVA). La base imponible estará almacenada en una variable   *
 *      forma que el resultado del programa sea el mismo que en el ejercicio 2.           *
 *                                                                                        *
 ******************************************************************************************
 *                                                                    |  |                *
 *                                                                    |  |                *
 *                          @author Adrián Perogil Fernández        *      *              *
 *                                                                   ******               *
 ******************************************************************************************/
public class Ejercicio6 {
    public static void main(String[] args) {
        // Variable
        double base_imponible = 1300;
        // Output
        System.out.println("Base imponible: " + base_imponible);
        System.out.println("El IVA es: " + base_imponible * 0.21);
        System.out.println("Total (IVA incluido): " + base_imponible * 1.21);
    }
}