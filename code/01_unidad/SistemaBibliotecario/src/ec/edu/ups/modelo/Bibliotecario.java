package ec.edu.ups.modelo;

/**
 * @author Guillermo Pizarro
 */
public class Bibliotecario extends Persona {

    /**
     * Default constructor
     */
    public Bibliotecario() {
    }

    /**
     * 
     */
    private String usuario;

    /**
     * 
     */
    private String clave;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    
}