package clienteApi;

import java.io.IOException;
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
    private static final String BASE_URL = "http://localhost:8080";
     private static NotificacionApiService notiApiService;

    public NotificacionCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        notiApiService = retrofit.create(NotificacionApiService.class);

    }

//    // crear notificación
//    public void createNotificacion(Notificacion notificacion) {
//        try {
//            Response<Notificacion> response = notiApiService.createNotificacion(notificacion).execute();
//            if (response.isSuccessful()) {
//                System.out.println("Notificación creada: " + response.body());
//            } else {
//                System.out.println("Error al crear notificación: " + response.code());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

