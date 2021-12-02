package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Consulta;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class GestionarConsulta implements GestionarObjeto {

    /**
     * Default constructor
     */
    public GestionarConsulta() {
        this.refConsultas = new ArrayList<Consulta>();
    }

    /**
     * 
     */
    private ArrayList<Consulta> refConsultas;


    /**
     * @param objeto
     */
    public void registrar(Object objeto) {
        Consulta consulta = (Consulta) objeto;
        this.refConsultas.add( consulta );
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