/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Core i5 11va
 */
public class ArchivoBinario {
    public static void main(String[] args) {
        ObjectOutputStream output = null;
        try {
            FileOutputStream file = new FileOutputStream("archivo1.dat");
            output = new ObjectOutputStream( file );
            
            output.writeInt(100);
            output.writeBoolean( false );
            output.writeDouble( 2.2 );
        } catch (FileNotFoundException error) {
            System.out.println( error.getMessage() );
        } catch (IOException error) {
            System.out.println( error.getMessage() );
        } finally {
            try {
                output.close();
            } catch(IOException error) {
                System.out.println( error.getMessage() );
            }
        }
    }
}
