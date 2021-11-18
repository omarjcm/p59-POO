package ec.edu.ups;

import java.util.*;

/**
 * @author Guillermo Pizarro
 */
public class Libro {

    /**
     * Default constructor
     */
    public Libro() {
    }

    /**
     * 
     */
    public String titulo;

    /**
     * 
     */
    public String subtitulo;

    /**
     * 
     */
    public String isbn;

    /**
     * 
     */
    public Integer edicion;

    /**
     * 
     */
    public Integer anio;


    /**
     * 
     */
    public Set<Autor> refAutor;

    /**
     * 
     */
    public Editorial refEditorial;

    /**
     * 
     */
    public Set<Categoria> refCategoria;

}