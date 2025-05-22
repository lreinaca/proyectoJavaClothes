
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

/**
 *
 * @author lreinac
 */
public interface UsuarioApiService {
    @GET("/api/usuarios")
    Call<List<Usuario>> getAllUsuarios();

    @GET("/api/usuarios/{id}")
    Call<Usuario> getUsuarioById(@Path("id") Integer id , @Header("Authorization") String token);

    @POST("/api/usuarios")
    Call<Usuario> createUsuario(@Body Usuario usuario);
    
    @POST("/api/usuarios/login")
    Call<UsuarioLoginDTO> loginUsuario(@Body UsuarioLoginDTO usuarioLogin);

    @PUT("/api/usuarios/{id}")
    Call<Usuario> updateUsuario(@Path("id") Integer id, @Body Usuario usuario);

    @DELETE("/api/usuarios/{id}")
    Call<Void> deleteUsuario(@Path("id") Integer id);

    /*
    @GET("/api/usuarios/buscar")
    Call<List<Usuario>> buscarUsuarios(
        @Query("nombre") String nombre,
        @Query("email") String email,
        @Query("edad") int edad
    ); */
    
}
