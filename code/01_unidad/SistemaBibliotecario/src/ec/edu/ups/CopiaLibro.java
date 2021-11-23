package ec.edu.ups;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class CopiaLibro {

    /**
     * Default constructor
     */
    public CopiaLibro() {
    }

    /**
     * 
     */
    private String codigo;

    /**
     * 
     */
    private String estado;

    /**
     * 
     */
    private Libro refLibro;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Libro getRefLibro() {
        return refLibro;
    }

    public void setRefLibro(Libro refLibro) {
        this.refLibro = refLibro;
    }

    
}