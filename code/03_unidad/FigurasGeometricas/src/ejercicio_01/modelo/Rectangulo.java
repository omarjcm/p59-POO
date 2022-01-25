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
public class Rectangulo extends FiguraGeometrica {
    
    private int ancho;
    private int alto;
    
    public Rectangulo(Color color, Point posicion, int alto, int ancho) {
        super(color, posicion);
        this.alto = alto;
        this.ancho = ancho;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return this.alto * this.ancho;
    }    
}
