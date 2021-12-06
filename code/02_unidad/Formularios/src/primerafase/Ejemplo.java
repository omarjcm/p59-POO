/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerafase;

import javax.swing.JFrame;

/**
 *
 * @author Core i5 11va
 */
public class Ejemplo {
    
    public Ejemplo() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(400, 100);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                Ejemplo gui = new Ejemplo();                
            }
        } );
    }
}
