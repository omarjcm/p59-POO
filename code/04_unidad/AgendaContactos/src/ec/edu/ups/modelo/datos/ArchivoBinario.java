/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo.datos;

import ec.edu.ups.modelo.Contacto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Core i5 11va
 */
public class ArchivoBinario {
    private String nombreArchivo;
    
    public ArchivoBinario(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public Boolean escribirArchivo(LinkedList<Contacto> contactos) {
        ObjectOutputStream output = null;
        try {
            FileOutputStream file = new FileOutputStream("contactos.dat");
            output = new ObjectOutputStream( file );
            
            output.writeObject( contactos );
            output.close();
            
            return true;
        } catch (FileNotFoundException error) {
            System.out.println( error.getMessage() );
        } catch (IOException error) {
            System.out.println( error.getMessage() );
        }
        return false;
    }
    
    public LinkedList<Contacto> leerArchivo() {
        ObjectInputStream lector = null;
        try {
            FileInputStream file = new FileInputStream("contactos.dat");
            lector = new ObjectInputStream( file );
            
            LinkedList<Contacto> contactos = (LinkedList<Contacto>) lector.readObject();
            lector.close();
            
            return contactos;
        } catch (FileNotFoundException error) {
            System.out.println( error.getMessage() );
        } catch (IOException | ClassNotFoundException error) {
            System.out.println( error.getMessage() );
        }
        return null;
    }
}
