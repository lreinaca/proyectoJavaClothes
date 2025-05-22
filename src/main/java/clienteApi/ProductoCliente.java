package clienteApi;

import java.util.List;
import modelo.Producto;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.ProductoApiService;

/**
 *
 *
 */
public class ProductoCliente {

    // ATRIBUTOS
    private static final String BASE_URL = "http://localhost:8089";
    private static ProductoApiService apiService;

    // CONSTRUCTOR 
    public ProductoCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(ProductoApiService.class);
    }

    // METODO PARA OBTENER TODOS LOS PRODUCTOS
    public List<Producto> listarTodosLosProductos() throws Exception {

        Response<List<Producto>> response = apiService.getAllProductos().execute();
        if (response.isSuccessful()) {
            List<Producto> productos = response.body();
            productos.forEach(usuario -> System.out.println(usuario));
            return productos;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Error en el cargue de Información de Productos");
        }
    }

    // METODO PARA ENCONTRAR UN PRODUCTO POR SU ID
    public Producto findProductoById(Integer idProducto) throws Exception {
        Response<Producto> response = apiService.getProductoById(idProducto).execute();
        if (response.isSuccessful()) {
            Producto producto = response.body();
            System.out.println("Producto Encontrado: " + response.body());
            return producto;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("El producto no fue Encontrado");
        }

    }

    // METODO PARA EDITAR UN PRODUCTO POR SU ID
    public void updateProducto(Integer idProducto, Producto producto) throws Exception {
        Response<Producto> response = apiService.updateProducto(idProducto, producto).execute();
        if (response.isSuccessful()) {
            System.out.println("Producto actualizado: " + response.body());

        } else {
            System.out.println("Error al actualizar producto: " + response.code());
            throw new Exception("Error al actualizar el producto");
        }

    }

    //METODO PARA CREAR UN NUEVO PRODUCTO 
    public Producto createProducto(Producto producto) throws Exception {
        Response<Producto> response = apiService.createProducto(producto).execute();
        if (response.isSuccessful()) {
            Producto productoCreado = response.body();
            System.out.println("Producto creado: " + response.body());
            return productoCreado;
            

        } else {
            System.out.println("Error al crear producto: " + response.code());
            throw new Exception("Error al crear el producto");
        }

    }


}
