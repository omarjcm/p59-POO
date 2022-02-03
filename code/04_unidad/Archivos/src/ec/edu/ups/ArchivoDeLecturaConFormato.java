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
public class ArchivoDeLecturaConFormato {
    public static void main(String[] args) {
        Scanner lector = null;
        try {
            FileReader file = new FileReader("archivo_de_texto_formato2.txt");
            lector = new Scanner( file );
            //lector.useLocale( Locale.ENGLISH );
            while(lector.hasNextLine()) {
                String word = lector.nextLine();
                
                System.out.print( word );
                
                while(lector.hasNextDouble()) {
                    double number = lector.nextDouble();
                    System.out.print( number );
                }
                System.out.println("");
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
