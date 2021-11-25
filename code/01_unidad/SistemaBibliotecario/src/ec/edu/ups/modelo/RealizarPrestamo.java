package ec.edu.ups.modelo;

import ec.edu.ups.modelo.Estudiante;
import ec.edu.ups.modelo.Bibliotecario;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class RealizarPrestamo {

    /**
     * Default constructor
     */
    public RealizarPrestamo() {
    }

    /**
     * 
     */
    private Date fechaPrestamo;

    /**
     * 
     */
    private Date fechaEntrega;

    /**
     * 
     */
    private Estudiante refEstudiante;

    /**
     * 
     */
    private Bibliotecario refBibliotecario;

    /**
     * 
     */
    private ArrayList<PrestamoDetalle> refPrestamoDetalle;

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Estudiante getRefEstudiante() {
        return refEstudiante;
    }

    public void setRefEstudiante(Estudiante refEstudiante) {
        this.refEstudiante = refEstudiante;
    }

    public Bibliotecario getRefBibliotecario() {
        return refBibliotecario;
    }

    public void setRefBibliotecario(Bibliotecario refBibliotecario) {
        this.refBibliotecario = refBibliotecario;
    }

    public ArrayList<PrestamoDetalle> getRefPrestamoDetalle() {
        return refPrestamoDetalle;
    }

    public void setRefPrestamoDetalle(ArrayList<PrestamoDetalle> refPrestamoDetalle) {
        this.refPrestamoDetalle = refPrestamoDetalle;
    }

    
}