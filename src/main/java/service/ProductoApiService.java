package service;

import java.util.List;
import modelo.Producto;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * @author lreinac
 */
public interface ProductoApiService {
    @GET("/api/productos")
    Call<List<Producto>> getAllProductos();
    

    
    
}
