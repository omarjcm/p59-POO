/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundafase;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Core i5 11va
 */
public class VentanaMonitor extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        // Obtengo la ventana que quiero cerrar
        Window w = e.getWindow();
        // Desaparece la ventana
        w.setVisible(false);
        // Elimina la ventana
        w.dispose();
        // Cierra el proceso desde el Sistema Operativo
        System.exit(0);
    }
}
