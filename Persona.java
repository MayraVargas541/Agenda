public class Persona {
    private String Nombre;
    private String Telefono;
    private String Correo;
    private String FCumple;
    private String Tipo;
    
    public String getNombre(){
     return Nombre;
    }
    
    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public String getCorreo(){
     return Correo;
    }
    
    public void setCorreo(String correo){
        this.Correo = correo;
    }
    
    public String getTelefono(){
     return Telefono;
    }
    
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
   
   public String getFCumple(){
     return FCumple;
    }
    
    public void setFCumple(String fCumple){
        this.FCumple = fCumple;
    }
   
}
