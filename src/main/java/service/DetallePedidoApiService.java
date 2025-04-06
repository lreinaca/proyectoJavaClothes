package service;

import modelo.DetallePedido;
import modelo.Pedido;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 *
 * @author Rossi
 */

public interface DetallePedidoApiService {

    @GET("/javaClothes/pedidos/{id}")
    Call<DetallePedido> getDetallesByPedidoId(@Path("idPedido") String idPedido);

    @POST("/javaClothes/pedidos")
    Call<DetallePedido> createDetallePedido(@Body DetallePedido detallePedido);
    
    @PUT("/javaClothes/pedidos/{id}")
    Call<DetallePedido> updateDetallePedido(@Path("id") String idDetalle, @Body Pedido pedido);
}

    