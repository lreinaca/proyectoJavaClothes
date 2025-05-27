package modelo;

public class Producto {

    // ATRIBUTOS 
    private Integer prod_id;
    private Integer stock;
    private Double precio;
    private String nombre;
    private String color;
    private String talla;
    private String material;
    private String descripcion;
    private String categoria;
    private String tipo;
    private String url_imagen;

    // CONSTRUCTOR 
    public Producto(Integer stock, Double precio, String nombre, String color, String talla, String material,
            String descripcion, String categoria, String tipo, String url_imagen) {
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
        this.color = color;
        this.talla = talla;
        this.material = material;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.tipo = tipo;
        this.url_imagen = url_imagen;
    }
    
    // CONSTRUCTOR SOLO CON ID 
    public Producto(Integer prod_id) {
        this.prod_id = prod_id;
    }
    

    // GETTERS AND SETTERS 
    public Integer getProd_id() {
        return prod_id;
    }

    public void setProd_id(Integer prod_id) {
        this.prod_id = prod_id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
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

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    // TO STRING 
    @Override
    public String toString() {
        return "Producto{" + "productoId=" + prod_id + ", stock=" + stock + ", precio=" + precio + ", nombre=" + nombre + ", color=" + color + ", talla=" + talla + ", material=" + material + ", descripcion=" + descripcion + ", categoria=" + categoria + ", tipo=" + tipo + '}';
    }

}
