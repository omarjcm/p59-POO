package ec.edu.ups;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class RealizarDevolucion {

    /**
     * Default constructor
     */
    public RealizarDevolucion() {
    }

    /**
     * 
     */
    private Date fechaDevolucion;

    /**
     * 
     */
    private Double multa;

    /**
     * 
     */
    private Bibliotecario refBibliotecario;

    /**
     * 
     */
    private Estudiante refEstudiante;

    /**
     * 
     */
    private PrestamoDetalle refPrestamo;

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Bibliotecario getRefBibliotecario() {
        return refBibliotecario;
    }

    public void setRefBibliotecario(Bibliotecario refBibliotecario) {
        this.refBibliotecario = refBibliotecario;
    }

    public Estudiante getRefEstudiante() {
        return refEstudiante;
    }

    public void setRefEstudiante(Estudiante refEstudiante) {
        this.refEstudiante = refEstudiante;
    }

    public PrestamoDetalle getRefPrestamo() {
        return refPrestamo;
    }

    public void setRefPrestamo(PrestamoDetalle refPrestamo) {
        this.refPrestamo = refPrestamo;
    }

    
}