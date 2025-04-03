
package modelo;

/**
 *
 * @author lreinac
 */

public class CarritoCompras {
    private int carritoId;
    private Usuario usuario; 

    public CarritoCompras(int carritoId, Usuario usuario) {
        this.carritoId = carritoId;
        this.usuario = usuario;
    }

    public int getCarritoId() {
        return carritoId;
    }

    public void setCarritoId(int carritoId) {
        this.carritoId = carritoId;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    

}
