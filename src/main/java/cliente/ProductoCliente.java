package cliente;

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

    private static final String BASE_URL = "http://localhost:8080";
    private static ProductoApiService apiService;

    public ProductoCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiService = retrofit.create(ProductoApiService.class);
    }

    public List<Producto> listarTodosLosProductos() throws Exception {

        Response<List<Producto>> response = apiService.getAllProductos().execute();
        if (response.isSuccessful()) {
            List<Producto> productos = response.body();
            productos.forEach(usuario -> System.out.println(usuario));
            return productos;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Producto No Encontrado");
        }
    }
}
