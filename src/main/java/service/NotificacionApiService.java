package service;

import java.util.List;

import modelo.Notificacion;
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
 * @author Rossi
 */
public interface NotificacionApiService {
    
    
    @GET("/api/notificaciones")
    Call<List<Usuario>> getAllNotificaciones();

    @GET("/api/notificaciones/{id}")
    Call<Usuario> getNotificacionById(@Path("id") String id);
    
    @GET("/api/notificaciones/{id}")
    Call<Usuario> getNotificacionByCliente(@Path("id") String id); 

    @POST("/api/notificaciones")
    Call<Usuario> createNotificacion(@Body Notificacion notificacion);

    @PUT("/api/notificaciones/{id}")
    Call<Usuario> updateNotificacion(@Path("id") String idNotificacion, @Body Notificacion notificacion);

    @DELETE("/api/notificaciones/{id}")
    Call<Void> deleteNotificacion(@Path("id") String id);

}
