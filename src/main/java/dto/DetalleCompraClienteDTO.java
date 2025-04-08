package dto;

import modelo.*;
import java.util.List;

/**
 *
 * @author lreinac
 */
public class DetalleCompraClienteDTO {

    // ATRIBUTOS
    private CarritoCompras carritoCompras;
    private Integer idProducto;

    // CONSTRUCTOR
    public DetalleCompraClienteDTO(CarritoCompras carritoCompras, Integer idProducto) {
        this.carritoCompras = carritoCompras;
        this.idProducto = idProducto;
    }

    // GETTERS AND SETTERS

    public CarritoCompras getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(CarritoCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    

}
