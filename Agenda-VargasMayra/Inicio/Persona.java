
package Inicio;

import java.io.Serializable;


public class Persona {
    
    private int codigo;
    private String nombre;
    private String telefono;
    private String correo;
    private String fCumple;

    public Persona(){}
    
    public Persona(int codigo, String nombre, String telefono, String correo, String fCumple){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fCumple = fCumple;
    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param precio the precio to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the descripcion
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    /**
     * @return the descripcion
     */
    public String getfCumple() {
        return fCumple;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setfCumple(String fCumple) {
        this.fCumple = fCumple;
    }
    
}
