package ec.edu.ups;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Core i5 11va
 */
public class ArchivoBinarioLectura {
    public static void main(String[] args) {
        ObjectInputStream lector = null;
        try {
            FileInputStream file = new FileInputStream("archivo1.dat");
            lector = new ObjectInputStream( file );
            
            System.out.println( lector.readInt() );
            System.out.println( lector.readBoolean() );
            System.out.println( lector.readDouble() );
        } catch (FileNotFoundException error) {
            System.out.println( error.getMessage() );
        } catch (IOException error) {
            System.out.println( error.getMessage() );
        } finally {
            try {
                lector.close();
            } catch(IOException error) {
                System.out.println( error.getMessage() );
            }
        }
    }
    
}
