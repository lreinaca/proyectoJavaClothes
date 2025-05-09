package modelo;

public class Usuario {
    
    private String usua_id;
    
    private String nombre;
    private String correo;
    private String telefono;
    private Integer rol_rol_id;
    private String clave;
    
    public Usuario(String idUsuario, String nombre, String numeroDeTelefono, String email, Integer idRol, String clave) {
        this.usua_id = idUsuario;
        this.nombre = nombre;
        this.telefono = numeroDeTelefono;
        this.correo = email;
        this.rol_rol_id = idRol;
        this.clave = clave;
    }
    
     public Usuario(String nombre, String numeroDeTelefono, String email) {
        this.nombre = nombre;
        this.telefono = numeroDeTelefono;
        this.correo = email;
    }


    

    public String getUsua_id() {
        return usua_id;
    }

    public void setUsua_id(String usua_id) {
        this.usua_id = usua_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getIdRol() {
        return rol_rol_id;
    }

    public void setIdRol(Integer idRol) {
        this.rol_rol_id = idRol;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + usua_id + ", nombre=" + nombre + ", email=" + correo + ", numeroDeTelefono=" + telefono + ", idRol=" + rol_rol_id + ", clave=" + clave + '}';
    }
    
    
    
}
