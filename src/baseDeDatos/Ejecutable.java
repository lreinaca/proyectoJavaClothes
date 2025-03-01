
package baseDeDatos;

import modelo.Usuario;

public class Ejecutable {
    public static void main (String[] args){
    char[] clave = {'2','0','2','5'};
    String telefonoAdmin = "3128759965";
        Usuario admin = new Usuario("Julia", clave, telefonoAdmin, 123, "julia@gmail.com");
        Usuario vendedor = new Usuario("Vendedor", clave, "3008963977", 124, "vendedor@gmail.com");
        Usuario cliente = new Usuario("Paula", clave, "3168964456", 124, "cliente@gmail.com");
    }
}
