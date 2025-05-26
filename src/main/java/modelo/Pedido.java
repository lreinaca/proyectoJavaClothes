
package modelo;

import java.time.LocalDate;
import modelo.ENUMs.EstadosPedido;
import java.util.ArrayList;

public class Pedido {
    
    private Integer pediId;
    private Factura factura; 
    private Usuario usuario;
    private EstadosPedido estado;
    private LocalDate fechaPedido;
    private String codigoCompra;
    private ArrayList<DetallePedido> detallesVenta;

    public Pedido(int pedidoId, Factura factura, Usuario cliente, EstadosPedido estado, LocalDate fecha, String codigoCompra, ArrayList<DetallePedido> detallesVenta) {
        this.pediId = pedidoId;
        this.factura = factura;
        this.usuario = cliente;
        this.estado = estado;
        this.fechaPedido = fecha;
        this.codigoCompra = codigoCompra;
        this.detallesVenta = detallesVenta;
    }

    public int getPediId() {
        return pediId;
    }

    public void setPediId(int pediId) {
        this.pediId = pediId;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public EstadosPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadosPedido estado) {
        this.estado = estado;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public ArrayList<DetallePedido> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(ArrayList<DetallePedido> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }
    
}
