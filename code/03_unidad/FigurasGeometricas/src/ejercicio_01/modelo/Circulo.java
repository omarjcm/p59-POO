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
public class Circulo extends FiguraGeometrica {
    
    private int radio;
    
    public Circulo(Color color, Point posicion, int radio) {
        super(color, posicion);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2); 
    }
}
