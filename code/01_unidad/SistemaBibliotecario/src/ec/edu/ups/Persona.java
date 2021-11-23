package ec.edu.ups;

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

    /**
     * 
     */
    protected String cedula;

    /**
     * 
     */
    protected String nombre;

    /**
     * 
     */
    protected String apellido;

    /**
     * 
     */
    protected String correElectronico;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreElectronico() {
        return correElectronico;
    }

    public void setCorreElectronico(String correElectronico) {
        this.correElectronico = correElectronico;
    }

    
}