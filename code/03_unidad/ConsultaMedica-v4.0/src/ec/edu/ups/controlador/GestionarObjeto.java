package ec.edu.ups.controlador;

import java.util.*;

/**
 * 
 */
public interface GestionarObjeto {

    /**
     * @param objeto
     */
    public void registrar(Object objeto);

    /**
     * @param objeto
     */
    public void modificar(Object objeto);

    /**
     * @param objeto
     */
    public void eliminar(Object objeto);

    /**
     * @param objeto 
     * @return
     */
    public ArrayList leer(Object objeto);

}