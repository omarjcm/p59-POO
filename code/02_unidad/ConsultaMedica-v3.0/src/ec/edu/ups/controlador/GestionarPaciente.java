package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Paciente;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class GestionarPaciente implements GestionarObjeto {

    /**
     * Default constructor
     */
    public GestionarPaciente() {
        this.refPacientes = new ArrayList<Paciente>();
    }

    /**
     * 
     */
    private ArrayList<Paciente> refPacientes;


    /**
     * @param objeto
     */
    public void registrar(Object objeto) {
        Paciente paciente = (Paciente) objeto;
        this.refPacientes.add( paciente );
    }

    /**
     * @param objeto
     */
    public void modificar(Object objeto) {
        // TODO implement here
    }

    /**
     * @param objeto
     */
    public void eliminar(Object objeto) {
        // TODO implement here
    }

    /**
     * @param objeto 
     * @return
     */
    public ArrayList leer(Object objeto) {
        // TODO implement here
        return null;
    }

}