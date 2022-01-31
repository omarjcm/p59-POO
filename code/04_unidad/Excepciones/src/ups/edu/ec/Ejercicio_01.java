/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec;

/**
 *
 * @author Core i5 11va
 */
public class Ejercicio_01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = -1;
        int[] arreglo = {1, 2, 3};
        
        try {
            c = a / b;
            System.out.println( arreglo[4] );
            c = 5;
        } catch(ArithmeticException ex) {
            System.out.println("Division por cero.");
        } catch(IndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
            System.out.println("El indice esta fuera de rango.");
        } finally {
            System.out.println("El resultado es: " + c);
        }
    }
}
