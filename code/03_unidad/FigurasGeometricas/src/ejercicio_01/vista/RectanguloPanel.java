/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.vista;

import ejercicio_01.controlador.Constantes;
import ejercicio_01.modelo.Circulo;
import ejercicio_01.modelo.Rectangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author Core i5 11va
 */
public class RectanguloPanel extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Point coordenadas = new Point(20, 40);
        Rectangulo objeto = new Rectangulo(Color.RED, coordenadas, Constantes.ANCHO, Constantes.ALTO);
        
        g.setColor(objeto.getColor());
        g.fillRect(objeto.getX(), objeto.getY(), objeto.getAncho(), objeto.getAlto());
        
        coordenadas = new Point(150, 150);
        Circulo objeto2 = new Circulo(Color.ORANGE, coordenadas, Constantes.ANCHO);
        g.setColor(objeto2.getColor());
        g.fillOval(objeto2.getX(), objeto2.getY(), objeto2.getRadio(), objeto2.getRadio());
    }
}
