package clienteApi;

import java.util.List;

import modelo.Notificacion;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.NotificacionApiService;

/**
 *
 * @author Rossi
 */
public class NotificacionCliente {

    private static final String BASE_URL = "https://proyectoeam.onrender.com";
    private static NotificacionApiService notiApiService;

    public NotificacionCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        notiApiService = retrofit.create(NotificacionApiService.class);

    }

    //obtener todas las notis
    public List<Notificacion> getAllNotificaciones() throws Exception {
        Response<List<Notificacion>> response = notiApiService.getAllNotificaciones().execute();
        if (response.isSuccessful()) {
            List<Notificacion> notificaciones = response.body();
            System.out.println("Lista de notificaciones: " + notificaciones);
            return notificaciones;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Error al obtener la lista de notificaciones");
        }
    }

    // crear notificación
    public Notificacion createNotificacion(Notificacion notificacion) throws Exception {
        Response<Notificacion> response = notiApiService.createNotificacion(notificacion).execute();
        if (response.isSuccessful()) {
            Notificacion notiACrear = response.body();
            System.out.println("Notificación creada: " + response.body());
            return notiACrear;
        } else {
            System.out.println("Error al crear notificación: " + response.code());
            throw new Exception("Error al actualizar la notificación"); //preguntaar
        }
    }

    // obtener notificación por id
    public Notificacion getNotificacionById(String id) throws Exception {
        Response<Notificacion> response = notiApiService.getNotificacionById(id).execute();
        if (response.isSuccessful()) {
            Notificacion notificacion = response.body();
            System.out.println("Notificacion encontrada: " + notificacion);
            return notificacion;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Notificacion no encontrada");
        }
    }

    //obtener noti por cliente
    public Notificacion getNotificacionByCliente(String id) throws Exception {
        Response<Notificacion> response = notiApiService.getNotificacionById(id).execute();
        if (response.isSuccessful()) {
            Notificacion notificacion = response.body();
            System.out.println("Notificacion encontrada: " + notificacion);
            return notificacion;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Notificacion no encontrada");
        }
    }

    //actualizar notificación
    public Notificacion updateNotificacion(Notificacion notificacionActual) throws Exception {
        Response<Notificacion> response = notiApiService.updateNotificacion(notificacionActual.getIdNotificacion(), notificacionActual).execute();
        if (response.isSuccessful()) {
            Notificacion notiActualizada = response.body();
            System.out.println("Notificación actualizada: " + notiActualizada);
            return notiActualizada;
        } else {
            System.out.println("Error al actualizar la notificación. Código: " + response.code());
            throw new Exception("Error al actualizar la notificación");
        }
    }

    //eliminar noti por id
    public void deleteNotificacion(String idNoti) throws Exception {
        Response<Void> response = notiApiService.deleteNotificacion(idNoti).execute();
        if (response.isSuccessful()) {
            System.out.println("Notificación eliminada correctamente.");
        } else {
            System.out.println("Error al eliminar la notificación. Código: " + response.code());
            throw new Exception("La notificación no pudo ser eliminada.");
        }
    }
}
