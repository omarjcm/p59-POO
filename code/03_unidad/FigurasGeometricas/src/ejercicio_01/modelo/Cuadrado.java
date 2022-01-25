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
public class Cuadrado extends FiguraGeometrica {

    private int lado;
    
    public Cuadrado(Color color, Point posicion, int lado) {
        super(color, posicion);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
