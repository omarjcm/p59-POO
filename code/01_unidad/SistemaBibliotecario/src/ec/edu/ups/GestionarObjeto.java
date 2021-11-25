/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups;

/**
 *
 * @author Core i5 11va
 */
public abstract class GestionarObjeto {
    
    public abstract void registrar(Object objeto);
    public abstract void modificar(Object objeto);
    public abstract void eliminar(Object objeto);
    public abstract void leer(Object objeto);
    
    public void imprimir() {
        System.out.println("Hola mundo");
    }
}
