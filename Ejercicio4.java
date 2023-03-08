// Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese la temperatura en grados centígrados para convertirlos a grados Farenheit: ");
        float cent = leer.nextFloat();
        
        float fahr = 32 + (9*cent / 5);
        System.out.println(cent+ " grados Centigrados equivalen a "+ fahr+ " grados Fahrenheit.");
    }
}
