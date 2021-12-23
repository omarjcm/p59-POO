package ec.edu.ups.vista;

import ec.edu.ups.modelo.Consulta;
import ec.edu.ups.modelo.Especialidad;
import ec.edu.ups.modelo.Paciente;
import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class ConsultaMedicaCLI {

    public static int ANIO_ACTUAL = 2021;
    
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
            
            Paciente paciente = menu.ingresarDatosPaciente(consola);
            
            String opcion = "";
            do {
                menu.presentarEspecialidades( app.getRefGestionarEspecialidad().getRefEspecialidades() );                
                System.out.print("Seleccionar la especialidad: ");
                opcion = consola.nextLine();
            } while(!(opcion.compareTo("1") == 0 || 
                    opcion.compareTo("2") == 0 ||
                    opcion.compareTo("3") == 0 ||
                    opcion.compareTo("4") == 0 ||
                    opcion.compareTo("5") == 0));
            
            Integer opcion_especialidad = Integer.parseInt(opcion) - 1;
            Especialidad objeto = app.getRefGestionarEspecialidad().getRefEspecialidades().get( opcion_especialidad );
            
            Consulta consulta = new Consulta();
            if (paciente.esTerceraEdad()) {
                consulta.setDescuento( objeto.getValor() * 0.10 );
            }
            consulta.setRefEspecialidad(objeto);
            consulta.setRefPaciente(paciente);
            
            app.getRefGestionarConsulta().registrar( consulta );
            
            String salir = menu.menuSalir(consola);
            if (salir.compareTo("S") == 0)
                break;
        }
    }
}