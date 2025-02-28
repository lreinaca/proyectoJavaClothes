/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author juanv
 */
public class Usuario {
    private String nombre;
    private char[] clave;
    private String numeroDeTelefono; //revisar
    private int cedula;
    private String email;

    public Usuario(String nombre, char[] clave, String numeroDeTelefono, int cedula, String email) {
        this.nombre = nombre;
        this.clave = clave;
        this.numeroDeTelefono = numeroDeTelefono;
        this.cedula = cedula;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char[] getClave() {
        return clave;
    }

    public void setClave(char[] clave) {
        this.clave = clave;
    }

    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
