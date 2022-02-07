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
        this.contactos = ArchivoBinario.leer();
        if (this.contactos == null)
            this.contactos = new LinkedList<Contacto>();
    }

    public LinkedList<Contacto> getContactos() {
        return this.contactos;
    }
    
    @Override
    public Boolean registrar(Object objeto) {
        Contacto contacto = (Contacto) objeto;
        this.contactos.add(contacto);
        
        return ArchivoBinario.escribir( this.contactos );
    }

    @Override
    public Boolean modificar(Object objeto) {
        Contacto contacto = (Contacto) objeto;
        
        for (int i=0; i<this.contactos.size(); i++) {
            Contacto elemento = this.contactos.get(i);
            if (contacto.getId().equals( elemento.getId() )) {
                this.contactos.set(i, contacto);
            }
        }
        return ArchivoBinario.escribir(this.contactos);
    }

    @Override
    public Boolean eliminar(Object objeto) {
        Contacto contacto = (Contacto) objeto;
        
        for (int i=0; i<this.contactos.size(); i++) {
            Contacto elemento = this.contactos.get(i);
            if (contacto.getId().equals( elemento.getId() )) {
                this.contactos.remove(i);
                break;
            }
        }
        return ArchivoBinario.escribir(this.contactos);
    }

    @Override
    public Object obtener(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LinkedList<Object> listar(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Contacto buscarIdPorNombreApellidoTelefono(Contacto contacto) {
        for (Contacto objeto : this.contactos) {
            if (objeto.getNombre().equals( contacto.getNombre() ) && 
                    objeto.getApellido().equals( contacto.getApellido() ) &&
                    objeto.getTelefono().equals( contacto.getTelefono() )) {
                contacto.setId( objeto.getId() );
                return contacto;
            }
        }
        return null;
    }
}
