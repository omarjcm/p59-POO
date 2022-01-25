/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_01.modelo;

import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author Core i5 11va
 */
public abstract class FiguraGeometrica {
    
    private Color color;
    private Point posicion;
    
    public FiguraGeometrica(Color color, Point posicion) {
        this.color = color;
        this.posicion = posicion;
    }
    
    public abstract double calcularArea();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getPosicion() {
        return posicion;
    }

    public void setPosicion(Point posicion) {
        this.posicion = posicion;
    }
    
    public int getX() {
        return (int)this.posicion.getX();
    }
    
    public int getY() {
        return (int)this.posicion.getY();
    }
}