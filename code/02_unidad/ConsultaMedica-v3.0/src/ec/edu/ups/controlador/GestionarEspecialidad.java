package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Especialidad;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class GestionarEspecialidad implements GestionarObjeto {

    /**
     * Default constructor
     */
    public GestionarEspecialidad() {
        this.refEspecialidades = new ArrayList<Especialidad>();
    }

    /**
     * 
     */
    private ArrayList<Especialidad> refEspecialidades;


    /**
     * @param objeto
     */
    public void registrar(Object objeto) {
        Especialidad especialidad = (Especialidad) objeto;
        this.refEspecialidades.add(especialidad);
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