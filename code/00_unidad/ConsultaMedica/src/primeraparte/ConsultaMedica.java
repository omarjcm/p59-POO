/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeraparte;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Core i5 11va
 */
public class ConsultaMedica {
    public static void main(String[] args) {
        int contMasc = 0, contFem = 0;
        int contA = 0, contB = 0, contC = 0, contD = 0, contE = 0;
        Double valorA = 30.0, valorB = 35.0, valorC = 50.0, valorD = 45.0, valorE = 40.0;
        int ANIO_ACTUAL = 2021;
        Boolean esTerceraEdad = false;
        int contDescA = 0, contDescB = 0, contDescC = 0, contDescD = 0, contDescE = 0;
        
        System.out.println("CONSULTA MEDICA");
        while(true) {
            Scanner consola = new Scanner(System.in);
            
            System.out.print("Nombres del Paciente: ");
            String paciente = consola.nextLine();
            
            /* Ingreso del sexo y validacion */
            String sexo = "";
            do {
                System.out.print("Sexo del Paciente [M/F]: ");
                sexo = consola.nextLine();
            } while(sexo.compareTo("M") != 0 && sexo.compareTo("F") != 0);
            if (sexo.compareTo("M") == 0) {
                contMasc++;
            } else if (sexo.compareTo("F") == 0) {
                contFem++;
            }
            
            System.out.print("Año de nacimiento del Paciente: ");
            int anio = consola.nextInt();
            if ((ANIO_ACTUAL - anio) >= 65) {
                esTerceraEdad = true;
            }
            
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
            
            switch(especialidad) {
                case "A":
                    contA++;
                    if (esTerceraEdad)
                        contDescA++;
                    break;
                case "B":
                    contB++;
                    if (esTerceraEdad)
                        contDescB++;
                    break;
                case "C":
                    contC++;
                    if (esTerceraEdad)
                        contDescC++;
                    break;
                case "D":
                    contD++;
                    if (esTerceraEdad)
                        contDescD++;
                    break;
                case "E":
                    contE++;
                    if (esTerceraEdad)
                        contDescE++;
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
        System.out.println("CANTIDAD DE CONSULTAS POR ESPECIALIDAD: ");
        System.out.println("A. Medicina General: " + contA);
        System.out.println("B. Cardiologia: " + contB);
        System.out.println("C. Traumatologia: " + contC);
        System.out.println("D. Dermatologia: " + contD);
        System.out.println("E. Pediatria: " + contE);
        
        /*
        Total de descuentos
        */
        System.out.println("TOTAL DE DESCUENTOS POR ESPECIALIDAD: ");
        System.out.println("A. Medicina General: " + contDescA*valorA*0.1);
        System.out.println("B. Cardiologia: " + contDescB*valorB*0.1);
        System.out.println("C. Traumatologia: " + contDescC*valorC*0.1);
        System.out.println("D. Dermatologia: " + contDescD*valorD*0.1);
        System.out.println("E. Pediatria: " + + contDescE*valorE*0.1);
        
        /*
        Totales por especialidad
        */
        System.out.println("TOTALES POR ESPECIALIDAD: ");
        System.out.println("A. Medicina General: ");
        System.out.println("B. Cardiologia: ");
        System.out.println("C. Traumatologia: ");
        System.out.println("D. Dermatologia: ");
        System.out.println("E. Pediatria: ");
                
        /*
        Total de consultas
        */
        
        /*
        Total de pacientes y total de pacientes por sexo
        */
    }
}
