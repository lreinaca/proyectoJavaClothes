package clienteApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.DetallePedidoApiService;

/**
 *
 * @author Rossi
 */
public class DetallePedidoCliente {
     private static final String BASE_URL = "http://localhost:8080";
     private static DetallePedidoApiService detalleApiService;

    public DetallePedidoCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        detalleApiService = retrofit.create(DetallePedidoApiService.class);

    }
}
