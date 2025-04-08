
package service;

import dto.UsuarioLoginDTO;
import java.util.List;
import modelo.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 *
 * @author lreinac
 */
public interface UsuarioApiService {
    @GET("/javaClothes/usuarios")
    Call<List<Usuario>> getAllUsuarios();

    @GET("/javaClothes/usuarios/{id}")
    Call<Usuario> getUsuarioById(@Path("id") String id);

    @POST("/javaClothes/usuarios")
    Call<Usuario> createUsuario(@Body Usuario usuario);
    
    @POST("/javaClothes/usuarios/login")
    Call<Usuario> loginUsuario(@Body UsuarioLoginDTO usuarioLogin);

    @PUT("/javaClothes/usuarios/{id}")
    Call<Usuario> updateUsuario(@Path("id") String id, @Body Usuario usuario);

    @DELETE("/javaClothes/usuarios/{id}")
    Call<Void> deleteUsuario(@Path("id") String id);

    @GET("/javaClothes/usuarios/buscar")
    Call<List<Usuario>> buscarUsuarios(
        @Query("nombre") String nombre,
        @Query("email") String email,
        @Query("edad") int edad
    );

    @GET("/javaClothes/usuarios/auth")
    Call<Usuario> getUserByToken(@Header("Authorization") String authToken);
    
}
