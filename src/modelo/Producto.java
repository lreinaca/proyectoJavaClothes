
package modelo;

public class Producto {
    
    private int productoId;
    private int stock; 
    private double precio; 
    private String nombre;
    private String color;
    private String talla; 
    private String material;
    private String descripcion;
    private String categoria;
    private String tipo;

    public Producto(int productoId, int stock, double precio, String nombre, String color, String talla, String material, String descripcion, String categoria, String tipo) {
        this.productoId = productoId;
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
        this.color = color;
        this.talla = talla;
        this.material = material;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.tipo = tipo;
    }


    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    

}
