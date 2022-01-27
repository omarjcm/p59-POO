/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.vista;

import javax.swing.JFrame;

/**
 *
 * @author Core i5 11va
 */
public class DibujarApp {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujar");
        ventana.setSize(800, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(new Dibujar());
        ventana.setVisible(true);
    }
}
