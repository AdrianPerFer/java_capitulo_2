/* Escribe un programa en el que se declaran las variables enteras x, y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
el valor de cada variable, la suma, la resta, la división y la multiplicación. */
public class Ejercicio1 {
    public static void main(String[] args) {
        // Variables
        int x = 144;
        int y = 999;
        // Outputs
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
        System.out.println("División de x e y: "+((float)x / (float)y));
        System.out.println("------------------------------");
        System.out.println("División de y e x: "+((float)y / (float)x));
        System.out.println("------------------------------");
    }
}