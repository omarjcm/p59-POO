package ec.edu.ups.modelo;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * 
     */
    protected String nombre;

    /**
     * 
     */
    protected String apellido;

    /**
     * @return
     */
    public String getNombre() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setNombre(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getApellido() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setApellido(String value) {
        // TODO implement here
    }
}