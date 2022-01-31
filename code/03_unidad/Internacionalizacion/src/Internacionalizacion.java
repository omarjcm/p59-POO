
import java.util.Locale;
import java.util.ResourceBundle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Core i5 11va
 */
public class Internacionalizacion {
    public static void main(String[] args) {
        String recurso = "saludo";
        
        ResourceBundle rb = ResourceBundle.getBundle(recurso);
        System.out.println("Español: " + rb.getString("hola.texto"));
        System.out.println("Español: " + rb.getString("hola.despedida"));
        
        rb = ResourceBundle.getBundle(recurso, Locale.ENGLISH);
        System.out.println("Inglés: " + rb.getString("hola.texto"));
        System.out.println("Inglés: " + rb.getString("hola.despedida"));
        
        rb = ResourceBundle.getBundle(recurso, Locale.FRENCH);
        System.out.println("Francés: " + rb.getString("hola.texto"));
        System.out.println("Francés: " + rb.getString("hola.despedida"));
        
        rb = ResourceBundle.getBundle(recurso, Locale.GERMAN);
        System.out.println("Alemán: " + rb.getString("hola.texto"));
        System.out.println("Alemán: " + rb.getString("hola.despedida"));
    }
}