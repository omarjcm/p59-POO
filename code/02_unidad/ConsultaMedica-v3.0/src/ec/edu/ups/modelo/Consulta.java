package ec.edu.ups.modelo;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Consulta {

    /**
     * Default constructor
     */
    public Consulta() {
    }

    /**
     * 
     */
    private Double descuento;

    /**
     * 
     */
    private Double valorTotal;

    /**
     * 
     */
    private Paciente refPaciente;

    /**
     * 
     */
    private Especialidad refEspecialidad;

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Paciente getRefPaciente() {
        return refPaciente;
    }

    public void setRefPaciente(Paciente refPaciente) {
        this.refPaciente = refPaciente;
    }

    public Especialidad getRefEspecialidad() {
        return refEspecialidad;
    }

    public void setRefEspecialidad(Especialidad refEspecialidad) {
        this.refEspecialidad = refEspecialidad;
    }
    
    
}