/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.swing.JButton;

/**
 *
 * @author Guillermo Pizarro
 */
public class Contacto implements Serializable {
    
    private String nombre;
    private String apellido;
    private String telefono;
    
    public Contacto() {
    }
    
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Object[] getDatos() {
        JButton btnModificar = new JButton("Modificar");
        btnModificar.setName("M");
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setName("E");

        Object[] valores = { this.nombre, this.apellido, this.telefono, btnModificar, btnEliminar};
        return valores;
    }
}