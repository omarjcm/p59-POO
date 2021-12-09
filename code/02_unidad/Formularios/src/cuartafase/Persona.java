/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuartafase;

import java.util.Vector;

/**
 *
 * @author Core i5 11va
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    
    public Persona() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String[] getDatos(int id) {
        String[] valores = { String.valueOf(id), this.nombre, this.apellido, this.correoElectronico };
        return valores;
    }
    
    
}
