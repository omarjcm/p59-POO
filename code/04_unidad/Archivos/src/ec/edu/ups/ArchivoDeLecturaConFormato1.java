/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups;

import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Core i5 11va
 */
public class ArchivoDeLecturaConFormato1 {
    public static void main(String[] args) {
        Scanner lector = null;
        try {
            FileReader file = new FileReader("archivo_de_texto_formato3.txt");
            lector = new Scanner( file );
            //lector.useLocale( Locale.ENGLISH );
            while(lector.hasNextLine()) {
                String nombre = lector.next();
                String apellido = lector.next();
                int calificacion = lector.nextInt();
                System.out.println( nombre + " " + apellido + " " + calificacion );
            }
        } catch(Exception error) {
            System.out.println(error.getMessage());
        } finally {
            if (lector != null) {
                lector.close();
            }            
        }        
    }
}
