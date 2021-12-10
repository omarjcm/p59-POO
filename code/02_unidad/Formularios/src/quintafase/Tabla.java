/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quintafase;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Core i5 11va
 */
public class Tabla {
    public void verTabla(JTable tabla) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{{"1", "Guillermo"}, {"2", "Karina"}, {"3", "Sofia"}, {"4", "Catalina"}},
                new Object[]{"Codigo", "Nombre"}
        );
        tabla.setModel(model);
    }
}
