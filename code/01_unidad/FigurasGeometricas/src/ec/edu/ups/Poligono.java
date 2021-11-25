/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups;

/**
 *
 * @author Core i5 11va
 */
public abstract class Poligono implements Forma {
    public static int CUALQUIER_COSA = 100;
    private int numLados;
    
    public Poligono(){
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }
    
    public abstract void calcularArea();
    
}
