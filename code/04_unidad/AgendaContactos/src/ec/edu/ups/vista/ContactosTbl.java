/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.Constantes;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Core i5 11va
 */
public class ContactosTbl {
    
    public ContactosTbl(){
    }
    
    public void verTabla(JTable tabla, ResourceBundle recurso) {
        tabla.setDefaultRenderer(Object.class, new Render());
        
        JButton modificarBtn = new JButton( recurso.getString( Constantes.VENTANA_MODIFICAR ) );
        modificarBtn.setName("M");
        JButton eliminarBtn = new JButton( recurso.getString( Constantes.VENTANA_ELIMINAR ) );
        eliminarBtn.setName("E");
        
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][]{},
                new Object[]{ recurso.getString( Constantes.CONTACTO_NOMBRE ) , 
                              recurso.getString( Constantes.CONTACTO_APELLIDO ), 
                              recurso.getString( Constantes.CONTACTO_TELEFONO ), 
                              recurso.getString( Constantes.VENTANA_MODIFICAR ), 
                              recurso.getString( Constantes.VENTANA_ELIMINAR ) }
        );
        
        tabla.setModel(modelo);
        tabla.setRowHeight(30);
    }
}
