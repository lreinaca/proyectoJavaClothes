
package main.java.modelo;

public class DetallePedido {
    private int detalleId;
    private int cantidad;
    
    private Pedido pedido;
    private Producto producto; 

    public DetallePedido(int ventaId, int cantidad, Pedido pedido, Producto producto) {
        this.detalleId = ventaId;
        this.cantidad = cantidad;
       
        this.pedido = pedido;
        this.producto = producto;
    }

    public int getDetalleId() {
        return detalleId;
    }

    public void setDetalleId(int detalleId) {
        this.detalleId = detalleId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    

}
