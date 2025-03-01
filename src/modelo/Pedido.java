
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    
    private int pedidoId;
    private Cliente cliente;
    private EstadosPedido estado;
    private LocalDate fecha; 
    private ArrayList<DetalleFactura> detallesVenta;

    public Pedido(Cliente cliente, EstadosPedido estado, LocalDate fecha, ArrayList<DetalleFactura> detallesVenta) {
        this.pedidoId = 0000;
        this.cliente = cliente;
        this.estado = estado;
        this.fecha = fecha;
        this.detallesVenta = detallesVenta;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EstadosPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadosPedido estado) {
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<DetalleFactura> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(ArrayList<DetalleFactura> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }
    
    
    
    
    
    
    
    
}
