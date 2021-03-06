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
        Paciente paciente = (Paciente) objeto;
        for (int i=0; i<this.refPacientes.size(); i++) {
            Paciente temp = this.refPacientes.get(i);
            if (temp.getNombre().compareTo( paciente.getNombre() ) == 0 &&
                    temp.getApellido().compareTo( paciente.getApellido() ) == 0) {
                this.refPacientes.set(i, new Paciente(paciente));
                break;
            }
        }
    }

    /**
     * @param objeto
     */
    public void eliminar(Object objeto) {
        Paciente paciente = (Paciente) objeto;
        for (int i=0; i<this.refPacientes.size(); i++) {
            Paciente temp = this.refPacientes.get(i);
            if (temp.getNombre().compareTo( paciente.getNombre() ) == 0 &&
                    temp.getApellido().compareTo( paciente.getApellido() ) == 0) {
                this.refPacientes.remove(i);
                break;
            }
        }
    }

    /**
     * @param objeto 
     * @return
     */
    public ArrayList leer(Object objeto) {
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        Paciente paciente = (Paciente) objeto;
        for (int i=0; i<this.refPacientes.size(); i++) {
            Paciente temp = this.refPacientes.get(i);
            if (temp.getNombre().contains( paciente.getNombre() ) ||
                    temp.getApellido().contains( paciente.getApellido() )) {
                pacientes.add( temp );
            }
        }
        return pacientes;
    }

}