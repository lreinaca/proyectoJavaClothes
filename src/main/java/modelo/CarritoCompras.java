package modelo;

import java.util.List;

/**
 *
 * @author lreinac
 */
public class CarritoCompras {

    // ATRIBUTOS 
    private int carritoId;
    private Usuario usuario;
    private List<DetalleCarrito> detallesCarritos;

    // CONSTRUCTOR 
    public CarritoCompras(int carritoId, Usuario usuario) {
        this.carritoId = carritoId;
        this.usuario = usuario;
    }

    // GETTERS AND SETTERS 
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

    public List<DetalleCarrito> getDetallesCarritos() {
        return detallesCarritos;
    }

    public void setDetallesCarritos(List<DetalleCarrito> detallesCarritos) {
        this.detallesCarritos = detallesCarritos;
    }

    @Override
    public String toString() {
        return "CarritoCompras{" + "carritoId=" + carritoId + ", usuario=" + usuario + ", detallesCarritos=" + detallesCarritos + '}';
    }
    
    

}
