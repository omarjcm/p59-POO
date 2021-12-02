package ec.edu.ups.modelo;

import static ec.edu.ups.vista.ConsultaMedicaCLI.ANIO_ACTUAL;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Paciente extends Persona {

    public static int ANIO_ACTUAL = 2021;
    /**
     * Default constructor
     */
    public Paciente() {
    }
    
    public Paciente(Paciente paciente) {
        super(paciente.getNombre(), paciente.getApellido());
        this.sexo = paciente.getSexo();
        this.anioNacimiento = paciente.getAnioNacimiento();
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
        return this.sexo;
    }

    /**
     * @param value
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    
    public Boolean esTerceraEdad() {
        return ((ANIO_ACTUAL - this.anioNacimiento) >= 65);
    }
}