/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Core i5 11va
 */
public class ArchivoDeTextoConFormato {
    public static void main(String[] args) {
        String[] nombres = {"Erik Vera", "John Arguello", "Maria Fernanda", "Loredana", "Stalin Delgado"};
        
        PrintWriter output = null;
        try {
            // Creacion del iniciador
            FileWriter file = new FileWriter( "archivo_de_texto_formato.txt", true);
            // Creacion del filtro
            output = new PrintWriter( file );
            
            for (String nombre : nombres) {
                output.printf("%25s %d%n", nombre, 10);
            }
        } catch(Exception error) {
            System.out.println( error.getMessage() );
        } finally {
            if (output != null) {
                output.close();
            }
        }        
    }
}
