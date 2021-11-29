package ec.edu.ups.modelo;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Paciente extends Persona {

    /**
     * Default constructor
     */
    public Paciente() {
    }

    /**
     * 
     */
    private String sexo;

    private int anioNacimiento;


    /**
     * @return
     */
    public String getSexo() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setSexo(String value) {
        // TODO implement here
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
}