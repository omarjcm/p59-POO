package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Medico;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class GestionarMedico implements GestionarObjeto {

    /**
     * Default constructor
     */
    public GestionarMedico() {
        this.refMedicos = new ArrayList<Medico>();
    }

    /**
     * 
     */
    private ArrayList<Medico> refMedicos;


    /**
     * @param objeto
     */
    public void registrar(Object objeto) {
        this.refMedicos.add((Medico) objeto);
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