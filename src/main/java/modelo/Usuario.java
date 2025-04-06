package modelo;

import modelo.ENUMs.RolUsuario;

/**
 *
 * @author juanv
 */
public class Usuario {
    
    private String idUsuario;
    
    private String nombre;
    private String email;
    private String numeroDeTelefono;
    
    private RolUsuario idRol;
    private String clave;
    
    

    public Usuario(String idUsuario, String nombre, String numeroDeTelefono, String email, RolUsuario idRol, String clave) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.numeroDeTelefono = numeroDeTelefono;
        this.email = email;
        this.idRol = idRol;
        this.clave = clave;
    }
    
     public Usuario(String nombre, String numeroDeTelefono, String email) {
        this.nombre = nombre;
        this.numeroDeTelefono = numeroDeTelefono;
        this.email = email;
    }


    

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RolUsuario getIdRol() {
        return idRol;
    }

    public void setIdRol(RolUsuario idRol) {
        this.idRol = idRol;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", email=" + email + ", numeroDeTelefono=" + numeroDeTelefono + ", idRol=" + idRol + ", clave=" + clave + '}';
    }
    
    
    
}
