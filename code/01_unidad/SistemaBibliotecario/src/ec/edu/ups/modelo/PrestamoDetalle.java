package ec.edu.ups.modelo;

import ec.edu.ups.modelo.CopiaLibro;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class PrestamoDetalle {

    /**
     * Default constructor
     */
    public PrestamoDetalle() {
    }

    /**
     * 
     */
    private String estadoActual;

    /**
     * 
     */
    private CopiaLibro refCopiaLibro;

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public CopiaLibro getRefCopiaLibro() {
        return refCopiaLibro;
    }

    public void setRefCopiaLibro(CopiaLibro refCopiaLibro) {
        this.refCopiaLibro = refCopiaLibro;
    }

    

}