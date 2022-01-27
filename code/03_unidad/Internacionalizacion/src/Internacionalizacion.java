
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
        System.out.println("Predeterminado: " + rb.getString("hola.texto"));
        
        rb = ResourceBundle.getBundle(recurso, Locale.ENGLISH);
        System.out.println("Predeterminado: " + rb.getString("hola.texto"));
        
        rb = ResourceBundle.getBundle(recurso, Locale.FRENCH);
        System.out.println("Predeterminado: " + rb.getString("hola.texto"));
        
        rb = ResourceBundle.getBundle(recurso, Locale.GERMAN);
        System.out.println("Predeterminado: " + rb.getString("hola.texto"));
    }
}
