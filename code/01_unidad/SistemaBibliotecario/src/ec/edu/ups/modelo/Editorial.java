package ec.edu.ups.modelo;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Editorial {

    /**
     * Default constructor
     */
    public Editorial() {
    }

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String domiclio;


    /**
     * 
     */
    private Ciudad refCiudad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomiclio() {
        return domiclio;
    }

    public void setDomiclio(String domiclio) {
        this.domiclio = domiclio;
    }

    public Ciudad getRefCiudad() {
        return refCiudad;
    }

    public void setRefCiudad(Ciudad refCiudad) {
        this.refCiudad = refCiudad;
    }

    
}