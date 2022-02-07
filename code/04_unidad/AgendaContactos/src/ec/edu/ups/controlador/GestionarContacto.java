/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Contacto;
import ec.edu.ups.modelo.datos.ArchivoBinario;
import java.util.LinkedList;

/**
 *
 * @author Core i5 11va
 */
public class GestionarContacto extends GestionarObjeto {
    
    private LinkedList<Contacto> contactos;
    
    public GestionarContacto(){
        this.contactos = new LinkedList<Contacto>();
    }

    @Override
    public Boolean registrar(Object objeto) {
        Contacto contacto = (Contacto) objeto;
        this.contactos.add(contacto);
        
        return ArchivoBinario.escribir( this.contactos );
    }

    @Override
    public Boolean modificar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object obtener(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Object> listar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
