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
        return this.nombre;
    }

    /**
     * @param value
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * @return
     */
    public String getApellido() {
        // TODO implement here
        return this.apellido;
    }

    /**
     * @param value
     */
    public void setApellido(String value) {
        this.apellido = value;
    }
}