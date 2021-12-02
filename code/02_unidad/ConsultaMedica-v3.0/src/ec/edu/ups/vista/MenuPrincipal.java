package ec.edu.ups.vista;

import ec.edu.ups.modelo.Especialidad;
import ec.edu.ups.modelo.Paciente;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class MenuPrincipal {

    /**
     * Default constructor
     */
    public MenuPrincipal() {
    }
    
    public String menuSalir(Scanner consola) {
        String opcion = "";
        do {
            System.out.println("¿Desea salir [S-N]?");
            opcion = consola.nextLine();
        } while(!(opcion.compareTo("S") == 0 || 
                opcion.compareTo("N") == 0));
        
        return opcion;
    }
    
    public Paciente ingresarDatosPaciente(Scanner consola) {
        Paciente paciente = new Paciente();
        
        System.out.println("Ingresar nombre: ");
        paciente.setNombre( consola.nextLine() );
        System.out.println("Ingresar apellido: ");
        paciente.setApellido( consola.nextLine() );
        System.out.println("Ingresar sexo: ");
        paciente.setSexo( consola.nextLine() );
        System.out.println("Ingresar año de nacimiento: ");
        Integer anioNacimiento = Integer.parseInt( consola.nextLine() );
        paciente.setAnioNacimiento( anioNacimiento );
        
        return paciente;
    } 
    
    /**
     * 
     */
    public void presentarMenuPrincipal() {
        System.out.println("=================================");
        System.out.println("S I S T E M A   M E D I C O");
        System.out.println("=================================");
    }

    /**
     * 
     */
    public void presentarEspecialidades(ArrayList<Especialidad> objetos) {
        int opciones = 1;
        
        System.out.println("=================================");
        System.out.println("Especialidades: ");
        System.out.println("=================================");
        for (int i=0; i<objetos.size(); i++) {
            System.out.println(opciones + ".- " + objetos.get(i).getNombre() + ".");
            opciones++;
        }
    }
}