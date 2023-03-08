// Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa tu primer nombre: ");
        String nom = leer.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String ape = leer.nextLine();
        System.out.println(" ");
        System.out.println("<!!!--------------------------!!!>");
        System.out.println(" ");
        System.out.println("Tu nombre completo es: "+nom+ " "+ape);
        
        
    }
    
}
