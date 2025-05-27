package service;

import java.util.List;
import modelo.Pedido;
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
 * @author Rossi
 */
public interface PedidoApiService {

    @GET("/api/pedidos")
    Call<List<Pedido>> getAllPedidos();

    @GET("/api/pedidos/{id}")
    Call<Pedido> getPedidoById(@Path("idPedido") String idPedido);

    @POST("/api/pedidos")
    Call<Pedido> createPedido(
            @Header("Authorization") String token);

    @PUT("/api/pedidos/{id}")
    Call<Pedido> updatePedido(@Path("idPedido") String idPedido, @Body Pedido pedido);

    @DELETE("/api/pedidos/{id}")
    Call<Void> deletePedido(@Path("idPedido") String idPedido);

}
