package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Especialidad;
import ec.edu.ups.vista.MenuPrincipal;

/**
 * @author Guillermo Pizarro
 */
public class GestionarConsultaMedica {

    /**
     * Default constructor
     */
    public GestionarConsultaMedica() {
        this.cargarEspecialidades();
        
        this.refGestionarPaciente = new GestionarPaciente();
        this.refGestionarConsulta = new GestionarConsulta();
    }

    public void cargarEspecialidades() {
        this.refGestionarEspecialidad = new GestionarEspecialidad();
        
        Especialidad obj = new Especialidad();
        obj.setNombre("Medicina General");
        obj.setValor(30.0);
        this.refGestionarEspecialidad.registrar(obj);
        obj = new Especialidad("Cardiologia", 35.0);
        this.refGestionarEspecialidad.registrar(obj);
        this.refGestionarEspecialidad.registrar( new Especialidad("Traumatologia", 50.0) );
        this.refGestionarEspecialidad.registrar( new Especialidad("Dermatologia", 45.0) );
        this.refGestionarEspecialidad.registrar( new Especialidad("Pediatria", 40.0) );
    }
    
    /**
     * 
     */
    private GestionarMedico refGestionarMedico;

    /**
     * 
     */
    private GestionarConsulta refGestionarConsulta;

    /**
     * 
     */
    private GestionarPaciente refGestionarPaciente;

    /**
     * 
     */
    private GestionarEspecialidad refGestionarEspecialidad;

    /**
     * 
     */
    private MenuPrincipal refMenuPrincipal;

    public GestionarMedico getRefGestionarMedico() {
        return refGestionarMedico;
    }

    public void setRefGestionarMedico(GestionarMedico refGestionarMedico) {
        this.refGestionarMedico = refGestionarMedico;
    }

    public GestionarConsulta getRefGestionarConsulta() {
        return refGestionarConsulta;
    }

    public void setRefGestionarConsulta(GestionarConsulta refGestionarConsulta) {
        this.refGestionarConsulta = refGestionarConsulta;
    }

    public GestionarPaciente getRefGestionarPaciente() {
        return refGestionarPaciente;
    }

    public void setRefGestionarPaciente(GestionarPaciente refGestionarPaciente) {
        this.refGestionarPaciente = refGestionarPaciente;
    }

    public GestionarEspecialidad getRefGestionarEspecialidad() {
        return refGestionarEspecialidad;
    }

    public void setRefGestionarEspecialidad(GestionarEspecialidad refGestionarEspecialidad) {
        this.refGestionarEspecialidad = refGestionarEspecialidad;
    }

    public MenuPrincipal getRefMenuPrincipal() {
        return refMenuPrincipal;
    }

    public void setRefMenuPrincipal(MenuPrincipal refMenuPrincipal) {
        this.refMenuPrincipal = refMenuPrincipal;
    }
    
    
}