/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.vista;

import ejercicio_01.controlador.Constantes;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Core i5 11va
 */
public class FigurasGeometricasApp {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ventana.setSize( Constantes.ANCHO_VENTANA, Constantes.ALTO_VENTANA );
        ventana.setTitle( "Un panel con un rectangulo." );
        
        RectanguloPanel panel = new RectanguloPanel();
        panel.setBackground(Color.WHITE);
        ventana.add(panel);
        
        ventana.setVisible(true);
    }
}
