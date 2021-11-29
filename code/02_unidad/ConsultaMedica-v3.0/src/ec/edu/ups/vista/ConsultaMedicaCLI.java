package ec.edu.ups.vista;

import ec.edu.ups.modelo.Paciente;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class ConsultaMedicaCLI {

    /**
     * Default constructor
     */
    public ConsultaMedicaCLI() {
    }

    public static void main(String[] args) {
        ConsultaMedica app = new ConsultaMedica();
        MenuPrincipal menu = new MenuPrincipal();
        
        while(true) {
            menu.presentarMenuPrincipal();
            
            Scanner consola = new Scanner(System.in);
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
            
            app.getRefGestionarPaciente().registrar( paciente );
            
            
        }
    }
}