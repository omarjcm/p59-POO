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
public class Ventana extends JFrame {
    public Ventana(String titulo) {
        this.setTitle(titulo);
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setSize(400, 100);
        this.setVisible( true );
    }
}