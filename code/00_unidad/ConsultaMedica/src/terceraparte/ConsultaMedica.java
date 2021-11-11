/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terceraparte;

import java.util.Scanner;

/**
 *
 * @author Core i5 11va
 */
public class ConsultaMedica {
    public static void main(String[] args) {
        int[] contSexo = new int[2];
        int[] cont = new int[5];
        int[] contDesc = new int[5];
        double[] valor = {30.0, 35.0, 50.0, 45.0, 40.0};
        int ANIO_ACTUAL = 2021;
        Boolean esTerceraEdad = false;
        
        System.out.println("CONSULTA MEDICA");
        while(true) {
            Scanner consola = new Scanner(System.in);
            
            System.out.print("Nombres del Paciente: ");
            String paciente = consola.nextLine();
            
            /* Ingreso del sexo y validacion */
            String sexo = validarSexo(consola);
            if (sexo.compareTo("M") == 0) {
                contSexo[0]++;
            } else if (sexo.compareTo("F") == 0) {
                contSexo[1]++;
            }
            
            System.out.print("Año de nacimiento del Paciente: ");
            int anio = validarAnioNacimiento(consola);
            if ((ANIO_ACTUAL - anio) >= 65) {
                esTerceraEdad = true;
            }
            
            String especialidad = seleccionarEspecialidad(consola);
            switch(especialidad) {
                case "A":
                    cont[0]++;
                    if (esTerceraEdad)
                        contDesc[0]++;
                    break;
                case "B":
                    cont[1]++;
                    if (esTerceraEdad)
                        contDesc[1]++;
                    break;
                case "C":
                    cont[2]++;
                    if (esTerceraEdad)
                        contDesc[2]++;
                    break;
                case "D":
                    cont[3]++;
                    if (esTerceraEdad)
                        contDesc[3]++;
                    break;
                case "E":
                    cont[4]++;
                    if (esTerceraEdad)
                        contDesc[4]++;
                    break;
            }
            
            esTerceraEdad = false;
            System.out.println("Desea salir? [S/N]: ");
            String opcion = consola.nextLine();
            
            if (opcion.compareTo("S") == 0) {
                break;
            }
        }
        
        /*
        Cantidad de Consultas por especialidad
        */
        consultasXEspecialidad(cont);
        /*
        Total de descuentos
        */
        double[] desc = new double[5];
        for (int i=0; i<desc.length; i++) {
            desc[i] = contDesc[i]*valor[i]*0.1;
        }
        consultasDescuentosXEspecialidad(desc);        
        /*
        Totales por especialidad
        */
        double[] total = new double[5];
        for (int i=0; i<total.length; i++) {
            total[i] = (cont[i] * valor[i]) - desc[i];
        }
        consultaTotalesXEspecialidad(total);
        
        /*
        Total de consultas
        */
        double sumador = 0.0;
        for (int i=0; i<total.length; i++) {
            sumador = sumador + total[i];
        }
        consultaTotal(sumador);
        /*
        Total de pacientes y total de pacientes por sexo
        */
        consultasXPacienteXSexo(contSexo);
    }
    
    public static String seleccionarEspecialidad(Scanner consola) {
            String especialidad = "";
            do {
                System.out.println("Especialidades: ");
                System.out.println("A. Medicina General");
                System.out.println("B. Cardiologia");
                System.out.println("C. Traumatologia");
                System.out.println("D. Dermatologia");
                System.out.println("E. Pediatria");
                System.out.print("Seleccionar la especialidad: ");
                especialidad = consola.nextLine();
            } while(especialidad.compareTo("A") != 0 && 
                    especialidad.compareTo("B") != 0 &&
                    especialidad.compareTo("C") != 0 &&
                    especialidad.compareTo("D") != 0 &&
                    especialidad.compareTo("E") != 0);
            return especialidad;
    }
    
    public static int validarAnioNacimiento(Scanner consola) {
        String anio_nacimiento = consola.nextLine();
        return Integer.parseInt(anio_nacimiento);
    }
    
    public static String validarSexo(Scanner consola) {
        String sexo = "";
        do {
            System.out.print("Sexo del Paciente [M/F]: ");
            sexo = consola.nextLine();
        } while(sexo.compareTo("M") != 0 && sexo.compareTo("F") != 0);
        return sexo;
    }
    
    public static void consultasXEspecialidad(int[] cont) {
        System.out.println("CANTIDAD DE CONSULTAS POR ESPECIALIDAD: ");
        System.out.println("A. Medicina General: " + cont[0]);
        System.out.println("B. Cardiologia: " + cont[1]);
        System.out.println("C. Traumatologia: " + cont[2]);
        System.out.println("D. Dermatologia: " + cont[3]);
        System.out.println("E. Pediatria: " + cont[4]);
    }
    
    public static void consultasDescuentosXEspecialidad(double[] desc) {
        System.out.println("TOTAL DE DESCUENTOS POR ESPECIALIDAD: ");
        System.out.println("A. Medicina General: " + desc[0]);
        System.out.println("B. Cardiologia: " + desc[1]);
        System.out.println("C. Traumatologia: " + desc[2]);
        System.out.println("D. Dermatologia: " + desc[3]);
        System.out.println("E. Pediatria: " + desc[4]);
    }
    // Lower camel case
    public static void consultaTotalesXEspecialidad(double[] total) {
        System.out.println("TOTALES POR ESPECIALIDAD: ");
        System.out.println("A. Medicina General: " + total[0]);
        System.out.println("B. Cardiologia: " + total[1]);
        System.out.println("C. Traumatologia: " + total[2]);
        System.out.println("D. Dermatologia: " + total[3]);
        System.out.println("E. Pediatria: " + total[4]);        
    }
    
    public static void consultaTotal(double total) {
        System.out.println("TOTAL POR LAS CONSULTAS: " + total);
    }
    
    public static void consultasXPacienteXSexo(int[] contSexo) {
        System.out.println("Total de Pacientes: " + (contSexo[0] + contSexo[1]));
        System.out.println("Total de Pacientes Masculinos: " + (contSexo[0]));
        System.out.println("Total de Pacientes Femeninos: " + (contSexo[1]));        
    }
}
