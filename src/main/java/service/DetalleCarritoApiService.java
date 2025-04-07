
package service;

import java.util.List;
import modelo.DetalleCarrito;
import modelo.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
public interface DetalleCarritoApiService {
       
    @GET("/api/detalleCarrito")
    Call<List<DetalleCarrito>> getAllDetalleCarrito();

    @GET("/api/detalleCarrito/{id}/{cantidad}")
    Call<DetalleCarrito> getDetalleCarritoById(@Path("id") int idDetalleCarrito, @Path ("cantidad") int cantidad);

    @POST("/api/detalleCarrito/")
    Call<DetalleCarrito> createDetalleCarrito(@Body DetalleCarrito detalleCarrito);

    @PUT("/api/detalleCarrito/{id}/{cantidad}")
    Call<DetalleCarrito> updateDetalleCarrito(@Path("id") int idCarritoCompras,@Path ("cantidad") int cantidad, @Body DetalleCarrito detalleCarrito);

    @DELETE("/api/detalleCarrito/{id}")
    Call<Void> deleteDetalleCarrito(@Path("id") int idDetalleCarrito);

    @GET("/api/detalleCarrito/buscar")
    Call<List<DetalleCarrito>> buscarDetalleCarrito(
        @Query("id") int idDetalleCarrito,
        @Query("cantidad") int cantidad
    );
}
