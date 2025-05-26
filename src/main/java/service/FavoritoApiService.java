package service;
import java.util.List;
import modelo.Favorito;
import modelo.Producto;
import modelo.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
public interface FavoritoApiService {
     
    @GET("/api/favorito")
    Call<List<Favorito>> getAllFavorito();

    @GET("/api/favorito/{idFavorito}/{idUsuario}, {idProducto}")
    Call<Favorito> getFavoritoById(@Path("idFavorito") int idFavorito, @Path ("idUsuario") Usuario usuario, @Path ("idProducto") Producto producto);
    
    @GET("api/favoritos/cliente/{idCliente}")
    Call<List<Favorito>> getfavoritosByCliente(@Path("idCliente") Integer idCliente);
    
    @POST("/api/favorito/")
    Call<Favorito> createFavorito(@Body Favorito favorito);

    @PUT("/api/favorito/{idFavorito}/{idUsuario}, {idProducto}")
    Call<Favorito> updateCarritoCompras(@Path("idFavorito") int idFavorito, @Path ("idUsuario") Usuario usuario, @Path ("idProducto") Producto producto, @Body Favorito favorito);

    @DELETE("/api/favorito/{idFavorito}")
    Call<Void> deleteFavorito(@Path("idFavorito") int idFavorito);

    @GET("/api/favorito/buscar")
    Call<List<Favorito>> buscarFavorito(
        @Query("idFavorito") int idFavorito,
        @Query("idUsuario") Usuario usuario,
        @Query("idProducto") Producto producto
    ); 
}
