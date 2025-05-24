
package modelo;

/**
 *
 * @author lreinac
 */

public class DetalleCarrito {
    private int detalle_carrito_id;
    private int cantidad; 
    
    private CarritoCompras carritoCompras;
    private Producto producto;

    // constructor por defecto
    public DetalleCarrito() {
    }

    // Constructor completo
    public DetalleCarrito(int cantidad, CarritoCompras carritoCompras, Producto producto) {
        this.cantidad = cantidad;
        this.carritoCompras = carritoCompras;
        this.producto = producto;
    }

    public int getDetalle_carrito_id() {
        return detalle_carrito_id;
    }

    public void setDetalle_carrito_id(int detalle_carrito_id) {
        this.detalle_carrito_id = detalle_carrito_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CarritoCompras getCarritoCompras() {
        return carritoCompras;
    }

    public void setCarritoCompras(CarritoCompras carritoCompras) {
        this.carritoCompras = carritoCompras;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleCarrito{" + "detalleCarritoId=" + detalle_carrito_id + ", cantidad=" + cantidad + ", carritoCompras=" + carritoCompras + ", producto=" + producto + '}';
    }
    
    
    

}
