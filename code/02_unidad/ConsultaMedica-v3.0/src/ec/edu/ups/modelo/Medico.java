package ec.edu.ups.modelo;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Medico extends Persona {

    /**
     * Default constructor
     */
    public Medico() {
    }
    
    public Medico(String nombre, String apellido, int anioExperiencia) {
        super(nombre, apellido);
        this.anioExperiencia = anioExperiencia;
    }

    /**
     * 
     */
    private Integer anioExperiencia;


    /**
     * @return
     */
    public Integer getAnioExperiencia() {
        // TODO implement here
        return null;
    }

    /**
     * @param value
     */
    public void setAnioExperiencia(Integer value) {
        // TODO implement here
    }

}