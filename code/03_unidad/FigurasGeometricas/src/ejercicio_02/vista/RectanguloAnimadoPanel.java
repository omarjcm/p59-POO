/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_02.vista;

import ejercicio_01.modelo.Rectangulo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Core i5 11va
 */
public class RectanguloAnimadoPanel extends JPanel implements ActionListener {
    
    private Point p1;
    private Point p2;
    private int dx; // desplazamiento en horizontal.
    private int dy; // desplazamiento en vertical.
    
    public RectanguloAnimadoPanel() {
        this.p1 = new Point(20, 40);
        this.p2 = new Point(60,10);
        
        this.dx = 5;
        this.dy = 5;
        
        Timer tiempo = new Timer(100, this);
        tiempo.start();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Rectangulo objeto1 = new Rectangulo(Color.RED, this.p1, 70, 30);
        Rectangulo objeto2 = new Rectangulo(Color.BLUE, this.p2, 20, 80);
        
        g.setColor(objeto1.getColor());
        g.fillRect(objeto1.getX(), objeto1.getY(), objeto1.getAncho(), objeto1.getAlto());
        
        g.setColor(objeto2.getColor());
        g.fillRect(objeto2.getX(), objeto2.getY(), objeto2.getAncho(), objeto2.getAlto());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.p1.x += this.dx;
        this.p2.y += this.dy;
        
        if (this.p1.x <= 0 || this.p1.x + 70 >= this.getWidth()) {
            this.dx = -this.dx;
        }
        if (this.p2.y <= 0 || this.p2.y + 80 >= this.getHeight()) {
            this.dy = -this.dy;
        }
        
        repaint();
    }
}
