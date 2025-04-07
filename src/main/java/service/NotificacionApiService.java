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
    Call<List<Notificacion>> getAllNotificaciones();

    @GET("/api/notificaciones/{id}")
    Call<Notificacion> getNotificacionById(@Path("id") String id);
    
    @GET("/api/notificaciones/{id}")
    Call<Notificacion> getNotificacionByCliente(@Path("id") String id); 

    @POST("/api/notificaciones")
    Call<Notificacion> createNotificacion(@Body Notificacion notificacion);

    @PUT("/api/notificaciones/{id}")
    Call<Notificacion> updateNotificacion(@Path("id") String idNotificacion, @Body Notificacion notificacion);

    @DELETE("/api/notificaciones/{id}")
    Call<Void> deleteNotificacion(@Path("id") String id);

}
