package service;

import java.util.List;
import modelo.Producto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 *
 * @author lreinac
 */

public interface ProductoApiService {
    @GET("/api/productos")
    Call<List<Producto>> getAllProductos();
    
    @GET("/api/productos/{id}")
    Call<Producto> getProductoById(@Path("id") Integer id);
    
    @PUT("/api/productos/{id}")
    Call<Producto> updateProducto(@Path("id") Integer id, @Body Producto producto);
    
    @POST("/api/productos")
    Call<Producto> createProducto(@Body Producto producto);
    
    

    
    
}
