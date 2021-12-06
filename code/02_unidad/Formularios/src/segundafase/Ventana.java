/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundafase;

import javax.swing.JFrame;

/**
 *
 * @author Core i5 11va
 */
public class Ventana extends JFrame {
    public Ventana(String titulo) {
        iniciarComponentes(titulo);
    }
    
    public void iniciarComponentes(String titulo) {
        this.setTitle(titulo);
        this.addWindowListener( new VentanaMonitor() );
        this.setSize(400, 100);
        this.setVisible( true );
    }
}
