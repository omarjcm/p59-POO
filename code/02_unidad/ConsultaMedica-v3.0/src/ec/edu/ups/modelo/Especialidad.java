package ec.edu.ups.modelo;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Especialidad {

    /**
     * Default constructor
     */
    public Especialidad() {
    }

    public Especialidad(String nombre, Double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    
    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Double valor;



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
    public Double getValor() {
        // TODO implement here
        return this.valor;
    }

    /**
     * @param value
     */
    public void setValor(Double value) {
        this.valor = value;
    }

}