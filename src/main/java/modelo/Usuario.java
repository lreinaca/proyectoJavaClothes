package modelo;

public class Usuario {
    // ATRIBUTOS 
    private Integer usua_id;
    private Integer rol_rol_id;
    
    private String nombre;
    private String correo;
    private String telefono;
    private String clave;
    
    // CONSTRUCTOR
    /**
     * 
     * @param usua_id
     * @param rol_rol_id
     * @param nombre
     * @param correo
     * @param telefono
     * @param clave 
     */
    public Usuario(Integer usua_id, Integer rol_rol_id, String nombre, String correo, String telefono, String clave) {
        this.usua_id = usua_id;
        this.rol_rol_id = rol_rol_id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.clave = clave;
    }
    
    // SEGUNDO CONSTRUCTOR SOLO PARA EDITAR EL NOMBRE, EL TELEFONO Y EL CORREO 
    public Usuario(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    // GETTERS AND SETTERS
    public Integer getUsua_id() {
        return usua_id;
    }

    public void setUsua_id(Integer usua_id) {
        this.usua_id = usua_id;
    }

    public Integer getRol_rol_id() {
        return rol_rol_id;
    }

    public void setRol_rol_id(Integer rol_rol_id) {
        this.rol_rol_id = rol_rol_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    // TO STRING 

    @Override
    public String toString() {
        return "Usuario{" + "usua_id=" + usua_id + ", rol_rol_id=" + rol_rol_id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", clave=" + clave + '}';
    }
    


    
    
}
