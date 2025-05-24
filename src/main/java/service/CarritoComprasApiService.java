package service;

import dto.DetalleCompraClienteDTO;
import java.util.List;
import modelo.CarritoCompras;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
public interface CarritoComprasApiService {
    
    @GET("/api/carritoCompras")
    Call<List<CarritoCompras>> getAllCarritoCompras();

    @GET("/api/carritoCompras/{idCarrito}/{idUsuario}")
    Call<CarritoCompras> getCarritoComprasById(@Path("idCarrito") Integer idCarritoCompras, @Path ("idUsuario") Integer idUsuario);

    @POST("/api/carritoCompras")
    Call<CarritoCompras> createCarritoCompras(
            @Header("Authorization") String token);

    @PUT("/api/carritoCompras/{idCarrito}")
    Call<CarritoCompras> updateCarritoCompras(@Path("idCarrito") Integer idCarritoCompras, @Body DetalleCompraClienteDTO carritoCompras);

    @DELETE("/api/carritoCompras/{idCarrito}")
    Call<Void> deleteCarritoCompras(@Path("idCarrito") Integer idCarritoCompras);

    @GET("/api/carritoCompras/buscar")
    Call<List<CarritoCompras>> buscarCarritoCompras(
        @Query("idCarritoCompras") Integer idCarritoCompras,
        @Query("idUsuario") String usuario
    );
}

