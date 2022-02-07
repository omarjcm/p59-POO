/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.controlador;

import java.util.LinkedList;

/**
 *
 * @author Core i5 11va
 */
public abstract class GestionarObjeto {
    public abstract Boolean registrar(Object objeto);
    public abstract Boolean modificar(Object objeto);
    public abstract Boolean eliminar(Object objeto);
    public abstract Object obtener(Object objeto);    
    public abstract LinkedList<Object> listar(Object objeto);    
}