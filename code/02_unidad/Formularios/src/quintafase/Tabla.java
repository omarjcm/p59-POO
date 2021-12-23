/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quintafase;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Core i5 11va
 */
public class Tabla {
    public void verTabla(JTable tabla) {
        tabla.setDefaultRenderer(Object.class, new Render());
        
        JButton btnModificar = new JButton("Modificar");
        btnModificar.setName("M");
        JButton btnEliminar = new JButton("Eliminar");
        btnModificar.setName("E");
        
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{{"1", "Guillermo", btnModificar, btnEliminar}, 
                               {"2", "Karina", btnModificar, btnEliminar}, 
                               {"3", "Sofia", btnModificar, btnEliminar}, 
                               {"4", "Catalina", btnModificar, btnEliminar}},
                new Object[]{"Codigo", "Nombre", "M", "E"}
        ){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla.setModel(model);
        tabla.setRowHeight(30);
    }
}
