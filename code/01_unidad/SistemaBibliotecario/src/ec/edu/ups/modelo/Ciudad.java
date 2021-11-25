package ec.edu.ups.modelo;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Ciudad {

    /**
     * Default constructor
     */
    public Ciudad() {
    }

    /**
     * 
     */
    private String nombre;


    /**
     * 
     */
    private Pais refPais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getRefPais() {
        return refPais;
    }

    public void setRefPais(Pais refPais) {
        this.refPais = refPais;
    }

    
}