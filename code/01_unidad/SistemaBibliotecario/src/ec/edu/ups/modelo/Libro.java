package ec.edu.ups.modelo;

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
    private String titulo;

    /**
     * 
     */
    private String subtitulo;

    /**
     * 
     */
    private String isbn;

    /**
     * 
     */
    private Integer edicion;

    /**
     * 
     */
    private Integer anio;

    /**
     * 
     */
    private ArrayList<Autor> refAutor;

    /**
     * 
     */
    private Editorial refEditorial;

    /**
     * 
     */
    private ArrayList<Categoria> refCategoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public ArrayList<Autor> getRefAutor() {
        return refAutor;
    }

    public void setRefAutor(ArrayList<Autor> refAutor) {
        this.refAutor = refAutor;
    }

    public Editorial getRefEditorial() {
        return refEditorial;
    }

    public void setRefEditorial(Editorial refEditorial) {
        this.refEditorial = refEditorial;
    }

    public ArrayList<Categoria> getRefCategoria() {
        return refCategoria;
    }

    public void setRefCategoria(ArrayList<Categoria> refCategoria) {
        this.refCategoria = refCategoria;
    }


    
}