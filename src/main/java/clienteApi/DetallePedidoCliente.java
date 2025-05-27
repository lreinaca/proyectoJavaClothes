package clienteApi;

import dto.DetallePedidoClienteDTO;
import java.util.List;
import modelo.DetallePedido;
import modelo.Pedido;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.DetallePedidoApiService;

/**
 *
 * @author Rossi
 */
public class DetallePedidoCliente {

    private static final String BASE_URL = "https://proyectoeam.onrender.com";
    private static DetallePedidoApiService detalleApiService;

    public DetallePedidoCliente() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        detalleApiService = retrofit.create(DetallePedidoApiService.class);

    }

    // metodo crear detalle pedido
    public void createDetallePedido(DetallePedido detallePedido) throws Exception {
        Response<DetallePedido> response = detalleApiService.createDetallePedido(detallePedido).execute();
        if (response.isSuccessful()) {
            DetallePedido detalleCreado = response.body();
            System.out.println("Detalle de pedido creado: " + response.body());
        } else {
            System.out.println("Error al crear detalle de pedido: " + response.code());
            throw new Exception("Error al crear el detalle de pedido");
        }
    }

    //obetener detalle pedido por id
    public DetallePedido getDetallesByPedidoId(String id) throws Exception {
        Response<DetallePedido> response = detalleApiService.getDetallesByPedidoId(id).execute();
        if (response.isSuccessful()) {
            DetallePedido detalle = response.body();
            System.out.println("Detalle de pedido encontrado: " + response.body());
            return detalle;
        } else {
            System.out.println("Error al obtener detalle de pedido: " + response.code());
            throw new Exception("Error al obtener el detalle de pedido");
        }
    }

    // metodo actualizar detalle pedido
    public void updateDetallePedido(String idDetalle, Pedido pedido) throws Exception {
        Response<DetallePedido> response = detalleApiService.updateDetallePedido(idDetalle, pedido).execute();
        if (response.isSuccessful()) {
            DetallePedido detalleActualizado = response.body();
            System.out.println("Detalle de pedido actualizado: " + response.body());
        } else {
            System.out.println("Error al actualizar detalle de pedido: " + response.code());
            throw new Exception("Error al actualizar el detalle de pedido");
        }
    }
    
     // METODO PARA ENCONTRAR LOS DETALLES DEL PEDIDO POR EL ID DEL USUARIO 
    public List<DetallePedidoClienteDTO> getDetallesPedidoByUsuarioID(Integer idUsuario) throws Exception {
        Response<List<DetallePedidoClienteDTO>> response = detalleApiService.getAllDetallePedidoByUsuarioID(idUsuario).execute();
        if (response.isSuccessful()) {
            List<DetallePedidoClienteDTO> detallePedido = response.body();
            return detallePedido;
        } else {
            System.out.println("Error: " + response.code());
            throw new Exception("Error en el cargue de Información de Detalle Pedido");
        }
    }

}
