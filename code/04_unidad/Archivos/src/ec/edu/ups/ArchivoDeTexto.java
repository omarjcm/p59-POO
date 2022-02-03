/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups;

import java.io.PrintWriter;
import java.io.FileWriter;

/**
 *
 * @author Core i5 11va
 */
public class ArchivoDeTexto {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            // Creacion del iniciador
            FileWriter file = new FileWriter( "archivo_de_texto.txt", true);
            // Creacion del filtro
            output = new PrintWriter( file );
            
            output.println( "Hola mundo." );
            output.println( "Curso de Programación Orientada a Objetos." );
            output.println( "Universidad Politécnica Salesiana." );
        } catch(Exception error) {
            System.out.println( error.getMessage() );
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
