/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baseDeDatos;

import modelo.Usuario;

/**
 *
 * @author Rossi
 */
public class Ejecutable {
    public static void main (String[] args){
    char[] clave = {'2','0','2','5'};
    String telefonoAdmin = "3128759965";
        Usuario admin = new Usuario("Julia", clave, telefonoAdmin, 123, "julia@gmail.com");
        Usuario vendedor = new Usuario("Vendedor", clave, "3008963977", 124, "vendedor@gmail.com");
    }
}
