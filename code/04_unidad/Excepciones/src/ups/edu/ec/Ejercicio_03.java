/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec;

/**
 *
 * @author Core i5 11va
 */
public class Ejercicio_03 {
    
    public int edad;
    
    public static void main(String[] args) {
        try {
            ponEdad( -1 );
        } catch(EdadFueraDeRango ex) {
            System.out.println("Se ha producido una excepcion");
            System.out.println( ex.getMessage() );
            ex.printStackTrace();
        }
    }
    
    public static void ponEdad(int edad) throws EdadFueraDeRango {
        if (edad <= 0 || edad > 130) {
            throw new EdadFueraDeRango("Demasiado joven o demasiado viejo.");
        }
    }
}
