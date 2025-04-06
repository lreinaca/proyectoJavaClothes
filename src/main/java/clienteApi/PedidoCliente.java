package clienteApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.PedidoApiService;

/**
 *
 * @author Rossi
 */
public class PedidoCliente {

    private static final String BASE_URL = "http://localhost:8080";
    private static PedidoApiService pedidoApiService;

    public PedidoCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        pedidoApiService = retrofit.create(PedidoApiService.class);

    }
}
